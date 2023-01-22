package src;
import java.util.*;

public class B_Cat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int N = scanner.nextInt();
        String S = scanner.next();
        scanner.close();
        
        String S2 = S.replace("na", "nya");

        System.out.println(S2);
    }
}

