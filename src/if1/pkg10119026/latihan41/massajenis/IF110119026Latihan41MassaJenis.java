/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119026.latihan41.massajenis;

/**
 *
 * @author Asus
 * NAMA         : Muhammad Khatami
 * KELAS        : IF-1
 * NIM          : 10119026
 * Deskripsi Program : program ini untuk menghitung massa jenis kubus
 */
public class IF110119026Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kubus cube = new Kubus();
        cube.setSisi(5);
        cube.setMassa(250);
        int volume = cube.hitungVolume(cube.getSisi());
        int massaJenis = cube.hitungMassaJenis(volume, cube.getMassa());
        System.out.println("=====Massa Jenis Kubus=====");
        System.out.println("Sisi : " +cube.getSisi());
        System.out.println("Massa : " +cube.getMassa());
        
        System.out.println("=====Hasil Perhitungan=====");
        System.out.println("Volume : " + volume);
        System.out.println("Massa Jenis : " + massaJenis);
    }
    
}
