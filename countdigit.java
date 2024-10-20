import java.util.*;
import java.io.*;

public class countdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digitCount = 0;
        // while (n > 0) {
        //     n = n / 10;
        //     digitCount++;
        //     System.out.println(digitCount);
        // }

        for (int i = 0; i <= n; i++) {
            n = n / 10;
            digitCount++;
            System.out.println(digitCount);
        }
    }
}
