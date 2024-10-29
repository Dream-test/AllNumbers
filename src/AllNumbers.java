import java.util.Scanner;

public class AllNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = -1;
        while (true) {
            System.out.println("Enter number from 10 to 30");
            if (in.hasNextInt()) {
                number = in.nextInt();
                if (number >= 10 && number <= 30) {
                    break;
                } else {
                    System.out.println("Error: Please enter a number between 10 and 30");
                }
            } else {
                    System.out.println("Error: Please enter a valid Integer");
                    in.next();
            }
        }

        in.close();

        for (int i = 0; i <= number; i++) {
            if (i == 0) {
                System.out.println(i);
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }

    }
}
