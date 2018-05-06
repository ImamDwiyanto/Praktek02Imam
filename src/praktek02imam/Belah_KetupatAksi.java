package praktek02imam;

public class Belah_KetupatAksi {
    public static void main(String[] args) {
        Belah_Ketupat rl = new Belah_Ketupat();
        rl.sisi = 5;
        rl.panjang = 7;
        
        rl.cetakInfo();
        System.out.println("Keliling Belah_Ketupat = "+rl.hitungKeliling());
        rl.cetakKeliling();
        
        Belah_Ketupat r2 = new Belah_Ketupat();
        r2.cetakInfo();
        
        Belah_Ketupat r3 = new Belah_Ketupat(70,30);
        r3.cetakInfo();
    }
}
