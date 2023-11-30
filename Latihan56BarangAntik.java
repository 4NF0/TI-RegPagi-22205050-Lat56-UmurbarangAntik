/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan56barangantik;

/**
 *
 * @author nm
 * Nama : Adi Naufal F
 * Nim : 22205050
 * Kelas/Semester : TI/3
 * Deskripsi Program : Program ini berisi tentang umur barang antik radio.
 */
public class Latihan56BarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Radio rdo = new Radio(234);
        rdo.setName("Radio AM");
        System.out.println("Nama Barang Antik : " + rdo.getName());
        rdo.tampilUmur();
    }
    
}
