package src;
import java.util.*;

public class A_RangeSwap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int P = scanner.nextInt();
        int Q = scanner.nextInt();
        int R = scanner.nextInt();
        int S = scanner.nextInt();

        int A[] = new int[N+1];

        for (int i = 1; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }
        scanner.close();

        int B[] = new int[N+1];
        for (int i = 1; i < B.length; i++) {
            if (i >= P && i <= Q) {
                B[i] = A[R+i-P];
            } else if (i >= R && i <= S) {
                B[i] = A[P+i-R];
            } else {
                B[i] = A[i];
            }
            System.out.print(B[i]+" ");
        }
    }
}

