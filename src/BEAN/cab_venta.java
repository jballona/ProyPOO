package BEAN;

public class cab_venta {
    private int id_venta;
    private int id_cliente;
    private String fecha;
    private int estado;

    public cab_venta(int id_venta, int id_cliente, String fecha, int estado) {
        this.id_venta = id_venta;
        this.id_cliente = id_cliente;
        this.fecha = fecha;
        this.estado = estado;
    }

    public cab_venta() {
    }
    

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
}
