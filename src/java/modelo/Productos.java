/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.sql.PreparedStatement;
/**
 *
 * @author gamag
 */
public class Productos extends Producto {
    private String IdProducto;
    private String IdMarca;
    Conexion cn;

    public Productos() {
    }

    public Productos(String IdProducto, String IdMarca, String Producto, String Descripcion, String Precio_costo, String Precio_venta) {
        super(Producto, Descripcion, Precio_costo, Precio_venta);
        this.IdProducto = IdProducto;
        this.IdMarca = IdMarca;
    }

    public Productos(String parameter, String parameter0, String parameter1, String parameter2, String string, String parameter3, String parameter4) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(String IdProducto) {
        this.IdProducto = IdProducto;
    }

    public String getIdMarca() {
        return IdMarca;
    }

    public void setIdMarca(String IdMarca) {
        this.IdMarca = IdMarca;
    }
    
    
    public HashMap drop_marca(){
    HashMap<String,String> drop =new HashMap();
        try{
            cn= new Conexion();
            String query ="select idmarca as id_marca,marca from marcas;";
            cn.abrir_conexion();
            ResultSet consulta = cn.conexionBD.createStatement().executeQuery(query);
            while(consulta.next()){
                drop.put(consulta.getString("idmarca"),consulta.getString("marca"));
                
            }
            cn.cerrar_conexion();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return drop ;
    
    }
    
    
    @Override
    public void agregar(){
    
       try{
           PreparedStatement parametro;
           cn= new Conexion();
           String query= "INSERT INTO productos(IdProducto,Producto,IdMarca,Descripcion,Precio_costo,Precio_venta,Existencia) VALUES(?,?,?,?,?,?,?);";
           cn.abrir_conexion();
           parametro =(PreparedStatement)cn.conexionBD.prepareStatement(query);
           parametro.setString(1,getIdProducto());
           parametro.setString(2,getProducto());
           parametro.setInt(3,this.getIdmarca());
           parametro.setString(4,getDescripcion());
           parametro.setFloat(5,0);
           parametro.setFloat(6, 0);
           parametro.setInt(7,this.getExistencia());
           cn.cerrar_conexion();
       
       } catch (Exception ex){
           System.out.println(ex.getMessage());
       
       }
       
    
    
    }

    private int getIdmarca() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int getExistencia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        
  
}
