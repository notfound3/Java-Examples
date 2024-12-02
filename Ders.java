public class Ders {
    private static int dersSayisi = 0;
    private String ad;
    private int sinif;
    private String hoca;

    public Ders(String ad) {
        this(ad, 0, "Bilinmiyor");
    }

    public Ders(String ad, int sinif, String hoca) {
        this.ad = ad;
        this.sinif = sinif;
        this.hoca = hoca;
        dersSayisi++;
    }

    public void DersBilgisiYaz() {
        System.out.println("Ders Adi: " + ad);
        System.out.println("Sinif: " + sinif);
        System.out.println("Hoca: " + hoca);
    }

    public static void DersSayiBilgisiYaz() {
        System.out.println("Toplam Ders Sayisi: " + dersSayisi);
    }
}
