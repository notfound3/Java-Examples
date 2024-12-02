import java.util.*;

public class ClassesAndMethods {
    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci();
        ogrenci1.OgrenciBilgisiYaz();

        ArrayList<Ders> dersListesi2 = new ArrayList<>();
        dersListesi2.add(new Ders("Matematik"));
        Ogrenci ogrenci2 = new Ogrenci("Ali", dersListesi2);
        ogrenci2.OgrenciBilgisiYaz();

        ArrayList<Ders> dersListesi3 = new ArrayList<>();
        dersListesi3.add(new Ders("Fizik", 2, "Prof. Dr. Ahmet"));
        Ogrenci ogrenci3 = new Ogrenci("Ayşe", 3, dersListesi3);
        ogrenci3.OgrenciBilgisiYaz();

        Ders kimya = new Ders("Kimya", 1, "Dr. Mehmet");
        ogrenci3.DersEkle(kimya);

        ogrenci2.OgrenciDersBilgiYaz();
        ogrenci3.OgrenciDersBilgiYaz();

        Ders.DersSayiBilgisiYaz();
    }
}
