package lab8.uygulama;


public class SphereBody extends body{
    public double radius;

    public SphereBody(double density, double radius){
        super(density);
        this.radius=radius;
    }

    public double radius(){
        return radius;
    }

    @Override
    public double getVolume(){
        return(4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return "SphereBody [Density: " + density + ", Radius: " + radius + ", Volume: " + getVolume() + ", Mass: " + getMass() + "]";
    }
}
