/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package prak_pbo_projek;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EditSantri extends javax.swing.JFrame {

    public EditSantri() {
        initComponents();
        tampil_database();
    }

    private ResultSet hasil;
    CrudSantri aa = new CrudSantri();

    public void tampil_database() {
        Object[] baris = {"NISN", "Nama", "Tanggal Lahir", "Alamat", "Kelas"};
        DefaultTableModel tabmode = new DefaultTableModel(null, baris);
        table_santri.setModel(tabmode);
        try {
            hasil = aa.tampilData();
            while (hasil.next()) {
                String nisn = hasil.getString("NISN");
                String nama = hasil.getString("Nama");
                String tanggalLahir = hasil.getString("tanggal_lahir");
                String alamat = hasil.getString("Alamat");
                String kelas = hasil.getString("Kelas");
                String[] data = {nisn, nama, tanggalLahir, alamat, kelas};
                tabmode.addRow(data);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void reset_text() {
        txt_nisn.setText("");
        txt_nama.setText("");
        txt_tanggal_lahir.setText("");
        txt_alamat.setText("");
        txt_kelas.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_kelas = new javax.swing.JTextField();
        txt_alamat = new javax.swing.JTextField();
        txt_tanggal_lahir = new javax.swing.JTextField();
        txt_nama = new javax.swing.JTextField();
        txt_nisn = new javax.swing.JTextField();
        btn_tambah = new javax.swing.JButton();
        btn_Ubah = new javax.swing.JButton();
        btn_Reset = new javax.swing.JButton();
        btn_Hapus = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_santri = new javax.swing.JTable();
        txt_pencarian = new javax.swing.JTextField();
        btn_pencarian = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 70, 70));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Aplikasi Pendataan Santri");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NISN");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nama");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tanggal Lahir");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Alamat");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Kelas");

        txt_nisn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nisnActionPerformed(evt);
            }
        });

        btn_tambah.setText("Tambah");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_Ubah.setText("Ubah");
        btn_Ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UbahActionPerformed(evt);
            }
        });

        btn_Reset.setText("Reset");
        btn_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ResetActionPerformed(evt);
            }
        });

        btn_Hapus.setText("Hapus");
        btn_Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HapusActionPerformed(evt);
            }
        });

        jButton5.setText("Home");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        table_santri.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table_santri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_santriMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_santri);

        txt_pencarian.setText(".......................................ISI NISN...................................");
        txt_pencarian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_pencarianMouseClicked(evt);
            }
        });
        txt_pencarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pencarianActionPerformed(evt);
            }
        });

        btn_pencarian.setText("Cari");
        btn_pencarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pencarianActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_tanggal_lahir, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(65, 65, 65)
                                    .addComponent(txt_nisn, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_kelas, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_tambah)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Ubah)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Reset)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5)))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Hapus)
                                .addGap(18, 18, 18)
                                .addComponent(btn_pencarian))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_nisn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_tanggal_lahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_kelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(btn_Reset)
                            .addComponent(btn_Ubah)
                            .addComponent(btn_tambah))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Hapus)
                    .addComponent(txt_pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pencarian))
                .addContainerGap(91, Short.MAX_VALUE))
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

        setBounds(0, 0, 824, 434);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dispose();
        Home home = new Home();
        home.setVisible(true);

    }//GEN-LAST:event_jButton5ActionPerformed

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        if (txt_nisn.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf, NISN belum diisi !");
            txt_nisn.requestFocus();
        } else if (txt_nama.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf, Nama belum diisi !");
            txt_nama.requestFocus();
        } else if (txt_tanggal_lahir.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf, Tanggal Lahir belum diisi !");
            txt_tanggal_lahir.requestFocus();
        } else if (txt_alamat.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf, Alamat belum diisi !");
            txt_alamat.requestFocus();
        } else if (txt_kelas.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf, Kelas belum diisi !");
            txt_kelas.requestFocus();
        } else {
            try {
                aa.setNISN(txt_nisn.getText());
                aa.setNama(txt_nama.getText());
                aa.setTanggalLahir(txt_tanggal_lahir.getText());
                aa.setAlamat(txt_alamat.getText());
                aa.setKelas(txt_kelas.getText());
                aa.simpanData(aa.getNISN(), aa.getNama(), aa.getTanggalLahir(), aa.getAlamat(), aa.getKelas());
                //JOptionPane.showMessageDialog(null, "Data berhasil tersimpan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                tampil_database();
                reset_text();
            } catch (Exception e) {
                // JOptionPane.showMessageDialog(null, "Data gagal tersimpan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void txt_nisnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nisnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nisnActionPerformed

    private void table_santriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_santriMouseClicked
        try {
            int row = table_santri.rowAtPoint(evt.getPoint());
            String nisn = table_santri.getValueAt(row, 0).toString();
            String nama = table_santri.getValueAt(row, 1).toString();
            String tanggal_lahir = table_santri.getValueAt(row, 2).toString();
            String alamat = table_santri.getValueAt(row, 3).toString();
            String kelas = table_santri.getValueAt(row, 4).toString();
            txt_nisn.setText(String.valueOf(nisn));
            txt_nama.setText(String.valueOf(nama));
            txt_tanggal_lahir.setText(String.valueOf(tanggal_lahir));
            txt_alamat.setText(String.valueOf(alamat));
            txt_kelas.setText(String.valueOf(kelas));
        } catch (Exception e) {
        }

    }//GEN-LAST:event_table_santriMouseClicked

    private void btn_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HapusActionPerformed
        if (txt_pencarian.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf, NISN belum diisi !");
            txt_pencarian.requestFocus();
        } else {
            if (JOptionPane.showConfirmDialog(null, "Apakah Anda yakin akan menghapus data ini ?", "Warning", 2) == JOptionPane.YES_OPTION) {
                String nisn = "";
                try {
                    aa.setNISN(txt_pencarian.getText());
                    aa.hapusData(aa.getNISN());
                    JOptionPane.showMessageDialog(null, "Data berhasil dihapus", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                    tampil_database();
                    reset_text();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Data gagal dihapus", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btn_HapusActionPerformed

    private void btn_UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UbahActionPerformed
        if (txt_nisn.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf, NISN belum diisi !");
            txt_nisn.requestFocus();
        } else if (txt_nama.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf, Nama belum diisi !");
            txt_nama.requestFocus();
        } else if (txt_tanggal_lahir.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf, Tanggal Lahir belum diisi !");
            txt_tanggal_lahir.requestFocus();
        } else if (txt_alamat.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf, Alamat belum diisi !");
            txt_alamat.requestFocus();
        } else if (txt_kelas.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf, Kelas belum diisi !");
            txt_kelas.requestFocus();
        } else {
            try {
                aa.setNISN(txt_nisn.getText());
                aa.setNama(txt_nama.getText());
                aa.setTanggalLahir(txt_tanggal_lahir.getText());
                aa.setAlamat(txt_alamat.getText());
                aa.setKelas(txt_kelas.getText());
                aa.ubahData(aa.getNISN(), aa.getNama(), aa.getTanggalLahir(), aa.getAlamat(), aa.getKelas());
                JOptionPane.showMessageDialog(null, "Data berhasil diubah", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                tampil_database();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data gagal diubah", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
        }         // TODO add your handling code here:
    }//GEN-LAST:event_btn_UbahActionPerformed

    private void btn_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ResetActionPerformed
        tampil_database();
        reset_text();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ResetActionPerformed

    private void txt_pencarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pencarianActionPerformed

    }//GEN-LAST:event_txt_pencarianActionPerformed

    private void txt_pencarianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_pencarianMouseClicked
        txt_pencarian.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pencarianMouseClicked

    private void btn_pencarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pencarianActionPerformed
        String nisn = txt_pencarian.getText();
        Object[] baris = {"NISN", "Nama", "Tanggal Lahir", "Alamat", "Kelas"};
        DefaultTableModel tabmode = new DefaultTableModel(null, baris);
        table_santri.setModel(tabmode);

        try {
            hasil = aa.CariData(nisn);
            if (hasil.next()) {
                String nisnResult = hasil.getString("NISN");
                String nama = hasil.getString("Nama");
                String tanggalLahir = hasil.getString("tanggal_lahir");
                String alamat = hasil.getString("Alamat");
                String kelas = hasil.getString("Kelas");
                String[] data = {nisnResult, nama, tanggalLahir, alamat, kelas};
                tabmode.addRow(data);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Data tidak ditemukan");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_pencarianActionPerformed

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
            java.util.logging.Logger.getLogger(EditSantri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditSantri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditSantri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditSantri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditSantri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Hapus;
    private javax.swing.JButton btn_Reset;
    private javax.swing.JButton btn_Ubah;
    private javax.swing.JButton btn_pencarian;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_santri;
    private javax.swing.JTextField txt_alamat;
    private javax.swing.JTextField txt_kelas;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_nisn;
    private javax.swing.JTextField txt_pencarian;
    private javax.swing.JTextField txt_tanggal_lahir;
    // End of variables declaration//GEN-END:variables
}
