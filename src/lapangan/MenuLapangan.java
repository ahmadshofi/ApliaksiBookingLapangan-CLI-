/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapangan;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class MenuLapangan {
    
    public void main() throws IOException{
        Scanner s = new Scanner(System.in);
        System.out.println("MENU LAPANGAN");
        System.out.println("1.Input Lapangan");
        System.out.println("2.Hapus Lapangan");
        System.out.print("Masukkan Pilihan : ");
        int pilih = s.nextInt();
        
        switch(pilih){
            case 1 : 
                System.out.println("");
                InputLapangan IL = new InputLapangan();
                IL.menu();
                break;
            case 2 :
                 System.out.println("");
                 HapusLapangan HL = new HapusLapangan();
                 HL.menu();
                break;
        }
    }
    
}
