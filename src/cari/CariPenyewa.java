/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cari;

import com.mysql.jdbc.Connection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Asus
 */
public class CariPenyewa {
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
            System.out.print("\nMasukan Nama Club : ");
            ResultSet rs = st.executeQuery("SELECT * FROM penyewa where nama_club LIKE '%"+input.readLine()+"%'");
            
            no = 0;
            while(rs.next())
            {
                no = no+1;
                System.out.println("");
                System.out.println("ID CLUB : "+rs.getString("id_penyewa"));
                System.out.println("Nama Club : "+ rs.getString("nama_club"));
                System.out.println("No Telepon : "+ rs.getString("no_tlp"));   
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
