import java.util.Scanner;

public class Charac {
    public static void main(String[] args) {
    	System.out.println("URK24CS9012-ATHIRA ARUN ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the characters: ");
        String input = sc.nextLine().toLowerCase();

        int vowels = 0, consonants = 0;
        boolean[] there = new boolean[256];  
        boolean[] printed = new boolean[256];

        System.out.print("Duplicate Characters are: ");
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
                if (there[ch] && !printed[ch]) {
                    System.out.print(ch + " ");
                    printed[ch] = true;
                }
                there[ch] = true;
            }
        }

        System.out.println("\nNumber of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }
}