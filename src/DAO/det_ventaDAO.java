package DAO;

import BEAN.det_venta;
import UTIL.dbBean;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class det_ventaDAO {
        public Vector<det_venta> ListaItem(boolean sw, String str){
        Vector<det_venta> item = new Vector<det_venta>();
        dbBean con = new dbBean();
        String sql = "Select * from det_venta";
        if(sw == true){
            sql = sql + " WHERE (id_venta = '"+ str +"')";
        }
        System.out.println(sql);
        try{
            ResultSet resultado = con.execSQL(sql);

            while(resultado.next()){
                det_venta detVenta = new det_venta();
                detVenta.setId_venta(resultado.getInt(1));
                detVenta.setId_producto(resultado.getInt(2));
                detVenta.setPrecio(resultado.getDouble(3));
                detVenta.setCantindad(resultado.getInt(4));
                item.addElement(detVenta);
            }
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        try{
            con.close();
        }catch(SQLException e){}
        return item;
    }
    
    public void borraDeta(String idVe){
       int resultado=0;
       String sql= "";
       dbBean con=new dbBean();
       sql="delete from det_venta  WHERE (id_venta = "+ idVe +")";
       System.out.println("Del dv "+sql);
       try{
          resultado=con.updateSQL(sql);
        }
        catch(java.sql.SQLException e){e.printStackTrace();
        }
        try{
            con.close();
        }catch(SQLException e){
        }
        
    }
    public int procesaItem(det_venta dv, String proc){
       int resultado=0;
       String sql= "";
       dbBean con=new dbBean();
       System.out.println("ENTRE SUAVE");
       if(proc.equals("insert")){
            sql="INSERT INTO det_venta VALUES ("+ dv.getId_venta() +", "+ dv.getId_producto()+", "+ dv.getPrecio()+", "+ dv.getCantidad() +")";
            System.out.println("EVallll: "+sql);
       }
       if(proc.equals("update")){
            sql="UPDATE det_venta set id_producto  = '"+ dv.getId_producto() +"', precio = '"+ dv.getPrecio() +"', cantidad = '"+ dv.getCantidad() +"' where id_venta = '"+ dv.getId_venta() +"'";
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
