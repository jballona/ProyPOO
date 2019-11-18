package BEAN;
public class usuario {
    private int id_usr;
    private int id_personal;
    private String usuario;
    private String pw;
    private String usr_reg;
    private String fech_reg;
    private String usr_mod;
    private String fech_mod;
    private int estado;
    public usuario(){
    }
    public usuario(int id_usr, int id_personal, String usuario, String pw, String usr_reg, String fech_reg, String usr_mod, String fech_mod, int estado) {
        this.id_usr = id_usr;
        this.id_personal = id_personal;
        this.usuario = usuario;
        this.pw = pw;
        this.usr_reg = usr_reg;
        this.fech_reg = fech_reg;
        this.usr_mod = usr_mod;
        this.fech_mod = fech_mod;
        this.estado = estado;
    }
    public int getEstado() {
        return estado;
    }
    public void setEstado(int estado) {
        this.estado = estado;
    }
    public String getFech_mod() {
        return fech_mod;
    }
    public void setFech_mod(String fech_mod) {
        this.fech_mod = fech_mod;
    }
    public String getFech_reg() {
        return fech_reg;
    }
    public void setFech_reg(String fech_reg) {
        this.fech_reg = fech_reg;
    }
    public int getId_personal() {
        return id_personal;
    }
    public void setId_personal(int id_personal) {
        this.id_personal = id_personal;
    }
    public int getId_usr() {
        return id_usr;
    }
    public void setId_usr(int id_usr) {
        this.id_usr = id_usr;
    }
    public String getPw() {
        return pw;
    }
    public void setPw(String pw) {
        this.pw = pw;
    }
    public String getUsr_mod() {
        return usr_mod;
    }
    public void setUsr_mod(String usr_mod) {
        this.usr_mod = usr_mod;
    }

    public String getUsr_reg() {
        return usr_reg;
    }
    public void setUsr_reg(String usr_reg) {
        this.usr_reg = usr_reg;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
