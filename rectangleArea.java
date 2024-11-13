import java.util.*;

public class rectangleArea 
{
     public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int height, widht, area;
        System.out.println("Enter the widht for the rectangle:");
        widht = in.nextInt();
        System.out.println("Enter the height of the rectangle:");
        height = in.nextInt();
        area = (widht*height)/2;
        System.out.println("The area of the rectangle is:" + area);


    }
}