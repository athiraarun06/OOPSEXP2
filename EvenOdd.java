import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
    	System.out.println("URK24CS9012-ATHIRA ARUN ");
        Scanner sc = new Scanner(System.in);
        int[] original = new int[10];
        int[] oddArray = new int[10];
        int[] evenArray = new int[10];
        int oddIndex = 0, evenIndex = 0;

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            original[i] = sc.nextInt();

            if (original[i] % 2 == 0) {
                evenArray[evenIndex++] = original[i] * original[i] * original[i];  
            } else {
                oddArray[oddIndex++] = original[i] * original[i];  
            }
        }
        System.out.print("Original Array: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(original[i]);
            if (i != 9) System.out.print(",");
        }

        System.out.print("\nOdd Array: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddArray[i]);
            if (i != oddIndex - 1) System.out.print(",");
        }

        System.out.print("\nEven Array: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenArray[i]);
            if (i != evenIndex - 1) System.out.print(",");
        }
    }
}