import java.util.Scanner;

public class Lab_05_Conditionals_BirthMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your birth month using a number 1–12: ");

        if (in.hasNextInt()) {
            int birthMonth = in.nextInt();

            if (birthMonth >= 1 && birthMonth <= 12) {
                System.out.println("Your birth month is: " + birthMonth);
            } else {
                System.out.println("You entered an incorrect month value: " + birthMonth);
            }
        } else {
            String invalidInput = in.next(); // captures the invalid token
            System.out.println("You must enter a valid integer 1–12, not: " + invalidInput);
        }

        in.close();
    }
}
