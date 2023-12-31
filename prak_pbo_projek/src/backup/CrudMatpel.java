package backup;

import prak_pbo_projek.KoneksiMysql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

abstract class EnkapsulasiMatpel {

    private int id_matpel;
    private String nama_matpel;
    private String waktu;

    public int getId_matpel() {
        return id_matpel;
    }

    public void setId_matpel(int id_matpel) {
        this.id_matpel = id_matpel;
    }

    public String getNama_matpel() {
        return nama_matpel;
    }

    public void setNama_matpel(String nama_matpel) {
        this.nama_matpel = nama_matpel;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }
}

interface InterMatpel {

    ResultSet tampilDataMatpel();

    String simpanDataMatpel(int id_matpel, String nama_matpel, String waktu);

    String ubahDataMatpel(int id_matpel, String nama_matpel, String waktu);

    String hapusDataMatpel(int id_matpel);

    String[] cariDataMatpel(int id_matpel);
}

public class CrudMatpel extends EnkapsulasiMatpel implements InterMatpel {

    private int id_matpel;
    private String nama_matpel;
    private String waktu;
    private Connection CRUDkoneksi;
    private PreparedStatement CRUDpsmt;
    private Statement CRUDstat;
    private ResultSet CRUDhasil;
    private String CRUDquery;

    public CrudMatpel() {
        try {
            KoneksiMysql connection = new KoneksiMysql();
            CRUDkoneksi = connection.getKoneksi();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public int getId_matpel() {
        return id_matpel;
    }

    public void setId_matpel(int id_matpel) {
        this.id_matpel = id_matpel;
    }

    public String getNama_matpel() {
        return nama_matpel;
    }

    public void setNama_matpel(String nama_matpel) {
        this.nama_matpel = nama_matpel;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public ResultSet tampilDataMatpel() {
        ResultSet hasil = null;
        String CRUDquery = "SELECT * FROM matpel";
        try {
            Statement CRUDstat = CRUDkoneksi.createStatement();
            hasil = CRUDstat.executeQuery(CRUDquery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return hasil;
    }

    public String simpanDataMatpel(int id_matpel, String nama_matpel, String waktu) {
        CRUDquery = "INSERT INTO matpel (id_matpel, nama_matpel, waktu) VALUES (?,?,?)";
        String message = "";
        try {
            CRUDpsmt = CRUDkoneksi.prepareStatement(CRUDquery);
            CRUDpsmt.setInt(1, id_matpel);
            CRUDpsmt.setString(2, nama_matpel);
            CRUDpsmt.setString(3, waktu);
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

    public String ubahDataMatpel(int id_matpel, String nama_matpel, String waktu) {
        CRUDquery = "UPDATE matpel SET nama_matpel=?, waktu=? WHERE id_matpel=?";
        String message = "";
        try {
            CRUDpsmt = CRUDkoneksi.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, nama_matpel);
            CRUDpsmt.setString(2, waktu);
            CRUDpsmt.setInt(3, id_matpel);
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

    public String hapusDataMatpel(int id_matpel) {
        CRUDquery = "DELETE FROM matpel WHERE id_matpel=?";
        String message = "";
        try {
            CRUDpsmt = CRUDkoneksi.prepareStatement(CRUDquery);
            CRUDpsmt.setInt(1, id_matpel);
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

    public String[] cariDataMatpel(int id_matpel) {
        CRUDquery = "SELECT * FROM matpel WHERE id_matpel=?";
        String[] dataArray = new String[3];
        try {
            CRUDpsmt = CRUDkoneksi.prepareStatement(CRUDquery);
            CRUDpsmt.setInt(1, id_matpel);
            CRUDhasil = CRUDpsmt.executeQuery();

            if (CRUDhasil.next()) {
                dataArray[0] = Integer.toString(CRUDhasil.getInt("id_matpel"));
                dataArray[1] = CRUDhasil.getString("nama_matpel");
                dataArray[2] = CRUDhasil.getString("waktu");
                return dataArray;
            } else {
                System.out.println("Data not found");
            }
            CRUDpsmt.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return dataArray;
    }

    public ResultSet CariData(int id) {
        ResultSet resultSet = null;
        try {
            String query = "SELECT * FROM matpel WHERE id_matpel = ?";
            PreparedStatement preparedStatement = CRUDkoneksi.prepareStatement(query);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }
}
