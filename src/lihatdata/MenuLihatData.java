/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lihatdata;

import apliaksibookinglapangan.cli.MenuUtama;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class MenuLihatData {
    
    public void main() throws IOException{
        Scanner s = new Scanner(System.in);
        System.out.println("1.Lihat Data Pegawai : ");
        System.out.println("2.Lihat Data Transaksi : ");
        System.out.println("3. Kembali Ke menu Utama");
        System.out.print("Masukkan Pilihan : ");
        int pilih = s.nextInt();
        
        switch(pilih){
            case 1: 
                LihatDataPegawai LDP = new LihatDataPegawai();
                LDP.main();
                break;
            case 2:
                LihatDataTransaksi LDT = new LihatDataTransaksi();
                break;
            case 3:
                MenuUtama MU = new MenuUtama();
                MU.main();
                break;
        }
    }
    
}
