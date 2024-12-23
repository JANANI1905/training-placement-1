import java.util.ArrayList;
import java.util.Scanner;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            String operation = scanner.next();
            if (operation.equals("Insert")) {
                list.add(scanner.nextInt(), scanner.nextInt());
            } else if (operation.equals("Delete")) {
                list.remove(scanner.nextInt());
            }
        }
        for (int num : list) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}