import java.math.BigInteger;
import java.util.Scanner;

public class AllNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger numberToConsist;
        System.out.println("Enter any positive integer");
        while (true) {
            String input = in.nextLine();
            if (input.matches("\\d+")) {
                numberToConsist = new BigInteger(input);
                break;
            } else {
                System.out.println("Error: Please enter only numbers");
            }
        }
        in.close();
        printToNumber(numberToConsist);

}
    private static void printToNumber(BigInteger numberToConsist) {
        BigInteger index = BigInteger.ZERO;
        BigInteger numberThree = new BigInteger("3");
        BigInteger numberFive = new BigInteger("5");

        while (index.compareTo(numberToConsist) <= 0) {
            BigInteger remainderThree = index.remainder(numberThree);
            BigInteger remainderFive = index.remainder(numberFive);
            if (index.compareTo(BigInteger.ZERO) == 0) {
                System.out.print(index);
            } else if (remainderThree.compareTo(BigInteger.ZERO) == 0 && remainderFive.compareTo(BigInteger.ZERO) == 0) {
                System.out.print(" fizzbuzz");
            } else if (remainderThree.compareTo(BigInteger.ZERO) == 0) {
                System.out.print(" fizz");
            } else if (remainderFive.compareTo(BigInteger.ZERO) == 0) {
                System.out.print(" buzz");
            } else {
                System.out.print(" " + index);
            }
            index = index.add(BigInteger.ONE);

        }
    }
    }
