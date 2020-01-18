/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lihatdata;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Asus
 */
public class LihatDataPegawai {
    
        String user="root";
        String pwd="";
        String host="localhost";
        String db="db_lapangan";
        String urlValue="";
    
    public void main() throws IOException{
        
        int no;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            urlValue="jdbc:mysql://"+host+"/"+db+"?user="+user+"&password="+pwd;
            Connection conn = (Connection) DriverManager.getConnection(urlValue);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM pegawai");
            
            no = 0;
            while(rs.next())
            {
                no=no+1;
                System.out.print("Username : "+rs.getString("username")+ " ");
                System.out.print("Nama Pegawai : "+rs.getString("nama_pegawai")+ " ");
                System.out.print("Password : "+rs.getString("password")+ " ");    
                System.out.println("");
            }
            if(no == 0){
                System.out.println("Data Pegawai Tidak Di Temukan!!");
            }
            st.close();
            conn.close();
        }catch(Exception e){
            System.out.println("Koneksi Gagal "+e.toString());
        }
            
    }
    
}
