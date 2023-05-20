package libsoz;

import com.mysql.jdbc.ResultSet;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFrame;
import com.toedter.calendar.JDateChooser;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class frameCariBuku extends frameMaster {

//    public String tanggal = "";
    public String username = "";
    public String pilihBuku = "";
    public String lokasiBuku = "";
    
    public frameCariBuku() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblPilihBuku = new javax.swing.JLabel();
        txtLokasi = new javax.swing.JTextField();
        lblJudulPeminjaman = new javax.swing.JLabel();
        lblLokasi = new javax.swing.JLabel();
        txtPilihBuku = new javax.swing.JTextField();
        bClose = new javax.swing.JButton();
        txtSampul = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblPilihBuku.setFont(new java.awt.Font("SimSun", 0, 13)); // NOI18N
        lblPilihBuku.setText("Pilih Buku");

        lblJudulPeminjaman.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        lblJudulPeminjaman.setText("KIOSK - Cari Buku");

        lblLokasi.setFont(new java.awt.Font("SimSun", 0, 13)); // NOI18N
        lblLokasi.setText("Lokasi Buku");

        txtPilihBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPilihBukuMouseClicked(evt);
            }
        });

        bClose.setText("CLOSE");
        bClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSampul, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lblJudulPeminjaman)
                        .addGap(10, 10, 10)))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bClose, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblLokasi)
                        .addComponent(lblPilihBuku)
                        .addComponent(txtPilihBuku)
                        .addComponent(txtLokasi, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblJudulPeminjaman)
                .addGap(18, 18, 18)
                .addComponent(lblPilihBuku)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPilihBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLokasi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtLokasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(txtSampul, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(bClose, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
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

    private void bCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCloseActionPerformed
        // TODO add your handling code here:
        pilihBuku = txtPilihBuku.getText();
        lokasiBuku = txtLokasi.getText();
        
//         try 
//           {
//                String sql = "INSERT INTO pinjam(tgl_pinjam, username, role) VALUES('" + username + "', '" + hashPassword(password) + "', '" + role + "')";
//                boolean userSuccess = db.Execute(insertUserSql);
//
//                if (userSuccess && memberSuccess) 
//                {
//                    JOptionPane.showMessageDialog(this, "Register Berhasil!", "Message", JOptionPane.INFORMATION_MESSAGE);
//                    frameLogin login = new frameLogin();
//                    login.main(null);
//                    this.dispose();
//                } 
//                else 
//                {
//                    JOptionPane.showMessageDialog(this, "Register Gagal!", "Warning", JOptionPane.INFORMATION_MESSAGE);
//                }
//            } 
//            catch (Exception e) 
//            {
//                System.out.println(e.getMessage());
//            }
        
        
        
        
        
    }//GEN-LAST:event_bCloseActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
//        Date date = new Date();
//        jDateChooser1.setDate(date);// Mengatur tanggal hari ini
//        jDateChooser1.setEnabled(false);//Menonaktifkan jDateChooser agar tidak bisa diklik
    }//GEN-LAST:event_formWindowOpened

    private void txtPilihBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPilihBukuMouseClicked
        //https://stackoverflow.com/questions/8409347/mouse-event-with-double-click-in-java
        
        if (evt.getClickCount() == 2 && !evt.isConsumed()) 
        {
            //Cara dapetin nilai dari frame Lain
            framePemilihanBuku pilihBuku = new framePemilihanBuku();
//            pilihBuku.main(null); //JANGAN PANGGIL MAIN DISINI
            pilihBuku.setVisible(true); //Tampilkan JFRAME dengan ini
            String bukuID = pilihBuku.getBukuID(); //Ambil Nilai Disini, getBukuID() ada di frame yang kita show
            txtPilihBuku.setText(bukuID);
        }
    }//GEN-LAST:event_txtPilihBukuMouseClicked

    
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
            java.util.logging.Logger.getLogger(frameCariBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameCariBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameCariBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameCariBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameCariBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bClose;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblJudulPeminjaman;
    private javax.swing.JLabel lblLokasi;
    private javax.swing.JLabel lblPilihBuku;
    private javax.swing.JTextField txtLokasi;
    private javax.swing.JTextField txtPilihBuku;
    private javax.swing.JTextField txtSampul;
    // End of variables declaration//GEN-END:variables
}
