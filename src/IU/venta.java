package IU;

import BEAN.Cliente;
import BEAN.Producto;
import BEAN.cab_venta;
import BEAN.det_venta;
import DAO.cab_ventaDAO;
import DAO.clienteDAO;
import DAO.det_ventaDAO;
import UTIL.util;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class venta extends javax.swing.JInternalFrame {
    private int mdiH, mdiW;
    DefaultTableModel dtm1;
    DefaultTableModel dtm2;
    DefaultTableModel dtm3;
    cab_ventaDAO cabDAO;
    det_ventaDAO detDAO;
    int idVenta;
    
    public venta() {
        initComponents();
    }
    public venta(int mdiH, int mdiW){
        this.mdiH = mdiH;
        this.mdiW = mdiW;
        int slx, sly;
        sly = (mdiH/2)-(730/2);
        slx = (mdiW/2)-(598/2);
        this.setLocation(slx, sly);
        this.setResizable(false);
        initComponents();
        dtm1 = (DefaultTableModel)this.tblProdSel.getModel();
        dtm2 = (DefaultTableModel)this.tblClieBusq.getModel();
        dtm3 = (DefaultTableModel)this.tblVentaPas.getModel();
        cabDAO = new cab_ventaDAO();
        detDAO = new det_ventaDAO();
        
               
        
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtClieBusq = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblClieBusq = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblVentaPas = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtIdCliente = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        txtIdProducto = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdSel = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("MODULO DE VENTAS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(200, 20, 160, 17);

        jPanel5.setLayout(null);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccione un cliente"));
        jPanel7.setLayout(null);

        jLabel11.setText("Digite apellido o nombres");
        jPanel7.add(jLabel11);
        jLabel11.setBounds(10, 20, 130, 14);

        txtClieBusq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClieBusqKeyReleased(evt);
            }
        });
        jPanel7.add(txtClieBusq);
        txtClieBusq.setBounds(160, 20, 360, 20);

        tblClieBusq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_Cliente", "Apellidos", "Nombres", "Estado"
            }
        ));
        tblClieBusq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClieBusqMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblClieBusqMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(tblClieBusq);

        jPanel7.add(jScrollPane2);
        jScrollPane2.setBounds(10, 50, 510, 150);

        jPanel5.add(jPanel7);
        jPanel7.setBounds(10, 20, 540, 210);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccione una transacción realizada por el cliente seleccionado"));
        jPanel8.setLayout(null);

        tblVentaPas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_Venta", "Id_Cliente", "Fecha", "Estado"
            }
        ));
        tblVentaPas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVentaPasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblVentaPas);

        jPanel8.add(jScrollPane3);
        jScrollPane3.setBounds(10, 30, 520, 300);

        jPanel5.add(jPanel8);
        jPanel8.setBounds(10, 240, 540, 350);

        jTabbedPane1.addTab("Búsqueda", jPanel5);

        jPanel6.setLayout(null);

        jButton5.setText("Salir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton5);
        jButton5.setBounds(250, 560, 100, 23);

        btnGrabar.setText("Grabar");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });
        jPanel6.add(btnGrabar);
        btnGrabar.setBounds(120, 560, 100, 23);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("CLIENTE"));
        jPanel2.setLayout(null);

        jLabel2.setText("Apellidos");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 60, 60, 14);

        jLabel3.setText("Nombres");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 90, 60, 14);

        jLabel4.setText("Estado");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 120, 34, 14);

        jLabel5.setText("Id Cliente");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 30, 60, 14);

        txtEstado.setEnabled(false);
        jPanel2.add(txtEstado);
        txtEstado.setBounds(90, 120, 120, 20);

        txtApellidos.setEnabled(false);
        jPanel2.add(txtApellidos);
        txtApellidos.setBounds(90, 60, 410, 20);

        txtNombres.setEnabled(false);
        jPanel2.add(txtNombres);
        txtNombres.setBounds(90, 90, 410, 20);

        jButton1.setText("Seleccionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(230, 30, 160, 23);

        txtIdCliente.setEnabled(false);
        jPanel2.add(txtIdCliente);
        txtIdCliente.setBounds(90, 30, 120, 20);

        jPanel6.add(jPanel2);
        jPanel2.setBounds(20, 10, 540, 160);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("PRODUCTO"));
        jPanel3.setLayout(null);

        jLabel6.setText("Id Producto");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(20, 30, 70, 14);

        jLabel7.setText("Descripción");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(20, 60, 70, 14);

        jLabel8.setText("Tipo");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(20, 90, 50, 14);

        jLabel9.setText("Precio");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(270, 90, 60, 14);

        jLabel10.setText("Cantidad");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(20, 120, 60, 14);

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        jPanel3.add(txtCantidad);
        txtCantidad.setBounds(90, 120, 160, 20);

        txtIdProducto.setEnabled(false);
        txtIdProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProductoActionPerformed(evt);
            }
        });
        jPanel3.add(txtIdProducto);
        txtIdProducto.setBounds(90, 30, 120, 20);

        txtDescripcion.setEnabled(false);
        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });
        jPanel3.add(txtDescripcion);
        txtDescripcion.setBounds(90, 60, 430, 20);

        txtTipo.setEnabled(false);
        txtTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoActionPerformed(evt);
            }
        });
        jPanel3.add(txtTipo);
        txtTipo.setBounds(90, 90, 160, 20);

        txtPrecio.setEnabled(false);
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        jPanel3.add(txtPrecio);
        txtPrecio.setBounds(340, 90, 160, 20);

        jButton2.setText("Seleccionar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(230, 30, 160, 23);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel3.add(btnAgregar);
        btnAgregar.setBounds(370, 120, 120, 23);

        jPanel6.add(jPanel3);
        jPanel3.setBounds(20, 180, 540, 160);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("PRE SELECCIÓN"));
        jPanel4.setLayout(null);

        tblProdSel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Producto", "Descripción", "Tipo", "Precio", "Cantidad"
            }
        ));
        tblProdSel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProdSelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProdSel);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(10, 30, 510, 130);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel4.add(btnEliminar);
        btnEliminar.setBounds(409, 170, 110, 23);

        jPanel6.add(jPanel4);
        jPanel4.setBounds(20, 350, 540, 200);

        jButton4.setText("Limpiar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton4);
        jButton4.setBounds(380, 560, 100, 23);

        jTabbedPane1.addTab("Registros", jPanel6);

        jPanel1.add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 50, 570, 630);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Cliente clie;
        SelCliente dialog = new SelCliente(new javax.swing.JFrame(),true,mdiH,mdiW);
        dialog.setVisible(true);
        clie = dialog.devcliente();
        if(clie==null){
            this.txtIdCliente.setText("");
            this.txtApellidos.setText("");
            this.txtNombres.setText("");
            this.txtEstado.setText("");
        }else{
            this.txtIdCliente.setText(String.valueOf(clie.getId_cliente()));
            this.txtApellidos.setText(clie.getApellidos());
            this.txtNombres.setText(clie.getNombres());
            this.txtEstado.setText(String.valueOf(clie.getEstado()));
        }
                    
                             
    }//GEN-LAST:event_jButton1ActionPerformed
    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed
    private void txtIdProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProductoActionPerformed
    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed
    private void txtTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoActionPerformed
    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed
    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        cab_venta cv = new cab_venta();
        util u = new util();
        if(this.btnGrabar.getText().equals("Grabar")){
            idVenta = u.idNext("cab_venta", "Id_Venta");
            cv.setId_venta(idVenta);
            cv.setId_cliente(Integer.parseInt(this.txtIdCliente.getText()));
            cv.setFecha(u.obtenerFecha());
            cv.setEstado(1);
            this.cabDAO.procesaItem(cv, "insert");
            for(int i=0;i<dtm1.getRowCount();i++){
                det_venta dv = new det_venta();
                dv.setId_venta(idVenta);
                dv.setId_producto(Integer.parseInt(dtm1.getValueAt(i, 0).toString()));
                dv.setPrecio(Double.parseDouble(dtm1.getValueAt(i, 3).toString()));
                dv.setCantindad(Integer.parseInt(dtm1.getValueAt(i, 4).toString()));
                this.detDAO.procesaItem(dv, "insert");
            }
        }else if(this.btnGrabar.getText().equals("Actualizar")){
            
        }
        
    }//GEN-LAST:event_btnGrabarActionPerformed
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Producto prod;
        SelProducto dialog = new SelProducto(new javax.swing.JFrame(),true,mdiH,mdiW);
        dialog.setVisible(true);
        prod = dialog.devProducto();
        if(prod==null){
            this.txtIdProducto.setText("");
            this.txtDescripcion.setText("");
            this.txtTipo.setText("");
            this.txtPrecio.setText("");
            this.txtEstado.setText(""); 
        }else{
            this.txtIdProducto.setText(String.valueOf(prod.getId_producto()));
            this.txtDescripcion.setText(prod.getDescripcion());
            this.txtTipo.setText(prod.getTipo());
            this.txtPrecio.setText(String.valueOf(prod.getPrecio()));
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if(validProd()==true){
            Vector vecProd = new Vector();
            vecProd.addElement(this.txtIdProducto.getText());
            vecProd.addElement(this.txtDescripcion.getText());
            vecProd.addElement(this.txtTipo.getText());
            vecProd.addElement(this.txtPrecio.getText());
            vecProd.addElement(this.txtCantidad.getText());
            dtm1.addRow(vecProd);
            limpiaProd();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
    }//GEN-LAST:event_btnEliminarActionPerformed
    public void limpiaProd(){
        this.txtIdProducto.setText("");
        this.txtDescripcion.setText("");
        this.txtPrecio.setText("");
        this.txtCantidad.setText("");
        this.txtTipo.setText("");
    }
    public boolean validProd(){
        boolean sw = false;
        if(this.txtIdProducto.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Seleccione por lo menos un producto");
        }else if(this.txtCantidad.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe registrar la cantidad requerida");
        }else{
            try{
                Integer.parseInt(this.txtCantidad.getText());
                sw = true;
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Debe registrar un dato numerico");
                this.txtCantidad.setText("");
                e.printStackTrace();
            }
        }
        return sw;
    }
    
    
    private void tblClieBusqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClieBusqMouseClicked
    
    }//GEN-LAST:event_tblClieBusqMouseClicked

    private void tblVentaPasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVentaPasMouseClicked
    
    }//GEN-LAST:event_tblVentaPasMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtClieBusqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClieBusqKeyReleased
    
    }//GEN-LAST:event_txtClieBusqKeyReleased

    private void tblClieBusqMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClieBusqMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblClieBusqMouseEntered

    private void tblProdSelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdSelMouseClicked
        
        
         
    }//GEN-LAST:event_tblProdSelMouseClicked
    private void limpiaClieBusq(){
    
    }
    
    private void llenaTablaVentH(boolean swr, String cadr){
    
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblClieBusq;
    private javax.swing.JTable tblProdSel;
    private javax.swing.JTable tblVentaPas;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtClieBusq;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
