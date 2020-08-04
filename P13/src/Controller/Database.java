package Controller;

import Model.mahasiswa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Yanuar Wanda Putra
 */
public class Database {
    public final String driver = "com.mysql.jdbc.Driver";
    public final String url = "jdbc:mysql://localhost/dbmahasiswa";
    public final String user = "root";
    public final String pass = "";
    
    public ArrayList<mahasiswa> tampilSemuaMahasiswa(){
        ArrayList<mahasiswa> list = new ArrayList<mahasiswa>();
        Connection conn = null;
        Statement stmt = null;
        
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM mahasiswa";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
                list.add(new mahasiswa(
                    rs.getString("nim"), rs.getString("nama"),
                    rs.getString("jenis_kelamin"), rs.getInt("Tinggi")
                ));
            }
            rs.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                stmt.close();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            
            try {
                conn.close();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            
            return list;
        }
    }
    public void tambahMahasiswa(mahasiswa m) {
        Connection conn = null;
        Statement stmt = null;
        
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
            String sql = "INSERT INTO mahasiswa VALUES ('" + m.getNim() + "', '" + m.getNama() + "', '" + m.getJenisKelamin() + "', '" + m.getTinggi() + "');";
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
          try {
            stmt.close();
          } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());  
          }
          
          try {
            conn.close();
          } catch (Exception e) {
              System.out.println("Error: " + e.getMessage());
          }
        }
    }
    public void hapusMahasiswa(String nim) {
        Connection conn = null;
        Statement stmt = null;
        
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
            String sql = "DELETE FROM mahasiswa WHERE nim = '" + nim + "';";
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                stmt.close();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            
            try {
                conn.close();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
    public void updateMahasiswa(mahasiswa m) {
        Connection conn = null;
        Statement stmt = null;
        
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
            String sql = "UPDATE mahasiswa SET nama = '" + m.getNama() + "', jenis_kelamin = '" + m.getJenisKelamin() + "', tinggi = '" + m.getTinggi() + "' WHERE nim = '" + m.getNim() + "';";
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                stmt.close();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            
            try {
                conn.close();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
    public mahasiswa pilihMahasiswa(String nim) {
        mahasiswa m = null;
        Connection conn = null;
        Statement stmt = null;
        
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM mahasiswa WHERE nim = '" + nim +"';";
            ResultSet rs = stmt.executeQuery(sql);
            
            if (rs.next()) {
                m = new mahasiswa(rs.getString("nim"), rs.getString("nama"), rs.getString("jenis_kelamin"), rs.getInt("tinggi"));
            } else {
                m = null;
            }
            
            rs.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                stmt.close();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            
            try {
                conn.close();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            
            return m;
        }
    }
    public ArrayList<mahasiswa> filterMahasiswa(String kataKunci) {
        ArrayList<mahasiswa> listMahasiswa = new ArrayList<mahasiswa>();
        Connection conn = null;
        Statement stmt = null;
        
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM mahasiswa WHERE nama like '%" + kataKunci + "%'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                listMahasiswa.add(new mahasiswa(rs.getString("nim"), rs.getString("nama"), rs.getString("jenis_kelamin"), rs.getInt("tinggi")));
            }
            rs.close();
        } catch (Exception e ){ 
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                stmt.close();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            
            try {
                conn.close();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            
            return listMahasiswa;
        }
    }
}
