package DAO;

import BEAN.cab_venta;
import UTIL.dbBean;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class cab_ventaDAO {
    public Vector<cab_venta> ListaItem(boolean sw, String str){
        Vector<cab_venta> item = new Vector<cab_venta>();
        dbBean con = new dbBean();
        String sql = "Select * from cab_venta";
        if(sw == true){
            sql = sql + " WHERE (id_cliente = '"+ str +"')";
        }
        System.out.println(sql);
        try{
            ResultSet resultado = con.execSQL(sql);

            while(resultado.next()){
                cab_venta cabVenta = new cab_venta();
                cabVenta.setId_venta(resultado.getInt(1));
                cabVenta.setId_cliente(resultado.getInt(2));
                cabVenta.setFecha(resultado.getString(3));
                cabVenta.setEstado(resultado.getInt(4));
                item.addElement(cabVenta);
            }
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        try{
            con.close();
        }catch(SQLException e){}
        return item;
    }
    
    public int procesaItem(cab_venta cv, String proc){
       int resultado=0;
       String sql= "";
       dbBean con=new dbBean();
       if(proc.equals("insert")){
            sql="INSERT INTO cab_venta VALUES ('"+ cv.getId_venta() +"', '"+ cv.getId_cliente() +"', '"+ cv.getFecha() +"', '"+ cv.getEstado() +"')";
            System.out.println("uuuuuuu" + sql);
       }
       if(proc.equals("update")){
            sql="UPDATE cab_venta set fecha  = '"+ cv.getFecha() +"', id_cliente = '"+ cv.getId_cliente() +"', estado = '"+ cv.getEstado() +"' where id_venta = '"+ cv.getId_venta() +"'";
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
