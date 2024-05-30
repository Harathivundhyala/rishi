import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int f1=0,r1=0,r2=0;
            int a[]=new int[n];
            for(int i=0;i<n;i++)
             a[i]=sc.nextInt();
            Arrays.sort(a);
            for(int i=0;i<n-1;i++)
            {
                if(a[i]==a[i+1])
                {
                    if(f1==0)
                    {
                        r1=a[i];
                        f1=1;
                    }
                    else{
                        r2=a[i];
                    }
                }
            }
            if(r1>r2)
             System.out.println(r2+" "+r1);
            else 
             System.out.println(r1+" "+r2);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    }
}