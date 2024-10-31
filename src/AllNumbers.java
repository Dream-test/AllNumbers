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
        System.out.println(printToNumber(numberToConsist));

}
    public static String printToNumber(BigInteger numberToConsist) {
        BigInteger index = BigInteger.ZERO;
        BigInteger threeNumber = new BigInteger("3");
        BigInteger fiveNumber = new BigInteger("5");

        StringBuilder builder = new StringBuilder();
        while (index.compareTo(numberToConsist) <= 0) {
            BigInteger remainderThree = index.remainder(threeNumber);
            BigInteger remainderFive = index.remainder(fiveNumber);
            if (index.compareTo(BigInteger.ZERO) == 0) {
                builder.append(index);
            } else if (remainderThree.compareTo(BigInteger.ZERO) == 0 && remainderFive.compareTo(BigInteger.ZERO) == 0) {
                builder.append(" fizzbuzz");
            } else if (remainderThree.compareTo(BigInteger.ZERO) == 0) {
                builder.append(" fizz");
            } else if (remainderFive.compareTo(BigInteger.ZERO) == 0) {
                builder.append(" buzz");
            } else {
                builder.append(" " + index);
            }
            index = index.add(BigInteger.ONE);

        }
        return builder.toString();
    }
    }
