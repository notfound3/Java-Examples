package lab8;

import lab8.uygulama.body;
import lab8.uygulama.Cubebody;
import lab8.uygulama.SphereBody;
import java.util.*;

public class test{
    public static void main(String[] args){
        Cubebody cube = new Cubebody(2.5, 3.0);
        SphereBody sphere = new SphereBody(1.5, 4.0);

        Vector<body> bodies = new Vector<>();
        bodies.add(cube);
        bodies.add(sphere);
        
        for(body body: bodies){
            System.out.println(body);
        }
    }
} 
