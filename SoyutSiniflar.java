
// Ana sınıf (main metodu)
public class SoyutSiniflar {
    public static void main(String[] args) {
        // Matematik nesnesi
        Matematik matematik = new Matematik("Matematik", "10. Sinif");
        System.out.println(matematik.IsimGetir());
        System.out.println(matematik.SinifGetir());
        System.out.println("Buyuk Harf: " + matematik.IsmiBuyut(matematik.DersAd));
        matematik.SozluSunum();
        matematik.YaziliSunum();

        System.out.println();

        // Fizik nesnesi
        Fizik fizik = new Fizik("Fizik", "11. Sinif");
        System.out.println(fizik.IsimGetir());
        System.out.println(fizik.SinifGetir());
        System.out.println("Buyuk Harf: " + fizik.IsmiBuyut(fizik.DersAd));
        fizik.SozluSunum();
        fizik.YaziliSunum();

        System.out.println();

        // Kimya nesnesi
        Kimya kimya = new Kimya("Kimya", "12. Sinif");
        System.out.println(kimya.IsimGetir());
        System.out.println(kimya.SinifGetir());
        System.out.println("Buyuk Harf: " + kimya.IsmiBuyut(kimya.DersAd));
        kimya.SozluSunum();
        kimya.YaziliSunum();
    }
}
