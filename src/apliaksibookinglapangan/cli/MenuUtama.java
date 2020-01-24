/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apliaksibookinglapangan.cli;

import cari.MenuCari;
import java.io.IOException;
import java.util.Scanner;
import lapangan.MenuLapangan;
import lihatdata.MenuLihatData;
import pegawai.MenuPegawai;
import penyewa.SewaLapangan;

/**
 *
 * @author Asus
 */
public class MenuUtama {
    public void main() throws IOException{
         Scanner input = new Scanner(System.in);
        System.out.println("APLIKASI BOOKING LAPANGAN FUTSAL YPKP");
        System.out.println("1.Lapangan");
        System.out.println("2.Pegawai");
        System.out.println("3.Penyewa");
        System.out.println("4.Lihat Data");
        System.out.println("5.Cari Pegawai");
        System.out.println("6.EXIT");
        System.out.print("Masukkan Pilihan : ");
        int pilih = input.nextInt();

        switch(pilih){
            case 1: 
                    System.out.println("");
                    MenuLapangan ML = new MenuLapangan();
                    ML.main();
                    break;

            case 2: 
                    System.out.println("");
                    MenuPegawai MP = new MenuPegawai();
                    MP.main();
                    break;
            case 3:
                    System.out.println("");
                    SewaLapangan sw = new SewaLapangan();
                    sw.menu();
                    break;
            case 4:
                    System.out.println("");
                    MenuLihatData MLD = new MenuLihatData();
                    MLD.main();
                    break;
            case 5: 
                    System.out.println("");
                    MenuCari MN = new MenuCari();
                    MN.main();
                break;
                
                
        }
    }
    
}
