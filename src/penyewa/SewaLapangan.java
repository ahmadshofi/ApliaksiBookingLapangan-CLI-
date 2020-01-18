/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penyewa;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Asus
 */
public class SewaLapangan {
    
        String user="root";
        String pwd="";
        String host="localhost";
        String db="db_lapangan";
        String urlValue="";
    
    public void menu() throws IOException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            urlValue="jdbc:mysql://"+host+"/"+db+"?user="+user+"&password="+pwd;
            
            Connection conn = (Connection) DriverManager.getConnection(urlValue);
            
            PreparedStatement pStatement = null;
//            Scanner masukan = new Scanner(System.in);
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader input = new BufferedReader(inputStreamReader);
            
            
            String sql ="INSERT INTO `penyewa`(`nama_club`,`no_tlp`)"+"VALUES(?,?);";
            pStatement=(PreparedStatement) conn.prepareStatement(sql);
            
            System.out.println("SEWA LAPANGAN FUTSAL");
            System.out.print("Masukkan Nama Club : ");
            pStatement.setString(1, input.readLine());
            
            System.out.print("Masukkan No Telepon :");
            pStatement.setString(2, input.readLine());
            
            int intBaris=pStatement.executeUpdate();
            if(intBaris>0)
            {
                System.out.println("Penambahan Data Berhasil");
            }else{
                System.out.println("Penambahan data Gaagal");
            }
            pStatement.close();
            conn.close();
            
//            System.out.println("Koneksi Sukses");
//            conn.close();
        } catch(SQLException e){
            System.out.println("Koneksi Gagal "+e.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("JDBC Driver tidak ditemukan");
        }
        
    }
    
}
