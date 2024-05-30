import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long a,b,max,min;
            a=sc.nextLong();
            b=sc.nextLong();
            if(a>b){
                max=a;
                min=b;
            }
            else{
                max=b;
                min=a;
            }
            while(max%min != 0){
                long temp=min;
                min=max%min;
                max=temp;
            }
            System.out.print((a*b)/min);
            System.out.print(" ");
            System.out.println(min);
            
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    }
}