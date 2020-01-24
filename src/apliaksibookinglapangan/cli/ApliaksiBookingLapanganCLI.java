/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apliaksibookinglapangan.cli;

import cari.MenuCari;
import lapangan.InputLapangan;
import penyewa.SewaLapangan;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import javax.swing.JOptionPane;
import lapangan.MenuLapangan;
import lihatdata.MenuLihatData;
import pegawai.MenuPegawai;
import static sun.org.mozilla.javascript.internal.Context.exit;

/**
 *
 * @author Asus
 */



public class ApliaksiBookingLapanganCLI {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
           MenuUtama MU = new MenuUtama();
           MU.main();
    }

 }
    
