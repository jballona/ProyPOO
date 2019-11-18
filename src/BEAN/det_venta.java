package BEAN;
public class det_venta {
    private int id_venta;
    private int id_producto;
    private double precio;
    private int cantidad;

    public det_venta() {
    }
    public det_venta(int id_venta, int id_producto, double precio, int cantindad) {
        this.id_venta = id_venta;
        this.id_producto = id_producto;
        this.precio = precio;
        this.cantidad = cantindad;
    }
    public int getId_venta() {
        return id_venta;
    }
    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }
    public int getId_producto() {
        return id_producto;
    }
    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantindad(int cantidad) {
        this.cantidad = cantidad;
    }
}
