import java.util.Scanner;

public class MetinIsleme 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir cumle girin: ");
        String cumle = scanner.nextLine(); //burda cümle alma

        String[] kelimeler = cumle.split(" ");//cümleyi kelimelere bölme
        
        int toplamKarakterSayisi = 0;

        for (String kelime : kelimeler) 
        {
            System.out.println("Kelime: " + kelime);
            
            toplamKarakterSayisi += kelime.length();
            
            if (kelime.length() < 4) 
            {
                System.out.println("Kisa Kelime");
            } 
            else 
            {
                String buyukHarfIlk = kelime.substring(0, 1).toUpperCase() + kelime.substring(1).toLowerCase();
                System.out.println("Buyuk Harf Ilk: " + buyukHarfIlk);

                String tersBuyukHarfIlk = new StringBuilder(buyukHarfIlk).reverse().toString();
                System.out.println("Ters (Buyuk Harf Ilk): " + tersBuyukHarfIlk);
            }
        }

        System.out.println("Toplam Karakter Sayisi: " + toplamKarakterSayisi);

        scanner.close();
    }
}
