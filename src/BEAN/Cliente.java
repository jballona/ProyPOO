
package BEAN;

public class Cliente {
    
private int id_cliente;
private String apellidos;
private String nombres;
private int estado;
public Cliente(){

}
    public Cliente(int id_cliente, String apellidos, String nombres, int estado) {
        this.id_cliente = id_cliente;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.estado = estado;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
}
