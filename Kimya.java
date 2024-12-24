class Kimya extends Ders {
    public Kimya(String DersAd, String DersSinif) {
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
        System.out.println("Kimya dersi sözlü sunum yapiliyor.");
    }

    @Override
    public void YaziliSunum() {
        System.out.println("Kimya dersi yazili sunum yapiliyor.");
    }
}
