package homework_week4_maninisheth;

import java.util.Scanner;

/**
 * 3. Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */
public class VowelOrConsonant {
    public static void main(String[] args) {
        //scanner declaration
        Scanner scan = new Scanner(System.in);

        System.out.print("Input an alphabet: ");
        String input = scan.next().toLowerCase();

        boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
        boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
        boolean vowels = input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o") || input.equals("u");

        if (input.length() > 1) {
            System.out.println("Error. Not a single Character.");
        } else if (!(uppercase || lowercase)) {
            System.out.println("Error. Not  letter. Enter uppercse or lowercase letter.");
        } else if (vowels) {
            System.out.println("Input letter is Vowel");
        } else {
            System.out.println("Input letter is consonant");
        }
        scan.close();
    }
}
