
import java.util.Scanner;

public class InsertionSortExample
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];

        System.out.println("5 elemanli bir dizi olusturmak için degerleri girin:");
        for (int i = 0; i < array.length; i++) 
        {
            System.out.print("Eleman " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        for (int i = 1; i < array.length; i++) 
        {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) 
            {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }

        System.out.println("Siralanmis dizi:");
        for (int num : array) 
        {
            System.out.print(num + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}
