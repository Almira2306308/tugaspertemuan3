// Sebuah acara wisata akam menggunakan mobil berkapasitas 7 penumpang per mobil. 
// Apabila terjadi kelebihan penumpang (meskipun hanya 1 orang), maka mobil yang 
// digunakan ditambah 1. Buat program untuk menghitung jumlah mobil yang diperlukan 
// berdasarkan jumlah peserta yang akan ikut.

import java.util.Scanner;

public class JumlahMobil {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        int penumpang, mobil = 0;

        System.out.print("Masukkan jumlah penumpang: ");
        penumpang = myObj.nextInt();

        if(penumpang <= 7){
            mobil += 1;
        }else if(penumpang % 7 != 0){
            mobil = (penumpang / 7) + 1;
        }else{
            mobil = penumpang / 7;
        }

        System.out.println("Jumlah penumpang " + penumpang + " menggunakan " + mobil + " mobil");

        myObj.close();
    }
}
