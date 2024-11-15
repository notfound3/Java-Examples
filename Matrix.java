public class Matrix
{
    public static void main(String[] args)
    {

        int[][] array = 
        {
            {1, 2},
            {3, 4},
            {5, 6}
        };

        System.out.println("İki boyutlu dizi:");
        for (int i = 0; i < array.length; i++) 
        {
            for (int j = 0; j < array[i].length; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
