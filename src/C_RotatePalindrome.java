package src;

import java.util.*;

public class C_RotatePalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        String S = scanner.next();
        S += S;

        char[] s = S.toCharArray();
        
        long ans = Long.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            long score = i*A;
            for (int j = 0; j < N/2; j++) {
                if (s[i+j] != s[i+N-1-j]) {
                    score += B;
                }
            }
            ans = Math.min(ans, score);
        }
        System.out.println(ans);
    }
}
