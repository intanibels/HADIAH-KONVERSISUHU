/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hadiah.konversisuhu;
import java.util.Scanner;
/**
 *
 * @author Intan
 */
public class HadiahKonversiSuhu {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Membuat Scanner
        Scanner input = new Scanner (System.in);
        double suhu, hasil;
        //Membuat judul
        System.out.print("\n Konversi Suhu dari Celcius \n");
        //membuat pilihan
        String[] konversi = {" ", "Fahrenheit", "Kelvin", "Reamur"};
        for(int a = 1; a < konversi.length; a++){
            System.out.println(a+". "+konversi[a]);}
        System.out.print("Masukkan Pilihan anda : ");
        int pilihan = input.nextInt();
        //program
        switch (pilihan) {
            case 1 :
                System.out.println("Koversi suhu dari Celcius ke Fahrenheit");
                System.out.print("Masukkan suhu : ");
                suhu = input.nextDouble();
                hasil = (9*suhu/5)+32;
                System.out.println("Hasil Koversi Suhu : (9/5*"+suhu+")+32 = "+hasil+" F");
                break;
            case 2 :
                System.out.println("Koversi suhu dari Celcius ke Kelvin");
                System.out.print("Masukkan suhu : ");
                suhu = input.nextDouble();
                hasil = suhu+273;
                System.out.println("Hasil Koversi Suhu : "+suhu+"+273 = "+hasil+" K");
                break;
            case 3 :
                System.out.println("Koversi suhu dari Celcius ke Reamur");
                System.out.print("Masukkan suhu : ");
                suhu = input.nextDouble();
                hasil = 4*suhu/5;
                System.out.println("Hasil Koversi Suhu : 4/5*"+suhu+" = "+hasil+" R");
                break;
            default :
                System.out.println("Anda salah memasukkan kode");
        }
    }   
}
