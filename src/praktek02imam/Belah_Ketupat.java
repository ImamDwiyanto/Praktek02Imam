package praktek02imam;
public class Belah_Ketupat {
    double sisi;
    double panjang;

    public Belah_Ketupat() {
        sisi=7;
        panjang=5;
    }

    public Belah_Ketupat(double sisi, double panjang) {
        this.sisi = sisi;
        this.panjang = panjang;
    }
    
    
    
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
