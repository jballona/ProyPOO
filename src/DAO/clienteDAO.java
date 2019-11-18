package DAO;

import BEAN.Cliente;
import UTIL.dbBean;
import java.sql.*;
import java.util.Vector;

public class clienteDAO {

    public clienteDAO() {
    }
    
    
    public Vector<Cliente> ListaItem(boolean sw, String str){
        Vector<Cliente> item = new Vector<Cliente>();
        dbBean con = new dbBean();
        String sql = "Select * from cliente";
        if(sw == true){
            sql = sql + " WHERE (apellidos LIKE '"+ str +"%') OR (nombres LIKE '" + str + "%')";
        }
        System.out.println(sql);
        try{
            ResultSet resultado = con.execSQL(sql);

            while(resultado.next()){
                Cliente cliente = new Cliente();
                cliente.setId_cliente(resultado.getInt(1));
                cliente.setApellidos(resultado.getString(2));
                cliente.setNombres(resultado.getString(3));
                cliente.setEstado(resultado.getInt(4));
                item.addElement(cliente);
            }
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        try{
            con.close();
        }catch(SQLException e){}

        return item;
    }
    public int procesaItem(Cliente c, String proc){
       int resultado=0;
       String sql= "";
       dbBean con=new dbBean();
       if(proc.equals("insert")){
            sql="INSERT INTO cliente VALUES ('"+ c.getId_cliente() +"', '"+ c.getApellidos() +"', '"+ c.getNombres() +"', '"+ c.getEstado() +"')";
            System.out.println("uuuuuuu" + sql);
       }
       if(proc.equals("update")){
            sql="UPDATE cliente set apellidos = '"+ c.getApellidos() +"', nombres = '"+ c.getNombres() +"', estado = '"+ c.getEstado() +"' where id_cliente = '"+ c.getId_cliente() +"'";
       }
       System.out.println("Observando el estado de la sentencia sql: "+sql);

       try{
          resultado=con.updateSQL(sql);
        }
        catch(java.sql.SQLException e){e.printStackTrace();
        }
        try{
        con.close();
        }
        catch(SQLException e){
        }
          return resultado;
      }
}
