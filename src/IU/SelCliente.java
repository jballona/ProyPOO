package IU;

import BEAN.Cliente;
import DAO.clienteDAO;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class SelCliente extends javax.swing.JDialog {
    DefaultTableModel dtm;
    clienteDAO clieDAO;
    Cliente clie;
    public SelCliente(java.awt.Frame parent, boolean modal, int mdiH, int mdiW) {
        super(parent, modal);
        int slx,sly;
        initComponents();
        slx = (mdiW/2) - (400/2);
        sly = (mdiH/2) - (300/2);
        this.setSize(400, 300);
        this.setLocation(slx,sly);
        clieDAO = new clienteDAO();
        dtm = (DefaultTableModel)this.tblCliente.getModel();
        llenaCliente(false, "");
    }
    
    public void llenaCliente(boolean swr, String cad){
        Vector<Cliente> listCli = clieDAO.ListaItem(swr, cad);
        if(dtm.getRowCount()>0){
            dtm.setRowCount(0);  //Este método limpia el jtable cliente
        }
        for(int i=0;i<listCli.size();i++){
            Vector vClie = new Vector();
            vClie.add(0, listCli.get(i).getId_cliente());
            vClie.add(1, listCli.get(i).getApellidos());
            vClie.add(2, listCli.get(i).getNombres());
            vClie.add(3, listCli.get(i).getEstado());
            dtm.addRow(vClie);            
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("SELECCIONA CLIENTE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 10, 200, 30);

        jLabel2.setText("Búsqueda");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 60, 60, 14);

        txtCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClienteKeyReleased(evt);
            }
        });
        getContentPane().add(txtCliente);
        txtCliente.setBounds(80, 50, 310, 30);

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_Cliente", "Apellidos", "Nombres", "Estado"
            }
        ));
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCliente);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 90, 380, 190);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteKeyReleased
        if(this.txtCliente.getText().isEmpty()){
            llenaCliente(false, "");
        }else{
            llenaCliente(true, this.txtCliente.getText());
        }
    }//GEN-LAST:event_txtClienteKeyReleased

    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMouseClicked
        clie = new Cliente();
        int fila;
        fila = this.tblCliente.getSelectedRow();
        clie.setId_cliente(Integer.parseInt(dtm.getValueAt(fila, 0).toString()));
        clie.setApellidos(dtm.getValueAt(fila, 1).toString());
        clie.setNombres(dtm.getValueAt(fila, 2).toString());
        clie.setEstado(Integer.parseInt(dtm.getValueAt(fila, 3).toString()));
        this.dispose();
    }//GEN-LAST:event_tblClienteMouseClicked
    public Cliente devcliente(){
        return clie;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField txtCliente;
    // End of variables declaration//GEN-END:variables
}
