/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan63.gradiengarislurus;

/*
 NAMA       : Cessario Sheva L.P.A
 KELAS      : IF-2
 MATAKULIAH : PBO2
 NIM        : 10117050
 DESKRIPSI PROGRES : menghitung gradien yang melalui titik
 */
public class PBO210117063Latihan63GradienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Koordinat nKoordinat = new Koordinat(2, 10, 5, 7);
        System.out.println("Garis yang melalui titik ("+nKoordinat.getX1()+","+nKoordinat.getY1()+") dan ("+nKoordinat.getX2()+","+nKoordinat.getY2()+")");
        System.out.println("memiliki gradien sebesar " + nKoordinat.hitungGradien());
        
        Koordinat nKoordinat2 = new Koordinat(5, 1, 3, 12);
        System.out.println("Garis yang melalui titik ("+nKoordinat2.getX1()+","+nKoordinat2.getY1()+") dan ("+nKoordinat2.getX2()+","+nKoordinat2.getY2()+")");
        System.out.println("memiliki gradien sebesar " + nKoordinat2.hitungGradien());
    }
    
}
