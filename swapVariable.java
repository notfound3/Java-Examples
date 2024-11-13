import java.util.*;

public class swapVariable
{
     public static void main(String[] args) 
    {
       int x = 15, y = 7, temp;
       
       System.out.println("Before the swap:" + x + " " + y );

       temp = x;
       x = y;
       y = temp;

       System.out.println("After the swap:" + x + " " + y);

    }
}