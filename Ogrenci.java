import java.util.ArrayList;

public class Ogrenci {
    private static int ogrenciSayisi = 0;
    private String ad;
    private int sinif;
    private ArrayList<Ders> dersListesi;

    public Ogrenci() {
        this("Bilinmiyor", 0, new ArrayList<>());
    }

    public Ogrenci(String ad, ArrayList<Ders> dersListesi) {
        this(ad, 0, dersListesi);
    }
    
    public Ogrenci(String ad, int sinif, ArrayList<Ders> dersListesi) {
        this.ad = ad;
        this.sinif = sinif;
        this.dersListesi = dersListesi;
        ogrenciSayisi++;
    }

    public void OgrenciBilgisiYaz() {
        System.out.println("Ogrenci adi: " + ad);
        System.out.println("Sinif: " + sinif);
        System.out.println("Toplam ogrenci S-sayisi: " + ogrenciSayisi);
        System.out.println("Alinan ders sayisi: " + dersListesi.size());
    }

    public void OgrenciDersBilgiYaz() {
        System.out.println("--- " + ad + " Adli Öğrencinin Ders Bilgileri ---");
        for (Ders ders : dersListesi) {
            ders.DersBilgisiYaz();
        }
    }

    public void DersEkle(Ders ders) {
        dersListesi.add(ders);
    }
}
