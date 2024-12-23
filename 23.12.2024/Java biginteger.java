import java.math.BigInteger;
import java.util.Scanner;

public class BigNumberOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger bigNum1 = new BigInteger(scanner.nextLine());
        BigInteger bigNum2 = new BigInteger(scanner.nextLine());
        System.out.println(bigNum1.add(bigNum2));
        System.out.println(bigNum1.multiply(bigNum2));
        scanner.close();
    }
}