import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=0;k<t;k++)
        {
            int n=sc.nextInt();
            int []a=new int[n];
            for(int i=0;i<n;i++)
              a[i]=sc.nextInt();
            long ans=0;
            for(int i=0;i<32;i++)
            {
                long count=0;
                for(int j=0;j<n;j++){
                    if((a[j] & (1<<i))!=0)
                    count++;
                }
                ans+=count*(n-count)*(1<<i);
            }
            System.out.println(ans*2);
            
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    }
}