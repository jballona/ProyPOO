package IU;
import BEAN.personal;
import DAO.personalDAO;
import UTIL.util;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class mantePersonal extends javax.swing.JInternalFrame {
    personalDAO persdao;
    DefaultTableModel dtm;
    boolean sw = false;
    String cad = "";
    int idPers;

    /** Creates new form mantePersonal */
    public mantePersonal(int mdiH, int mdiW) {
        persdao = new personalDAO();
        int slx, sly, wd = mdiW, hd = mdiH;
        
        ///Centrando el internalFrame para una mejor visualizacion///
        this.setSize(386, 350);
        slx = (wd/2) - (386/2);
        sly = (hd/2) -(350/2);
        this.setLocation(slx, sly);
        this.setResizable(false);
        ///Centrando el internalFrame para una mejor visualizacion///

        
        initComponents();

        dtm=(DefaultTableModel)tblPersonal.getModel();
        llenaTabla(sw, cad);
    }

     private void llenaTabla(boolean swr, String cadr) {
         Vector<personal> persot = persdao.ListaItem(swr, cadr);
         int i =  persot.size();

         for(int j = 0; j<persot.size();j++){
            Vector vect = new Vector();
            vect.addElement(persot.get(j).getApellidos());
            vect.addElement(persot.get(j).getNombres());
            vect.addElement(persot.get(j).getEstado());
            vect.addElement(persot.get(j).getId_personal());
            dtm.addRow(vect);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersonal = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtBusq = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        txtApellidos = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        cmbEstado = new javax.swing.JComboBox();
        btnLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(null);

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        tblPersonal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Apellidos", "Nombres", "Estado", "Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPersonalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPersonal);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(0, 50, 330, 140);

        jLabel2.setText("Criterios de búsqueda:");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(10, 10, 120, 14);

        txtBusq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusqActionPerformed(evt);
            }
        });
        txtBusq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBusqKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusqKeyReleased(evt);
            }
        });
        jPanel3.add(txtBusq);
        txtBusq.setBounds(130, 10, 190, 20);

        jTabbedPane1.addTab("Busqueda", jPanel3);

        jPanel4.setLayout(null);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel5.setLayout(null);

        jLabel3.setText("Apellidos");
        jPanel5.add(jLabel3);
        jLabel3.setBounds(20, 20, 60, 14);

        jLabel4.setText("Nombres");
        jPanel5.add(jLabel4);
        jLabel4.setBounds(20, 50, 60, 14);

        jLabel5.setText("Estado");
        jPanel5.add(jLabel5);
        jLabel5.setBounds(20, 80, 60, 14);

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel5.add(btnRegistrar);
        btnRegistrar.setBounds(30, 120, 120, 23);

        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApellidosKeyPressed(evt);
            }
        });
        jPanel5.add(txtApellidos);
        txtApellidos.setBounds(90, 20, 220, 20);
        jPanel5.add(txtNombres);
        txtNombres.setBounds(90, 50, 220, 20);

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Activo", "Activo", "Anulado" }));
        jPanel5.add(cmbEstado);
        cmbEstado.setBounds(90, 80, 100, 20);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel5.add(btnLimpiar);
        btnLimpiar.setBounds(160, 120, 100, 23);

        jPanel4.add(jPanel5);
        jPanel5.setBounds(10, 10, 320, 170);

        jTabbedPane1.addTab("Mantenimiento", jPanel4);

        jPanel2.add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 40, 340, 220);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Mantenimiento de Personal");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 10, 340, 29);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalir);
        btnSalir.setBounds(250, 270, 100, 23);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 10, 360, 300);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtApellidosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyPressed
        ////
//        int keycode = evt.getKeyCode();
//        if(keycode == 10){
//            //this.txtNombres.setFocusable(closable);
//            System.out.println("el codigo esss para joseph " + keycode);
//
//            getFocusOwner().transferFocus();
//        }
        ////
        if(evt.getKeyCode()==evt.VK_ENTER){
            getFocusOwner().transferFocus();
        }


    }//GEN-LAST:event_txtApellidosKeyPressed

    private void txtBusqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusqKeyReleased
        LimpiaTabla();
        boolean swt;
        String x = txtBusq.getText();
        if(x.isEmpty()){
            swt = false;
        }else{
            swt = true;
        }
        llenaTabla(swt, x);
}//GEN-LAST:event_txtBusqKeyReleased

    private void txtBusqKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusqKeyPressed
        // TODO add your handling code here:
}//GEN-LAST:event_txtBusqKeyPressed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged

    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void tblPersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPersonalMouseClicked
        if(evt.getClickCount()==1){
            jTabbedPane1.setSelectedIndex(1);
            llenaModifica();
        }
    }//GEN-LAST:event_tblPersonalMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        limpiaControl();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        //System.exit(0);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String proc = btnRegistrar.getText();
        int id = 0, est;
        String pr= "";
        if(valida() == true){
            util u = new util();
            personal p = new personal();
            est = u.estados(this.cmbEstado.getSelectedItem().toString());
            System.out.println("Codificación de estado sirve para todo tipo de estados:  "+est);
            p.setApellidos(txtApellidos.getText());
            p.setNombres(this.txtNombres.getText());
            p.setEstado(est);
            if (proc.equals("Registrar")){
                id = u.idNext("personal", "id_personal");
                pr = "insert";
            }
            if(proc.equals("Actualizar")){
                id = idPers;
                pr = "update";
            }
            p.setId_personal(id);
            persdao.procesaItem(p, pr);
            limpiaControles();
            LimpiaTabla();
            llenaTabla(false, "");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtBusqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusqActionPerformed
    private void limpiaControl(){
        txtApellidos.setText("");
        txtNombres.setText("");
        cmbEstado.setSelectedIndex(0);
        btnRegistrar.setText("Registrar");
        txtApellidos.requestFocus();
    }
    private boolean valida(){
        boolean sw = false;
        if(txtApellidos.getText().equals("")){
            sw = false;
            JOptionPane.showMessageDialog(this, "Debe registrar APELLIDOS del personal","Módulo de aplicación PERSONAL",JOptionPane.ERROR_MESSAGE);
            txtApellidos.requestFocusInWindow();
        }else{

            if(txtNombres.getText().equals("")){
                sw = false;
                JOptionPane.showMessageDialog(this, "Debe registrar NOMBRES del personal","Módulo de aplicación PERSONAL",JOptionPane.ERROR_MESSAGE);
                txtNombres.requestFocusInWindow();
            }else{
                sw = true;
            }
        }
        return sw;
    }

    private void limpiaControles(){
        txtApellidos.setText("");
        txtNombres.setText("");
        txtBusq.setText("");
        cmbEstado.setSelectedIndex(0);
        btnRegistrar.setText("Registrar");
        txtApellidos.requestFocus(true);
    }

    private void llenaModifica(){
        int est;
        String cadX;
        int fila = tblPersonal.getSelectedRow();
        txtApellidos.setText(((String)dtm.getValueAt(fila, 0)).trim());
        txtNombres.setText(((String)dtm.getValueAt(fila, 1)).trim());
        this.cmbEstado.setSelectedIndex(Integer.parseInt((dtm.getValueAt(fila, 2)).toString().trim()));
        idPers = Integer.parseInt((dtm.getValueAt(fila, 3)).toString().trim());
        btnRegistrar.setText("Actualizar");
    }

    public void LimpiaTabla(){
    DefaultTableModel dm=(DefaultTableModel)tblPersonal.getModel();
    if(dm.getRowCount()>0){
        while(dm.getRowCount()>0){
            dm.removeRow(dm.getRowCount()-1);
        }
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cmbEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblPersonal;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtBusq;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables

}
