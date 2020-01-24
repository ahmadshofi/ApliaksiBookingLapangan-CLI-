/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cari;

import apliaksibookinglapangan.cli.MenuUtama;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class MenuCari {
    public void main() throws IOException{
        Scanner s = new Scanner(System.in);
        System.out.println("MENU PENCARIAN");
        System.out.println("1.Cari Pegawai Berdasarkan Username");
        System.out.println("2.Cari Penyewa");
        System.out.print("Masukkan Pilihan : ");
        int pilih = s.nextInt();
        
        switch(pilih){
            case 1: 
                  CariPegawai CP = new CariPegawai();
                  CP.main();
                break;
            case 2:
                  CariPenyewa CPP = new CariPenyewa();
                  CPP.main();
                break;
            case 3:
                  MenuUtama MU = new MenuUtama();
                   MU.main();
                break;
        }
        
    }
    
}
