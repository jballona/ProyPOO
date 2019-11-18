package BEAN;
public class personal {

private int id_personal;
private String apellidos;
private String nombres;
private int estado;
public personal(){

}
    public personal(int id_personal, String apellidos, String nombres, int estado) {
        this.id_personal = id_personal;
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

    public int getId_personal() {
        return id_personal;
    }

    public void setId_personal(int id_personal) {
        this.id_personal = id_personal;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }




}
