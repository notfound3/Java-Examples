
import java.util.Arrays;

public class ArrayComparison
{
    public static void main(String[] args)
     {
    
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};

        if (Arrays.equals(array1, array2)) 
        {
            System.out.println("İki dizi birbirine eşittir.");
        } else 
        {
            System.out.println("İki dizi birbirine eşit değildir.");
        }
    }
}
