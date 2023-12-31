/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package prak_pbo_projek;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EditMapel extends javax.swing.JFrame {

    public EditMapel() {
        initComponents();
        tampil_database();
    }
    private DefaultTableModel tabmode;
    private ResultSet hasil;
    CrudMatpel aa = new CrudMatpel();

    public void tampil_database() {
        Object[] baris = {"id_matpel", "nama_matpel", "waktu"};
        DefaultTableModel tabmode = new DefaultTableModel(null, baris);
        table_matpel.setModel(tabmode);
        try {
            hasil = aa.tampilDataMatpel();
            while (hasil.next()) {
                String idMatpel = hasil.getString("id_matpel");
                String namaMatpel = hasil.getString("nama_matpel");
                String waktu = hasil.getString("waktu");
                String[] data = {idMatpel, namaMatpel, waktu};
                tabmode.addRow(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void reset_text() {
        txt_id_matpel.setText("");
        txt_nama_matpel.setText("");
        txt_waktu.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_Hapus = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btn_cari = new javax.swing.JButton();
        txt_pencarian = new javax.swing.JTextField();
        txt_waktu = new javax.swing.JTextField();
        txt_nama_matpel = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_tambah = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btn_Ubah = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btn_Reset = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_id_matpel = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_matpel = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 70, 70));

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

        btn_cari.setText("Cari");
        btn_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariActionPerformed(evt);
            }
        });

        txt_pencarian.setText(".......................................ISI ID Mapel...................................");
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

        txt_waktu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_waktuActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Aplikasi Pendataan Matpel");

        btn_tambah.setText("Tambah");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID Mapel");

        btn_Ubah.setText("Ubah");
        btn_Ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UbahActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nama Mapel");

        btn_Reset.setText("Reset");
        btn_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ResetActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Waktu");

        table_matpel.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(table_matpel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_waktu, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_nama_matpel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_id_matpel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(txt_pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Hapus)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cari)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_id_matpel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_nama_matpel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_waktu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(btn_Reset)
                            .addComponent(btn_Ubah)
                            .addComponent(btn_tambah)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Hapus)
                    .addComponent(txt_pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cari))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ResetActionPerformed
        tampil_database();
        reset_text();
    }//GEN-LAST:event_btn_ResetActionPerformed

    private void btn_UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UbahActionPerformed
        if (txt_id_matpel.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf, ID Matpel belum diisi !");
            txt_id_matpel.requestFocus();
        } else if (txt_nama_matpel.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf, Nama Matpel belum diisi !");
            txt_nama_matpel.requestFocus();
        } else if (txt_waktu.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf, Waktu belum diisi !");
            txt_waktu.requestFocus();
        } else {
            try {
                aa.setId_matpel(Integer.parseInt(txt_id_matpel.getText()));
                aa.setNama_matpel(txt_nama_matpel.getText());
                aa.setWaktu(txt_waktu.getText());
                aa.ubahDataMatpel(aa.getId_matpel(), aa.getNama_matpel(), aa.getWaktu());
                tampil_database();
                reset_text();
            } catch (Exception e) {
            }
        }

    }//GEN-LAST:event_btn_UbahActionPerformed

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        if (txt_id_matpel.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf, ID Matpel belum diisi !");
            txt_id_matpel.requestFocus();
        } else if (txt_nama_matpel.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf, Nama Matpel belum diisi !");
            txt_nama_matpel.requestFocus();
        } else if (txt_waktu.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf, Waktu belum diisi !");
            txt_waktu.requestFocus();
        } else {
            try {
                aa.setId_matpel(Integer.parseInt(txt_id_matpel.getText()));
                aa.setNama_matpel(txt_nama_matpel.getText());
                aa.setWaktu(txt_waktu.getText());
                aa.simpanDataMatpel(aa.getId_matpel(), aa.getNama_matpel(), aa.getWaktu());
                tampil_database();
                reset_text();
            } catch (Exception e) {
            }
        }

    }//GEN-LAST:event_btn_tambahActionPerformed

    private void txt_waktuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_waktuActionPerformed

    }//GEN-LAST:event_txt_waktuActionPerformed

    private void txt_pencarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pencarianActionPerformed

    }//GEN-LAST:event_txt_pencarianActionPerformed

    private void txt_pencarianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_pencarianMouseClicked
        txt_pencarian.setText("");
    }//GEN-LAST:event_txt_pencarianMouseClicked

    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed
        String id_matpel = txt_pencarian.getText();
        int id = Integer.parseInt(id_matpel);
        Object[] baris = {"id_matpel", "nama_matpel", "waktu"};
        DefaultTableModel tabmode = new DefaultTableModel(null, baris);
        table_matpel.setModel(tabmode);
        try {
            hasil = aa.CariData(id);
            if (hasil.next()) {
                String idMatpel = hasil.getString("id_matpel");
                String namaMatpel = hasil.getString("nama_matpel");
                String waktu = hasil.getString("waktu");
                String[] data = {idMatpel, namaMatpel, waktu};
                tabmode.addRow(data);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Data tidak ditemukan");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_cariActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dispose();
        Home home = new Home();
        home.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btn_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HapusActionPerformed
        if (txt_pencarian.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Maaf, ID Matpel belum diisi !");
            txt_pencarian.requestFocus();
        } else {
            if (JOptionPane.showConfirmDialog(null, "Apakah Anda yakin akan menghapus data ini?", "Warning", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                try {
                    aa.setId_matpel(Integer.parseInt(txt_pencarian.getText()));
                    aa.hapusDataMatpel(aa.getId_matpel());
                    JOptionPane.showMessageDialog(null, "Data berhasil dihapus", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                    tampil_database();
                    reset_text();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Data gagal dihapus", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }

    }//GEN-LAST:event_btn_HapusActionPerformed

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
            java.util.logging.Logger.getLogger(EditMapel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditMapel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditMapel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditMapel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditMapel().setVisible(true);
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table_matpel;
    private javax.swing.JTextField txt_id_matpel;
    private javax.swing.JTextField txt_nama_matpel;
    private javax.swing.JTextField txt_pencarian;
    private javax.swing.JTextField txt_waktu;
    // End of variables declaration//GEN-END:variables
}
