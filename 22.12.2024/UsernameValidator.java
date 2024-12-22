import java.util.Scanner;
import java.util.regex.*;

public class UsernameValidator {
    
    public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine());
        
        while (n-- > 0) {
            String username = scanner.nextLine();
            
            Pattern pattern = Pattern.compile(regularExpression);
            Matcher matcher = pattern.matcher(username);
            
            if (matcher.matches()) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
        
        scanner.close();
    }
}
