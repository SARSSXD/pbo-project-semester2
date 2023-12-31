package backup;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

abstract class Enkapsulasi {

    private int id_nilai, NISN, id_matpel, id_ustad, UAS, UTS;

    public int getId_nilai() {
        return id_nilai;
    }

    public void setId_nilai(int id_nilai) {
        this.id_nilai = id_nilai;
    }

    public int getNISN() {
        return NISN;
    }

    public void setNISN(int NISN) {
        this.NISN = NISN;
    }

    public int getId_matpel() {
        return id_matpel;
    }

    public void setId_matpel(int id_matpel) {
        this.id_matpel = id_matpel;
    }

    public int getId_ustad() {
        return id_ustad;
    }

    public void setId_ustad(int id_ustad) {
        this.id_ustad = id_ustad;
    }

    public int getUAS() {
        return UAS;
    }

    public void setUAS(int UAS) {
        this.UAS = UAS;
    }

    public int getUTS() {
        return UTS;
    }

    public void setUTS(int UTS) {
        this.UTS = UTS;
    }

}

interface Inter {

    public ResultSet tampilData();

    public ResultSet CariData(int id);

    String simpanData(int id_nilai, int NISN, int id_matpel, int id_ustad, int UAS, int UTS);

    String ubahData(int id_nilai, int NISN, int id_matpel, int id_ustad, int UAS, int UTS);

    String hapusData(int id_nilai);

}

public class CrudNilai extends Enkapsulasi implements Inter {

    private int id_nilai, NISN, id_matpel, id_ustad, UAS, UTS;
    private Connection CRUDkoneksi;
    private PreparedStatement CRUDpsmt;
    private Statement CRUDstat;
    private ResultSet CRUDhasil;
    private String CRUDquery;

    public CrudNilai() {
        try {
            KoneksiMysql connection = new KoneksiMysql();
            CRUDkoneksi = connection.getKoneksi();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public int getId_nilai() {
        return id_nilai;
    }

    public void setId_nilai(int id_nilai) {
        this.id_nilai = id_nilai;
    }

    public int getNISN() {
        return NISN;
    }

    public void setNISN(int NISN) {
        this.NISN = NISN;
    }

    public int getId_matpel() {
        return id_matpel;
    }

    public void setId_matpel(int id_matpel) {
        this.id_matpel = id_matpel;
    }

    public int getId_ustad() {
        return id_ustad;
    }

    public void setId_ustad(int id_ustad) {
        this.id_ustad = id_ustad;
    }

    public int getUAS() {
        return UAS;
    }

    public void setUAS(int UAS) {
        this.UAS = UAS;
    }

    public int getUTS() {
        return UTS;
    }

    public void setUTS(int UTS) {
        this.UTS = UTS;
    }

    public ResultSet tampilData() {
        ResultSet hasil = null;
        String CRUDquery = "SELECT * FROM nilai";
        try {
            Statement CRUDstat = CRUDkoneksi.createStatement();
            hasil = CRUDstat.executeQuery(CRUDquery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return hasil;
    }

    public String simpanData(int id_nilai, int NISN, int id_matpel, int id_ustad, int UAS, int UTS) {
        CRUDquery = "INSERT INTO nilai (id_nilai, NISN, id_matpel, id_ustad, UAS, UTS) VALUES (?,?,?,?,?,?)";
        String message = "";
        try {
            CRUDpsmt = CRUDkoneksi.prepareStatement(CRUDquery);
            CRUDpsmt.setInt(1, id_nilai);
            CRUDpsmt.setInt(2, NISN);
            CRUDpsmt.setInt(3, id_matpel);
            CRUDpsmt.setInt(4, id_ustad);
            CRUDpsmt.setInt(5, UAS);
            CRUDpsmt.setInt(6, UTS);
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

    public String ubahData(int id_nilai, int NISN, int id_matpel, int id_ustad, int UAS, int UTS) {
        CRUDquery = "UPDATE nilai SET NISN=?, id_matpel=?, id_ustad=?, UAS=?, UTS=? WHERE id_nilai=?";
        String message = "";
        try {
            CRUDpsmt = CRUDkoneksi.prepareStatement(CRUDquery);
            CRUDpsmt.setInt(1, NISN);
            CRUDpsmt.setInt(2, id_matpel);
            CRUDpsmt.setInt(3, id_ustad);
            CRUDpsmt.setInt(4, UAS);
            CRUDpsmt.setInt(5, UTS);
            CRUDpsmt.setInt(6, id_nilai);
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

    public String hapusData(int id_nilai) {
        CRUDquery = "DELETE FROM nilai WHERE id_nilai=?";
        String message = "";
        try {
            CRUDpsmt = CRUDkoneksi.prepareStatement(CRUDquery);
            CRUDpsmt.setInt(1, id_nilai);
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
            String query = "SELECT * FROM nilai WHERE id_nilai = ?";
            PreparedStatement preparedStatement = CRUDkoneksi.prepareStatement(query);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }
}
