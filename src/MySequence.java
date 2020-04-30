import java.util.Scanner;

public class MySequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = "";

        System.out.println("Enter a word: ");
        word = input.nextLine();

        uniqueCharacters(word);
    }

    public static void uniqueCharacters(String test) {
        String temp = "";

        for (int i = 0; i < test.length(); i++) {
            if (temp.indexOf(test.charAt(i)) == -1) {
                temp = temp + test.charAt(i);
            }
        }

        System.out.println("The answer is " + temp + ", with a length of " + temp.length() + ".");

    }
}
