
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author SARSSXD
 */
public class EditSantri extends javax.swing.JFrame {

    /**
     * Creates new form EditMapel
     */
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
        txt_tanggal_lahir.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_santri = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_nisn = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_nama = new javax.swing.JTextField();
        txt_tanggal_lahir = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btn_tambah = new javax.swing.JButton();
        btn_ubah = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        btn_home = new javax.swing.JButton();
        txt_pencarian = new javax.swing.JTextField();
        btn_cari = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txt_alamat = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_kelas = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Aplikasi Pendataan Matpel");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 70, 70));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jScrollPane1.setViewportView(table_santri);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 12, -1, 255));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Aplikasi Pendataan Santri");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 318, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NISN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 59, -1, -1));
        jPanel1.add(txt_nisn, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 57, 235, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nama");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 96, -1, -1));
        jPanel1.add(txt_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 94, 235, -1));
        jPanel1.add(txt_tanggal_lahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 131, 235, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tanggal Lahir");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 133, -1, -1));

        btn_tambah.setText("Tambah");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });
        jPanel1.add(btn_tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 242, -1, -1));

        btn_ubah.setText("Ubah");
        btn_ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ubahActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 242, -1, -1));

        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        jPanel1.add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 242, -1, -1));

        btn_home.setText("Home");
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 242, -1, -1));

        txt_pencarian.setText("...........................................ISI INISN..........................................");
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
        jPanel1.add(txt_pencarian, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 288, -1, -1));

        btn_cari.setText("Cari");
        btn_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 285, -1, -1));

        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        jPanel1.add(btn_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(659, 285, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Alamat");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 170, -1, -1));
        jPanel1.add(txt_alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 168, 235, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Kelas");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 207, -1, -1));
        jPanel1.add(txt_kelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 205, 235, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/katerina-h.jpg"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        dispose();
        Home home = new Home();
        home.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btn_homeActionPerformed

    private void txt_pencarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pencarianActionPerformed
        txt_pencarian.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pencarianActionPerformed

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
                JOptionPane.showMessageDialog(null, "Data berhasil tersimpan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                tampil_database();
                reset_text();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data gagal tersimpan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ubahActionPerformed
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
        }       // TODO add your handling code here:
    }//GEN-LAST:event_btn_ubahActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        tampil_database();
        reset_text();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_resetActionPerformed

    private void txt_pencarianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_pencarianMouseClicked
        txt_pencarian.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pencarianMouseClicked

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
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
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed
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
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cariActionPerformed

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
    private javax.swing.JButton btn_cari;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_home;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JButton btn_ubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
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