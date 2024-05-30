import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            System.out.println((int)Math.cbrt(n));
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    }
}