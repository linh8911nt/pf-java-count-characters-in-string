import java.util.Scanner;

public class CountLetterInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String anyString = input.nextLine();
        System.out.println("Number of letters in string " + anyString + " is: " + countLetters(anyString));
    }

    public static int countLetters(String anyString) {
        int count = 0;
        for (int i = 0; i < anyString.length(); i++) {
            count++;
        }
        return count;
    }
}
