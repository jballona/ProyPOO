package DAO;

import BEAN.usuario;
import UTIL.dbBean;
import java.util.Vector;
import java.sql.ResultSet;
import java.sql.SQLException;


public class usuarioDAO {
    public usuarioDAO(){
    }
    public Vector<usuario> consultaLogin(String usu){
        dbBean con = new dbBean();
        boolean bool = false;
        Vector<usuario> usuario = new Vector<usuario>();
        String datos = "";
        try{
            String sql = "SELECT id_usr, id_personal, usuario, pw, usr_reg, fech_reg, usr_mod, fech_mod, estado FROM usuario WHERE (usuario = '"+usu+"') AND (estado = 1)";
            ResultSet resultado = con.execSQL(sql);
            while(resultado.next()){
                usuario user = new usuario();
                user.setId_usr(resultado.getInt(1));
                user.setId_personal(resultado.getInt(2));
                user.setUsuario(resultado.getString(3));
                user.setPw(resultado.getString(4));
                user.setUsr_reg(resultado.getString(5));
                user.setFech_reg(resultado.getString(6));
                user.setUsr_mod(resultado.getString(7));
                user.setFech_mod(resultado.getString(8));
                user.setEstado(resultado.getInt(9));
                usuario.addElement(user);
                bool = true;
            }

        }catch(Exception e){
            e.printStackTrace();
            bool = false;
        }
        try{
            con.close();
        }catch(SQLException e){
        }
        return usuario;
    }
}