abstract class Ders implements DersIsle {
    protected String DersAd;
    protected String DersSinif;// Global degişkenler

    public Ders(String DersAd, String DersSinif) {
        this.DersAd = DersAd;
        this.DersSinif = DersSinif;//constractor
    }

    public String IsmiBuyut(String DersAd) {
        return DersAd.toUpperCase();//normal metot
    }

    public abstract String IsimGetir();
    public abstract String SinifGetir();//soyut metoto

    @Override
    public abstract void SozluSunum();

    @Override
    public abstract void YaziliSunum();
}
