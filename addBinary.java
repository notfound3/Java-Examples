import java.util.*;

public class addBinary
{
     public static void main(String[] args) 
    {
       Scanner in = new Scanner(System.in);

       long bi1, bi2;
       int i = 0, reminder = 0;

       int[] sum = new int[20];

       System.out.print("Enter the first binary number:");
       bi1 = in.nextLong();
       System.out.print("Enter the second binary number:");
       bi2 = in.nextLong();

       while(bi1 != 0 || bi2 != 0)
       {
         sum[i++] = (int)((bi1 % 10 + bi2 %10 + reminder)%2);
         reminder = (int)((bi1 % 10 + bi2 % 10 + reminder) /2);
         bi1 = bi1 / 10;
         bi2 = bi2 / 10;

       }

       if(reminder!=0)
       {
         sum[i++]= reminder;
       }

       i--;

       System.out.print("Sum of two binary numbers: ");
       while(i >= 0)
       {
         System.out.print(sum[i--]);

       }

    }
}