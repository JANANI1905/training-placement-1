import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] arr = new int[6][6];
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        
        int maxSum = Integer.MIN_VALUE;
        
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                int top = arr[i-1][j-1] + arr[i-1][j] + arr[i-1][j+1];
                int middle = arr[i][j];
                int bottom = arr[i+1][j-1] + arr[i+1][j] + arr[i+1][j+1];
                
                int hourglassSum = top + middle + bottom;
                
                if (hourglassSum > maxSum) {
                    maxSum = hourglassSum;
                }
            }
        }
        
        System.out.println(maxSum);
        
        scanner.close();
    }
}
