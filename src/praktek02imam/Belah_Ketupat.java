package praktek02imam;
public class Belah_Ketupat {
    double sisi;
    double panjang;
    
    void cetakInfo(){
        System.out.println("======================");
        System.out.println("Sisi    : "+sisi);
        System.out.println("Panjang : "+panjang);
        System.out.println("======================");
    }
    
    double hitungKeliling(){
        double keliling;
        keliling=sisi*panjang;
        return keliling;
    }
    
    void cetakKeliling(){
        System.out.println("Kelilingnya adalah : "+hitungKeliling());
    }
    
    
}
