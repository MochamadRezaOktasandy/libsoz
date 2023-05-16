package libsoz;

import com.mysql.jdbc.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class frameRegister extends frameMaster {

    public String username = "";
    public String nama = "";
    public String password = "";
    public String conPassword = "";
    
    public frameRegister() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblJudul1 = new javax.swing.JLabel();
        lblJudul2 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblNamaLengkap = new javax.swing.JLabel();
        txtNamaLengkap = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        cbShowPassword = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        txtConfirmPassword1 = new javax.swing.JPasswordField();
        cbCFShowPassword1 = new javax.swing.JCheckBox();
        bRegister = new javax.swing.JButton();
        lblLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        lblJudul1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        lblJudul1.setText("LIBRARY SOZ");

        lblJudul2.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        lblJudul2.setText("son of zeus");

        lblUsername.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        lblUsername.setText("Username");

        lblNamaLengkap.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        lblNamaLengkap.setText("Nama Lengkap");

        lblPassword.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        lblPassword.setText("Password");

        cbShowPassword.setText("Show Password");
        cbShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbShowPasswordActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SimSun", 0, 15)); // NOI18N
        jLabel1.setText("Confirm Password");

        cbCFShowPassword1.setText("Show Password");
        cbCFShowPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCFShowPassword1ActionPerformed(evt);
            }
        });

        bRegister.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        bRegister.setText("Register");
        bRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegisterActionPerformed(evt);
            }
        });

        lblLogin.setFont(new java.awt.Font("SimSun-ExtB", 0, 12)); // NOI18N
        lblLogin.setText("you already have an account? Login now!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(lblJudul1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(lblJudul2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNamaLengkap)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtConfirmPassword1)
                            .addComponent(txtPassword)
                            .addComponent(txtNamaLengkap)
                            .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(bRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbCFShowPassword1)
                                    .addComponent(jLabel1)
                                    .addComponent(cbShowPassword)
                                    .addComponent(lblPassword))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(88, 88, 88))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogin)
                .addGap(107, 107, 107))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJudul1)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJudul2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNamaLengkap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNamaLengkap, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbShowPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtConfirmPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbCFShowPassword1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLogin)
                .addContainerGap(25, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegisterActionPerformed
        // TODO add your handling code here:
        username = txtUsername.getText();
        nama = txtNamaLengkap.getText();
        password = new String(txtPassword.getPassword());
        conPassword =  new String(txtConfirmPassword1.getPassword());
        
        if (username.isEmpty() || password.isEmpty() || nama.isEmpty())
            JOptionPane.showMessageDialog(this, "Data Tidak Boleh Kosong!", "Message", JOptionPane.INFORMATION_MESSAGE);
            
        else if(password.length() < 8)
            JOptionPane.showMessageDialog(this, "Password Harus Memiliki Minimal 8 Karakter", "Message", JOptionPane.INFORMATION_MESSAGE);    
        
        else if (!password.equals(conPassword))
            JOptionPane.showMessageDialog(this, "Password Tidak Sama!", "Message", JOptionPane.INFORMATION_MESSAGE);
        
        else
        {
            //cek username sudah dipakai?
            try 
            {
               String sql = "SELECT username FROM user WHERE username = '" + username +"'";
               ResultSet rs = (ResultSet) db.getRS(sql);
               if (rs.last()) 
               {
                   int rows = rs.getRow();

                   if(rows == 1)
                   {
                       JOptionPane.showMessageDialog(this, "Username ini sudah digunakan!", "Warning", JOptionPane.ERROR_MESSAGE);
                       return;
                   }
               }

               sql = "INSERT INTO user(username, nama, password) values('" + username + "', '" + nama + "', '" + password + "')";
               boolean success = db.Execute(sql);
               
               if (success)
               {
                    JOptionPane.showMessageDialog(this, "Register Berhasil!", "Message", JOptionPane.INFORMATION_MESSAGE);
                    
                    frameLogin login = new frameLogin();
                    login.main(null);
                    this.dispose();
               }
               else
                   JOptionPane.showMessageDialog(this, "Register Gagal!", "Warning", JOptionPane.INFORMATION_MESSAGE);
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_bRegisterActionPerformed

    private void cbShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbShowPasswordActionPerformed
        // TODO add your handling code here:
        if (cbShowPassword.isSelected()) 
        {
            txtPassword.setEchoChar((char) 0); // Mengatur karakter echo ke 0 untuk menampilkan teks biasa
        } 
        else 
        {
            txtPassword.setEchoChar('*'); // Mengatur karakter echo ke '*' untuk menyembunyikan teks
        }
    }//GEN-LAST:event_cbShowPasswordActionPerformed

    private void cbCFShowPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCFShowPassword1ActionPerformed
        // TODO add your handling code here:
        if (cbCFShowPassword1.isSelected()) 
        {
            txtConfirmPassword1.setEchoChar((char) 0); // Mengatur karakter echo ke 0 untuk menampilkan teks biasa
        } 
        else 
        {
            txtConfirmPassword1.setEchoChar('*'); // Mengatur karakter echo ke '*' untuk menyembunyikan teks
        }
    }//GEN-LAST:event_cbCFShowPassword1ActionPerformed

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
            java.util.logging.Logger.getLogger(frameRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bRegister;
    private javax.swing.JCheckBox cbCFShowPassword1;
    private javax.swing.JCheckBox cbShowPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblJudul1;
    private javax.swing.JLabel lblJudul2;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblNamaLengkap;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField txtConfirmPassword1;
    private javax.swing.JTextField txtNamaLengkap;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
