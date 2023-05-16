package libsoz;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JOptionPane;


public class frameMembership extends frameMaster {

    public String nama = "";
    public String tglLahir = "";
    public String email = "";
    public String noTelp = "";
    public String alamat = "";
    
    public frameMembership() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblMember = new javax.swing.JLabel();
        lblNama = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        lblTanggalLahir = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblNoTelpon = new javax.swing.JLabel();
        txtNoTelp = new javax.swing.JTextField();
        lblAlamat = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        bDaftarMember = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        lblMember.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        lblMember.setText("DAFTAR MEMBER");

        lblNama.setFont(new java.awt.Font("SimSun", 0, 13)); // NOI18N
        lblNama.setText("Nama Lengkap");

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        lblTanggalLahir.setFont(new java.awt.Font("SimSun", 0, 13)); // NOI18N
        lblTanggalLahir.setText("Tanggal Lahir");

        lblEmail.setFont(new java.awt.Font("SimSun", 0, 13)); // NOI18N
        lblEmail.setText("Email");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lblNoTelpon.setFont(new java.awt.Font("SimSun", 0, 13)); // NOI18N
        lblNoTelpon.setText("No. Telp");

        txtNoTelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoTelpActionPerformed(evt);
            }
        });

        lblAlamat.setFont(new java.awt.Font("SimSun", 0, 13)); // NOI18N
        lblAlamat.setText("Alamat");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        bDaftarMember.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        bDaftarMember.setText("Daftar");
        bDaftarMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDaftarMemberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(lblMember))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNama)
                            .addComponent(lblTanggalLahir)
                            .addComponent(lblEmail)
                            .addComponent(lblNoTelpon)
                            .addComponent(lblAlamat))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail)
                            .addComponent(txtNoTelp)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE))))
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bDaftarMember)
                .addGap(203, 203, 203))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblMember)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNama)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTanggalLahir)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNoTelpon)
                    .addComponent(txtNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAlamat)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(bDaftarMember)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtNoTelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoTelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoTelpActionPerformed

    private void bDaftarMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDaftarMemberActionPerformed
        // TODO add your handling code here:
        Date date = jDateChooser1.getDate();
        if (date != null) 
        {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        tglLahir = df.format(date);
        } 
        else 
        {
            JOptionPane.showMessageDialog(this, "Tanggal tidak boleh kosong!", "Coba Lagi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        nama = txtNama.getText();
        email = txtEmail.getText();
        noTelp = txtNoTelp.getText();
        alamat = jTextArea1.getText();
        
        if (nama.isEmpty() || email.isEmpty() || noTelp.isEmpty() || alamat.isEmpty())
            JOptionPane.showMessageDialog(this, "Data Tidak Boleh Kosong!", "Message", JOptionPane.INFORMATION_MESSAGE);

        else
        {
            //cek username sudah dipakai?
            try 
            {
               String sql = "INSERT INTO membership(nama, tgl_lahir, email, no_telp, alamat) values('" + nama + "', '" + tglLahir + "', '" + email + "', '" + noTelp + "', '" + alamat + "')";
               boolean success = db.Execute(sql);
               
               if (success)
                    JOptionPane.showMessageDialog(this, "Daftar Membership Berhasil!", "Message", JOptionPane.INFORMATION_MESSAGE);
               else
                   JOptionPane.showMessageDialog(this, "Daftar Membership Gagal!", "Warning", JOptionPane.INFORMATION_MESSAGE);
            } 
            catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_bDaftarMemberActionPerformed

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
            java.util.logging.Logger.getLogger(frameMembership.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameMembership.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameMembership.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameMembership.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameMembership().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDaftarMember;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblAlamat;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblMember;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblNoTelpon;
    private javax.swing.JLabel lblTanggalLahir;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNoTelp;
    // End of variables declaration//GEN-END:variables
}
