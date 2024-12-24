class Fizik extends Ders {
    public Fizik(String DersAd, String DersSinif) {
        super(DersAd, DersSinif);
    }

    @Override
    public String IsimGetir() {
        return "Ders Adi: " + this.DersAd;
    }

    @Override
    public String SinifGetir() {
        return "Ders Sinifi: " + this.DersSinif;
    }

    @Override
    public void SozluSunum() {
        System.out.println("Fizik dersi sözlü sunum yapiliyor.");
    }

    @Override
    public void YaziliSunum() {
        System.out.println("Fizik dersi yazili sunum yapiliyor.");
    }
}