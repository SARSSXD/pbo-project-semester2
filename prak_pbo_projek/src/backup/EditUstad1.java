/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package prak_pbo_projek;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EditUstad1 extends javax.swing.JFrame {

    public EditUstad1() {
        initComponents();
        tampil_database();

    }

    private DefaultTableModel tabmode;
    private ResultSet hasil;
    CrudUstad aa = new CrudUstad();

    public void tampil_database() {
        Object[] baris = {"id_ustad", "nama_ustad", "Kelas"};
        DefaultTableModel tabmode = new DefaultTableModel(null, baris);
        table_ustad.setModel(tabmode);
        try {
            hasil = aa.tampilData();
            while (hasil.next()) {
                String idUstad = hasil.getString("id_ustad");
                String namaUstad = hasil.getString("nama_ustad");
                String kelas = hasil.getString("Kelas");
                String[] data = {idUstad, namaUstad, kelas};
                tabmode.addRow(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void reset_text() {
        txt_id_ustad.setText("");
        txt_nama_ustad.setText("");
        txt_kelas.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_cari = new javax.swing.JButton();
        txt_pencarian = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_tambah = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btn_Ubah = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btn_Reset = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btn_Hapus = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txt_kelas = new javax.swing.JTextField();
        txt_id_ustad = new javax.swing.JTextField();
        txt_nama_ustad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_ustad = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 70, 70));

        btn_cari.setText("Cari");
        btn_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariActionPerformed(evt);
            }
        });

        txt_pencarian.setText(".......................................ISI ID USTAD...................................");
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

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Aplikasi Pendataan Santri");

        btn_tambah.setText("Tambah");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID Ustad");

        btn_Ubah.setText("Ubah");
        btn_Ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UbahActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nama Ustad");

        btn_Reset.setText("Reset");
        btn_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ResetActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Kelas");

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

        table_ustad.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(table_ustad);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btn_tambah)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Ubah)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Reset)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txt_nama_ustad, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_id_ustad, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_kelas, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Hapus)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cari)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_id_ustad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_nama_ustad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_kelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(btn_Reset)
                    .addComponent(btn_Ubah)
                    .addComponent(btn_tambah)
                    .addComponent(txt_pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Hapus)
                    .addComponent(btn_cari))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed
        String id_ustad = txt_pencarian.getText();
        int id = Integer.parseInt(id_ustad);
        Object[] baris = {"id_ustad", "nama_ustad", "Kelas"};
        DefaultTableModel tabmode = new DefaultTableModel(null, baris);
        table_ustad.setModel(tabmode);
        try {
            hasil = aa.CariData(id);
            if (hasil.next()) {
                String idUstad = hasil.getString("id_ustad");
                String namaUstad = hasil.getString("nama_ustad");
                String kelas = hasil.getString("Kelas");
                String[] data = {idUstad, namaUstad, kelas};
                tabmode.addRow(data);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Data tidak ditemukan");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_cariActionPerformed

    private void txt_pencarianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_pencarianMouseClicked
        txt_pencarian.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pencarianMouseClicked

    private void txt_pencarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pencarianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pencarianActionPerformed

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        if (txt_id_ustad.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf, ID Ustad belum diisi !");
            txt_id_ustad.requestFocus();
        } else if (txt_nama_ustad.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf, Nama Ustad belum diisi !");
            txt_nama_ustad.requestFocus();
        } else if (txt_kelas.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf, Kelas belum diisi !");
            txt_kelas.requestFocus();
        } else {
            try {
                aa.setId_ustad(Integer.parseInt(txt_id_ustad.getText()));
                aa.setNama_ustad(txt_nama_ustad.getText());
                aa.setKelas(txt_kelas.getText());
                aa.simpanData(aa.getId_ustad(), aa.getNama_ustad(), aa.getKelas());
                tampil_database();
                reset_text();
            } catch (Exception e) {
            }
        }

    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UbahActionPerformed
        if (txt_id_ustad.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf, ID Ustad belum diisi !");
            txt_id_ustad.requestFocus();
        } else if (txt_nama_ustad.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf, Nama Ustad belum diisi !");
            txt_nama_ustad.requestFocus();
        } else if (txt_kelas.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf, Kelas belum diisi !");
            txt_kelas.requestFocus();
        } else {
            try {
                aa.setId_ustad(Integer.parseInt(txt_id_ustad.getText()));
                aa.setNama_ustad(txt_nama_ustad.getText());
                aa.setKelas(txt_kelas.getText());
                aa.ubahData(aa.getId_ustad(), aa.getNama_ustad(), aa.getKelas());
                JOptionPane.showMessageDialog(null, "Data berhasil diubah", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                tampil_database();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data gagal diubah", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }//GEN-LAST:event_btn_UbahActionPerformed

    private void btn_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ResetActionPerformed
        tampil_database();
        reset_text();
    }//GEN-LAST:event_btn_ResetActionPerformed

    private void btn_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HapusActionPerformed
        if (txt_pencarian.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf, ID Ustad belum diisi !");
            txt_pencarian.requestFocus();
        } else {
            if (JOptionPane.showConfirmDialog(null, "Apakah Anda yakin akan menghapus data ini ?", "Warning", 2) == JOptionPane.YES_OPTION) {
                String idUstad = "";
                try {
                    aa.setId_ustad(Integer.parseInt(txt_pencarian.getText()));
                    aa.hapusData(aa.getId_ustad());
                    JOptionPane.showMessageDialog(null, "Data berhasil dihapus", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                    tampil_database();
                    reset_text();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Data gagal dihapus", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }

    }//GEN-LAST:event_btn_HapusActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dispose();
        Home home = new Home();
        home.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(EditUstad1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditUstad1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditUstad1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditUstad1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditUstad1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Hapus;
    private javax.swing.JButton btn_Reset;
    private javax.swing.JButton btn_Ubah;
    private javax.swing.JButton btn_cari;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_ustad;
    private javax.swing.JTextField txt_id_ustad;
    private javax.swing.JTextField txt_kelas;
    private javax.swing.JTextField txt_nama_ustad;
    private javax.swing.JTextField txt_pencarian;
    // End of variables declaration//GEN-END:variables
}
