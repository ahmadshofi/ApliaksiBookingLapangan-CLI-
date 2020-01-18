/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pegawai;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class MenuPegawai {
    public void main() throws IOException{
        Scanner s = new Scanner(System.in);
        System.out.println("MENU PEGAWAI");
        System.out.println("1.Input Pegawai");
        System.out.println("2.Hapus Pegawai");
        System.out.print("Masukkan Pilihan : ");
        int pilih = s.nextInt();
        
        switch(pilih){
            case 1 : 
                InputPegawai IP = new InputPegawai();
                IP.menu();
                break;
            case 2 :
                HapusPegawai HP = new HapusPegawai();
                HP.menu();
                break;
        }
        
    }
    
}
