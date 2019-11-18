 package DAO;

import BEAN.usuario;
import UTIL.dbBean;
import java.sql.ResultSet;
import java.sql.SQLException;

public class loginDAO {
    public loginDAO() {
    }

    public static boolean consultaLogin(String u, String p){
        dbBean con = new dbBean();
        boolean bool = false;
        int nivel = 0;
        try{
            String sql = "select * from usuario where usuario = '"+ u +"' and pw = '"+ p +"'";
            ResultSet resultado = con.execSQL(sql);
            if(resultado.next()){
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
        return bool;
    }
}
