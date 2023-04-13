/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;

/**
 *
 * @author COMPUTER
 */
public class Login extends javax.swing.JFrame {
    // attribute
    private dbConnect db;
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        // make connection to db
        db = new dbConnect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        loginTitle = new javax.swing.JLabel();
        unameLabel = new javax.swing.JLabel();
        unameTextField = new javax.swing.JTextField();
        passLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();
        loginTitle1 = new javax.swing.JLabel();
        passTextField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        title.setFont(new java.awt.Font("Gotham Ultra", 0, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 51, 51));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Formula One");

        loginTitle.setFont(new java.awt.Font("Outfit", 1, 14)); // NOI18N
        loginTitle.setForeground(new java.awt.Color(0, 0, 0));
        loginTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginTitle.setText("LOGIN");

        unameLabel.setFont(new java.awt.Font("Outfit", 1, 14)); // NOI18N
        unameLabel.setForeground(new java.awt.Color(0, 0, 0));
        unameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        unameLabel.setText("Username:");

        unameTextField.setBackground(new java.awt.Color(255, 255, 255));
        unameTextField.setFont(new java.awt.Font("Outfit", 0, 12)); // NOI18N
        unameTextField.setForeground(new java.awt.Color(0, 0, 0));

        passLabel.setFont(new java.awt.Font("Outfit", 1, 14)); // NOI18N
        passLabel.setForeground(new java.awt.Color(0, 0, 0));
        passLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passLabel.setText("Password:");

        loginButton.setBackground(new java.awt.Color(0, 204, 255));
        loginButton.setFont(new java.awt.Font("Outfit", 1, 14)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.setToolTipText("");
        loginButton.setBorder(null);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        registerButton.setBackground(new java.awt.Color(255, 0, 51));
        registerButton.setFont(new java.awt.Font("Outfit", 1, 14)); // NOI18N
        registerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerButton.setText(" Register Here");
        registerButton.setToolTipText("");
        registerButton.setBorder(null);
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        loginTitle1.setFont(new java.awt.Font("Outfit", 0, 14)); // NOI18N
        loginTitle1.setForeground(new java.awt.Color(0, 0, 0));
        loginTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginTitle1.setText("Doesn't Have Account?");

        passTextField.setBackground(new java.awt.Color(255, 255, 255));
        passTextField.setFont(new java.awt.Font("Outfit", 0, 12)); // NOI18N
        passTextField.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(loginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(unameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20))
                                .addComponent(unameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(passLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(21, 21, 21))
                                .addComponent(passTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(loginTitle1))
                        .addGap(126, 126, 126))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginTitle)
                .addGap(18, 18, 18)
                .addComponent(unameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(unameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginTitle1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        try {
            // query untuk mencari data user sesuai dengan inputan
            String sql = "SELECT * FROM akun WHERE username='" + unameTextField.getText()
                    + "' and password='" + passTextField.getText() + "'";
            ResultSet r = db.selectQuery(sql);
            // jika data nya ada
            if (r.next()) {
                JOptionPane.showMessageDialog(null,  "Yay, Login Success!");
                // pindah ke laman main menu
                this.dispose();
                MainMenu a = new MainMenu(r.getInt("id_user")); // dengan id user sbg parameter
                a.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Oops, Wrong Username or Password :(");
                passTextField.requestFocus();
            }
        } catch (SQLException e) {
            System.out.println("login error");
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        // untuk register pindah ke laman register
        Register a = new Register();
        a.setVisible(true);
    }//GEN-LAST:event_registerButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginTitle;
    private javax.swing.JLabel loginTitle1;
    private javax.swing.JLabel passLabel;
    private javax.swing.JPasswordField passTextField;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel title;
    private javax.swing.JLabel unameLabel;
    private javax.swing.JTextField unameTextField;
    // End of variables declaration//GEN-END:variables
}
