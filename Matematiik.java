class Matematik extends Ders {
    public Matematik(String DersAd, String DersSinif) {
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
        System.out.println("Matematik dersi sözlü sunum yapiliyor.");
    }

    @Override
    public void YaziliSunum() {
        System.out.println("Matematik dersi yazili sunum yapiliyor.");
    }
}