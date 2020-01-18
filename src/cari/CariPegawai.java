/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cari;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class CariPegawai {
    
        String user="root";
        String pwd="";
        String host="localhost";
        String db="db_lapangan";
        String urlValue="";
    
    public void main() throws IOException{
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(inputStreamReader);
        
        int no;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            urlValue="jdbc:mysql://"+host+"/"+db+"?user="+user+"&password="+pwd;
            Connection conn = (Connection) DriverManager.getConnection(urlValue);
            Statement st = conn.createStatement();
            System.out.print("Masuukan Nama Pegawai : ");
            ResultSet rs = st.executeQuery("SELECT * FROM pegawai where nama_pegawai LIKE '%"+input.readLine()+"%'");
            
            no = 0;
            while(rs.next())
            {
                no = no+1;
                System.out.println("");
                System.out.println("Nama Pegawai : "+rs.getString("nama_pegawai"));
                System.out.println("Username : "+ rs.getString("username"));
                System.out.println("Password : "+ rs.getString("password"));   
            }
            if(no == 0){
                System.out.println("Data Tidak Di Temukan!!");
            }
            st.close();
            conn.close();        
            
        }catch(Exception e){
            System.out.println("Koneksi Gagal "+e.getMessage());
        }
    }
    
}
