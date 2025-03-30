import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static int solve(int n, int[] A, int k) {
        if (k > n) {
            return 0;
        }
        
        // dp[i][j] represents the minimum special value for subsequence of length j ending at index i
        int[][] dp = new int[n][k + 1];
        
        // Initialize dp array with maximum values
        for (int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        
        // Base case: for subsequence of length 1, special value is 0
        for (int i = 0; i < n; i++) {
            dp[i][1] = 0;
        }
        
        // Fill dp array
        for (int len = 2; len <= k; len++) {
            for (int i = len - 1; i < n; i++) {
                for (int j = len - 2; j < i; j++) {
                    if (dp[j][len - 1] != Integer.MAX_VALUE) {
                        int currentValue = dp[j][len - 1] + Math.abs(A[i] - A[j]);
                        dp[i][len] = Math.min(dp[i][len], currentValue);
                    }
                }
            }
        }
        
        // Find minimum value among all subsequences of length k
        int result = Integer.MAX_VALUE;
        for (int i = k - 1; i < n; i++) {
            result = Math.min(result, dp[i][k]);
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input values
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        // Solve and print the result
        System.out.println(solve(n, a, k));

        sc.close();
    }
} 