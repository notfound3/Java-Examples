import java.util.*;

public class Inheritance1
{
     public static void main(String[] args) 
    {
       Hayvan hayvan = new Hayvan("Genel Hayvan");
       Kedi kedi = new Kedi("Minnak");
       Kopek kopek = new Kopek("Karabas");

       hayvan.sesCikar();
       kedi.sesCikar();
       kopek.sesCikar();
    }
}

// Hayvan.java
class Hayvan {
  protected String isim;

  public Hayvan(String isim) {
      this.isim = isim;
  }

  public void sesCikar() {
      System.out.println("Hayvan bir ses cikariyor.");
  }

  public String getIsim() {
      return isim;
  }
}

class Kedi extends Hayvan{
  public Kedi(String isim){
    super(isim);
  }

  public void sesCikar(){
    System.out.println(isim + " " + "miyavliyor.");
  }
}

class Kopek extends Hayvan{
  public Kopek(String isim){
    super(isim);
  }

  public void sesCikar(){
    System.out.println(isim + " " + "havliyor.");
  }
}

