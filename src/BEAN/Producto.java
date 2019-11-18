package BEAN;
public class Producto {
    private int id_producto;
    private String descripcion;
    private String tipo;
    private double precio;
    private int estado;

    public Producto(int id_producto, String descripcion, String tipo, double precio, int estado) {
        this.id_producto = id_producto;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.precio = precio;
        this.estado = estado;
    }

    public Producto() {
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
    
}
