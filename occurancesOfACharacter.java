// package package1;

import java.util.Scanner;

public class occurancesOfACharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Input the character
        System.out.print("Enter a character to count: ");
        char targetChar = scanner.next().charAt(0);  // Take the first character

        int count = 0;

        // Count occurrences of the character
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == targetChar) {
                count++;
            }
        }

        System.out.println("Character '" + targetChar + "' occurs " + count + " times.");
        
        scanner.close();
    }
}

