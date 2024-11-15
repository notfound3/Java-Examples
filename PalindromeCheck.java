import java.util.Scanner;

public class PalindromeCheck 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir cumle girin: ");
        String sentence = scanner.nextLine();
        
        String cleanedSentence = sentence.replaceAll("\\s+", "").toLowerCase(); //hepsini küçük yapıp boşluğu kaldırma

        boolean isPalindrome = true;
        int length = cleanedSentence.length();
        
        for (int i = 0; i < length / 2; i++) 
        {
            if (cleanedSentence.charAt(i) != cleanedSentence.charAt(length - 1 - i)) 
            {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
         {
            System.out.println("Girilen cumle bir palindromdur.");
        } else 
         {
            System.out.println("Girilen cumle bir palindrom değildir.");
        }
        
        scanner.close();
    }
}