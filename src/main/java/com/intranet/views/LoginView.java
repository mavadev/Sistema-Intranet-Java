package com.intranet.views;

import com.formdev.flatlaf.intellijthemes.FlatArcOrangeIJTheme;
import com.intranet.app.AppContext;
import com.intranet.models.Usuario;
import com.intranet.utils.AlertUtils;
import com.intranet.utils.Validador;

public class LoginView extends javax.swing.JFrame {

    public LoginView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        panelBg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelLogin = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtLoginCorreo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtLoginContraseña = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        redirectRegistro = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new java.awt.GridLayout(1, 2));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gianmarco Chistama\\Downloads\\image-1.jpg")); // NOI18N

        javax.swing.GroupLayout panelBgLayout = new javax.swing.GroupLayout(panelBg);
        panelBg.setLayout(panelBgLayout);
        panelBgLayout.setHorizontalGroup(
            panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, Short.MAX_VALUE)
        );
        panelBgLayout.setVerticalGroup(
            panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, Short.MAX_VALUE)
        );

        background.add(panelBg);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Iniciar Sesiòn");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Correo electrònico");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Contraseña");

        redirectRegistro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        redirectRegistro.setText("¿Olvidaste tu contraseña?");
        redirectRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                redirectRegistroMouseClicked(evt);
            }
        });

        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogin.setText("INGRESAR");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(redirectRegistro)
                    .addComponent(jLabel4)
                    .addComponent(txtLoginContraseña)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(txtLoginCorreo)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel2)
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLoginCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLoginContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(redirectRegistro)
                .addGap(31, 31, 31)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        background.add(panelLogin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1036, 649));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void redirectRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redirectRegistroMouseClicked
        RegisterView registerView = new RegisterView();
        this.setVisible(false);
        registerView.setVisible(true);
    }//GEN-LAST:event_redirectRegistroMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // Obtener valores de formulario
        String correo = txtLoginCorreo.getText();
        String password = txtLoginContraseña.getText();
        
        // Validacion de valores ingresados
        if (correo.isEmpty() || password.isEmpty()) {
            AlertUtils.showWarning("Todos los campos son obligatorios");
        } else if (!Validador.esCorreoValido(correo)) {
            AlertUtils.showWarning("Correo electrónico no válido");
        } else if (!Validador.esPasswordValido(password)) {
            AlertUtils.showWarning("La contraseña debe tener al menos 8 caracteres");
        } else {
            // Obtener resultado de autenticar usuario
            Usuario usuario = AppContext.getUsuarioController().login(correo, password);
            
            // En caso encuentre el usuario
            if(usuario != null){
                AlertUtils.showSuccess("Bienvenido "+ usuario.getNombre()+"!");
            } 
            // Si no encuentra el usuario
            else {
                AlertUtils.showMessage("Usuario no encontrado");
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatArcOrangeIJTheme.setup();
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel panelBg;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JLabel redirectRegistro;
    private javax.swing.JTextField txtLoginContraseña;
    private javax.swing.JTextField txtLoginCorreo;
    // End of variables declaration//GEN-END:variables
}
