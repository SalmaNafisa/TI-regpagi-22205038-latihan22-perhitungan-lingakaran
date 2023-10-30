/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perhitungan.lingkaran;
import java.util.Scanner;
/**
 *
 * @author ASUS TUF
 */
public class PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menerima input diameter lingkaran
        System.out.println("=====Perhitungan Lingkaran=====");
        System.out.print("Masukkan diameter lingkaran: ");
        int diameter = input.nextInt();

        // Menghitung jari-jari lingkaran
        int jariJari = diameter / 2;

        // Menghitung luas lingkaran
        double luasLingkaran = Math.PI * jariJari * jariJari;

        // Menghitung keliling lingkaran
        double kelilingLingkaran = Math.PI * diameter;

        // Menampilkan hasil
        System.out.println("=====Hasil Perhitungan Lingkaran=====");
        System.out.println("Jari-jari lingkaran: " + jariJari);
        System.out.println("Luas lingkaran: " + luasLingkaran);
        System.out.println("Keliling lingkaran: " + kelilingLingkaran);
    }
    
}
