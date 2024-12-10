package lab8.uygulama;

public abstract class body {
    public double density = 1.0;

    public body(double density){
        this.density=density;
    }

    public double getDensity(){
        return density;
    }

    public double getMass(){
        return density*getVolume();
    }

    public abstract double getVolume();

}
