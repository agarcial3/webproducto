/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author gamag
 */
abstract class Producto {

    String Producto;
    String Descripcion;
    String Precio_costo;
    private String Precio_venta;
    public Producto(){}
    public Producto(String Producto, String Descripcion, String Precio_costo, String Precio_venta) {
        this.Producto = Producto;
        this.Descripcion = Descripcion;
        this.Precio_costo = Precio_costo;
        this.Precio_venta = Precio_venta;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getPrecio_costo() {
        return Precio_costo;
    }

    public void setPrecio_costo(String Precio_costo) {
        this.Precio_costo = Precio_costo;
    }

    public String getPrecio_venta() {
        return Precio_venta;
    }

    public void setPrecio_venta(String Precio_venta) {
        this.Precio_venta = Precio_venta;
    }
    public void agregar (){}
    public void modificar(){}
    public void elimar (){}
    public void mostrar (){}
}
