/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pegawai;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class HapusPegawai {
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
            Scanner s = new Scanner(System.in);
            
            
            String sql ="DELETE FROM pegawai WHERE username= ? ";
            pStatement=(PreparedStatement) conn.prepareStatement(sql);
            
            System.out.println("HAPUS DATA PEGAWAI FUTSAL");
            System.out.print("Masukkan Username Pegawai : ");
            pStatement.setString(1, s.next());
            
                pStatement.executeUpdate();
            try{
                
                System.out.println("Delete Success!!");
            }catch(Exception e){
                System.out.println("Delete Error "+e.getMessage() );
            }
            pStatement.close();
            conn.close();
            
//            System.out.println("Koneksi Sukses");
//            conn.close();
        } catch(SQLException e){
            System.out.println("Delete gagal "+e.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("JDBC Driver tidak ditemukan");
        }
        
    }
    
}
