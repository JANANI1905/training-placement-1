import java.util.Scanner;
class UsernameValidator {
    public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
}

public class Solution {
    private static final java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scanner.nextLine());
        while (n-- != 0) {
            String username = scanner.nextLine();
            System.out.println(username.matches(UsernameValidator.regularExpression) ? "Valid" : "Invalid");
        }
    }
}