package lab8.uygulama;

public class Cubebody extends body {
    public double edge = 1.0;

    public Cubebody(double density, double edge){
        super(density);
        this.edge=edge;
    }

    @Override
    public double getVolume(){
        return Math.pow(edge, 3);
    }

    @Override
    public String toString() {
        return "CubeBody [Density: " + density + ", Edge: " + edge + ", Volume: " + getVolume() + ", Mass: " + getMass() + "]";
    }
}
