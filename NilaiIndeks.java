// Menentukan nilai indeks akhir mahasiswa A,B,C,D atau E berdasarkan Nilai Akhir (NA) 
// dari perihitungan komponen nilai UTS,UAS dan Tugas, dengan bobot nilai berturut
// turut adalah 35%,45% dan 20%

import java.util.Scanner;

public class NilaiIndeks {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        double nilaiUTS, nilaiUAS, nilaiTugas, nilaiAkhir;
        char indeks = '-';

        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = myObj.nextDouble();

        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = myObj.nextDouble();

        System.out.print("Masukkan nilai Tugas: ");
        nilaiTugas = myObj.nextDouble();

        nilaiAkhir = ((0.35 * nilaiUTS) + (0.45 * nilaiUAS) + (0.20 * nilaiTugas));

        if((nilaiAkhir >= 80) && (nilaiAkhir <=100)){
            indeks = 'A';
        }else if((nilaiAkhir >= 70) && (nilaiAkhir < 80)){
            indeks = 'B';
        }else if((nilaiAkhir >= 50) && (nilaiAkhir < 70)){
            indeks = 'C';
        }else if((nilaiAkhir >= 40) && (nilaiAkhir < 50)){
            indeks = 'D';
        }else if(nilaiAkhir < 40){
            indeks = 'E';
        }else{
            System.out.println("\nMasukkan nilai hanya dari 1 - 100");
        }
        
        System.out.printf("\nNilai akhir %.2f mendapatkan indeks akhir %c", nilaiAkhir, indeks);

        myObj.close();
    }
}
