
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author SARSSXD
 */
public class CrudUstad {

    private int id_ustad;
    private String nama_ustad;
    private String kelas;
    private Connection CRUDkoneksi;
    private PreparedStatement CRUDpsmt;
    private String CRUDquery;

    public CrudUstad() {
        try {
            KoneksiMysql connection = new KoneksiMysql();
            CRUDkoneksi = connection.getKoneksi();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public int getId_ustad() {
        return id_ustad;
    }

    public void setId_ustad(int id_ustad) {
        this.id_ustad = id_ustad;
    }

    public String getNama_ustad() {
        return nama_ustad;
    }

    public void setNama_ustad(String nama_ustad) {
        this.nama_ustad = nama_ustad;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public ResultSet tampilData() {
        ResultSet hasil = null;
        String CRUDquery = "SELECT * FROM ustad";
        try {
            Statement CRUDstat = CRUDkoneksi.createStatement();
            hasil = CRUDstat.executeQuery(CRUDquery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return hasil;
    }

    public String simpanData(int id_ustad, String nama_ustad, String kelas) {
        CRUDquery = "INSERT INTO ustad (id_ustad, nama_ustad, kelas) VALUES (?,?,?)";
        String message = "";
        try {
            CRUDpsmt = CRUDkoneksi.prepareStatement(CRUDquery);
            CRUDpsmt.setInt(1, id_ustad);
            CRUDpsmt.setString(2, nama_ustad);
            CRUDpsmt.setString(3, kelas);
            CRUDpsmt.executeUpdate();
            CRUDpsmt.close();
            message = " Berhasil Dilakukan";
            JOptionPane.showMessageDialog(null, "Simpan Data" + message);
        } catch (Exception e) {
            message = " Gagal Dilakukan";
            JOptionPane.showMessageDialog(null, "Simpan Data" + message);
            System.out.println(e);
        }
        return null;
    }

    public String ubahData(int id_ustad, String nama_ustad, String kelas) {
        CRUDquery = "UPDATE ustad SET nama_ustad=?, kelas=? WHERE id_ustad=?";
        String message = "";
        try {
            CRUDpsmt = CRUDkoneksi.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, nama_ustad);
            CRUDpsmt.setString(2, kelas);
            CRUDpsmt.setInt(3, id_ustad);
            CRUDpsmt.executeUpdate();
            CRUDpsmt.close();
            message = " Berhasil Dilakukan";
            JOptionPane.showMessageDialog(null, "Ubah Data" + message);
        } catch (Exception e) {
            message = " Gagal Dilakukan";
            JOptionPane.showMessageDialog(null, "Ubah Data" + message);
            System.out.println(e);
        }
        return null;
    }

    public String hapusData(int id_ustad) {
        CRUDquery = "DELETE FROM ustad WHERE id_ustad=?";
        String message = "";
        try {
            CRUDpsmt = CRUDkoneksi.prepareStatement(CRUDquery);
            CRUDpsmt.setInt(1, id_ustad);
            CRUDpsmt.executeUpdate();
            CRUDpsmt.close();
            message = " Berhasil Dilakukan";
            JOptionPane.showMessageDialog(null, "Hapus Data" + message);
        } catch (Exception e) {
            message = " Gagal Dilakukan";
            JOptionPane.showMessageDialog(null, "Hapus Data" + message);
            System.out.println(e);
        }
        return null;
    }

    public ResultSet CariData(int id) {
        ResultSet resultSet = null;
        try {
            String query = "SELECT * FROM ustad WHERE id_ustad = ?";
            PreparedStatement preparedStatement = CRUDkoneksi.prepareStatement(query);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }
}
