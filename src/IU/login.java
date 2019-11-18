package IU;

import BEAN.usuario;
import DAO.loginDAO;
import DAO.usuarioDAO;
import java.awt.*;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {
    usuarioDAO userDAO = null;
    usuario user;

    public login() {
        user = new usuario();
        userDAO = new usuarioDAO();       
        initComponents();

        int wd, hd, slx, sly;
        Toolkit toolkit =  Toolkit.getDefaultToolkit ();
        Dimension dim = toolkit.getScreenSize();
        wd = dim.width;
        hd = dim.height;
        this.setSize(400, 180);
        slx = (wd/2) - (400/2);
        sly = (hd/2) -(180/2);
        this.setLocation(slx, sly);
        this.setResizable(false);
        this.txtPw.setText("123456789");
        this.txtUser.setText("lparedes");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPw = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel1.setText("Usuario");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(150, 50, 70, 14);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel2.setText("Contraseña");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(150, 80, 70, 14);

        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserKeyPressed(evt);
            }
        });
        jPanel1.add(txtUser);
        txtUser.setBounds(220, 50, 140, 20);

        txtPw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPwKeyPressed(evt);
            }
        });
        jPanel1.add(txtPw);
        txtPw.setBounds(220, 80, 140, 20);

        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(60, 110, 100, 23);

        jButton2.setText("Cancelar");
        jPanel1.add(jButton2);
        jButton2.setBounds(200, 110, 100, 23);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("VALIDACIÓN DE USUARIO");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 10, 370, 29);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        doit();
    }//GEN-LAST:event_jButton1ActionPerformed
    private void doit(){
        //System.out.println("El evento del boton erika " + evt);
        String usr = this.txtUser.getText();
        String pw = this.txtPw.getText();

        boolean sw = consultarLogin(usr, pw);
        if (sw != true){
            JOptionPane.showOptionDialog(this, "Usuario o pw incorrecto","Login",JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,null,null,null);
            this.txtPw.setText("");
            this.txtPw.setText("");
            this.txtUser.setFocusable(true);
        }else{
            this.dispose();
            Vector<usuario> userVal = userDAO.consultaLogin(usr);
            if(userVal.size() == 1){
                mdiPrincipal principal  = new mdiPrincipal();
                user.setId_usr(userVal.get(0).getId_usr());
                user.setUsuario(userVal.get(0).getUsuario());
                user.setEstado(userVal.get(0).getEstado());
                user.setId_personal(userVal.get(0).getId_personal());
                user.setFech_reg(userVal.get(0).getFech_reg());
                principal.setUsuario(user);
                //principal.iniciar_User(user);
                principal.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(this, "Existe usuarios duplicados - Contáctese con administradores del sistema", "Mantenimiento Dispositivo", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    private void txtUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyPressed
        if(evt.getKeyCode()==evt.VK_ENTER){
            getFocusOwner().transferFocus();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserKeyPressed

    private void txtPwKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPwKeyPressed
        if(evt.getKeyCode()==evt.VK_ENTER){
            getFocusOwner().transferFocus();
        }
    }//GEN-LAST:event_txtPwKeyPressed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        if(evt.getKeyCode()==evt.VK_ENTER){
            doit();
        }


    }//GEN-LAST:event_jButton1KeyPressed

    public boolean consultarLogin(String usr, String pw){
        boolean ret = false;
        ret = loginDAO.consultaLogin(usr, pw);
        return ret;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtPw;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

}
