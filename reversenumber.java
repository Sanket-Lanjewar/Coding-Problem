import java.util.*;
import java.io.*;
public class reversenumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        for(int i=1; i<=n;i++){
            int reverse= n%10;
            n=n/10;
            System.out.print(reverse);
        }
    }
}

















