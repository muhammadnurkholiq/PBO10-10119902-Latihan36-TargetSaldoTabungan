/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10.pkg10119902.latihan36.targetsaldotabungan;

/**
 *
 * @author 
 * NAMA    : Muhammad Nurkholiq
 * KELAS   : PBO10K
 * NIM     : 10119902
 * Deskripsi Program : Program Ini Berisi Program Untuk Menampilkan Program Target Saldo Tabungan
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=1;
        Tabungan tabungan = new Tabungan();
        Tampilkan(tabungan);
    }
    
    public static void Tampilkan(Tabungan tabungan)
    {
        int i = 1;
         while(tabungan.saldo <= tabungan.saldoTarget){
            tabungan.hitungPerbulan();
            System.out.printf("Saldo di bulan ke-%d Rp.%,.0f\n", i, tabungan.saldo);
            i++;
        }
    }
    
    
}
