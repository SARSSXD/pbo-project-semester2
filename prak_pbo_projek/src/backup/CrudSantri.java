package backup;

import prak_pbo_projek.KoneksiMysql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

abstract class Enkapsulasi {

    private String nisn, nama, tanggalLahir, alamat, kelas;

    public String getNISN() {
        return nisn;
    }

    public void setNISN(String nisn) {
        this.nisn = nisn;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
}

interface Inter {

    public ResultSet tampilData();

    public ResultSet CariData(String nisn);

    String simpanData(String nisn, String nama, String tanggalLahir, String alamat, String kelas);

    String ubahData(String nisn, String nama, String tanggalLahir, String alamat, String kelas);

    String hapusData(String nisn);

}

public class CrudSantri extends Enkapsulasi implements Inter {

    private String nisn, nama, tanggalLahir, alamat, kelas;
    private Connection CRUDkoneksi;
    private PreparedStatement CRUDpsmt;
    private Statement CRUDstat;
    private ResultSet CRUDhasil;
    private String CRUDquery;

    public CrudSantri() {
        try {
            KoneksiMysql connection = new KoneksiMysql();
            CRUDkoneksi = connection.getKoneksi();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public String getNISN() {
        return nisn;
    }

    public void setNISN(String nisn) {
        this.nisn = nisn;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public ResultSet tampilData() {
        ResultSet hasil = null;
        String CRUDquery = "select * from santri";
        try {
            Statement CRUDstat = CRUDkoneksi.createStatement();
            hasil = CRUDstat.executeQuery(CRUDquery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return hasil;
    }

    public String simpanData(String nisn, String nama, String tanggalLahir, String alamat, String kelas) {
        CRUDquery = "insert into santri (nisn, nama, tanggal_lahir, alamat, kelas) values (?,?,?,?,?)";
        String message = "";
        try {
            CRUDpsmt = CRUDkoneksi.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, nisn);
            CRUDpsmt.setString(2, nama);
            CRUDpsmt.setString(3, tanggalLahir);
            CRUDpsmt.setString(4, alamat);
            CRUDpsmt.setString(5, kelas);
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

    public String ubahData(String nisn, String nama, String tanggalLahir, String alamat, String kelas) {
        CRUDquery = "update santri set nama=?, tanggal_lahir=?, alamat=?, kelas=? where nisn=?";
        String message = "";
        try {
            CRUDpsmt = CRUDkoneksi.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, nama);
            CRUDpsmt.setString(2, tanggalLahir);
            CRUDpsmt.setString(3, alamat);
            CRUDpsmt.setString(4, kelas);
            CRUDpsmt.setString(5, nisn);
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

    public String hapusData(String nisn) {
        CRUDquery = "delete from santri where nisn=?";
        String message = "";
        try {
            CRUDpsmt = CRUDkoneksi.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, nisn);
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

    public ResultSet CariData(String nisn) {
        ResultSet resultSet = null;
        try {
            String query = "SELECT * FROM santri WHERE NISN = ?";
            PreparedStatement preparedStatement = CRUDkoneksi.prepareStatement(query);
            preparedStatement.setString(1, nisn);
            resultSet = preparedStatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

}
