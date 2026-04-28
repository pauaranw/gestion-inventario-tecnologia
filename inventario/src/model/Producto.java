package model;

public class Producto {
    private int codigo;
    private String descripcion;
    private int cantidad;
    private int precio;
    private String ubicacion;

    //Constructores
    public Producto(int codigo, String descripcion, int cantidad, int precio, String ubicacion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
        this.ubicacion = ubicacion;
    }

    //Metodos
    public void restarStock (int cantidad){
        this.cantidad -= cantidad;
    }

    public void sumarStock (int cantidad){
        this.cantidad += cantidad;
    }

    // Getters and Setters

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }


}
