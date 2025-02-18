// Buatlah algoritma dalam bahasa Java, yang menerima masukan berupa 2 buah bilangan
// integer, jika kedua masukan adalah bilangan genap maka tampilkan hasil penjumlahan
// keduanya, jika keduanya bilangan ganjil maka tampilkan perkalian keduanya.

import java.util.Scanner;

public class OperasiDuaBilangan {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        int bilanganPertama, bilanganKedua, hasil;

        System.out.print("Masukkan bilangan integer pertama: ");
        bilanganPertama = myObj.nextInt();

        System.out.print("Masukkan bilangan integer kedua: ");
        bilanganKedua = myObj.nextInt();

        if((bilanganPertama % 2 == 0) && (bilanganKedua % 2 == 0)){
            hasil = bilanganPertama + bilanganKedua;
            System.out.println("\nHasil penjumlahan " + bilanganPertama + " dan " + bilanganKedua + " adalah " + hasil);
        }else if(bilanganPertama % 2 != 0 && bilanganKedua % 2 != 0){
            hasil = bilanganPertama * bilanganKedua;
            System.out.println("\nHasil perkalian " + bilanganPertama + " dan " + bilanganKedua + " adalah " + hasil);
        }else{
            System.out.println("\nKedua bilangan harus sama-sama bernilai genap atau ganjil");
        }

        myObj.close();
    }
}