import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int c=0;
            int a[]=new int[n];
            for(int i=0;i<n;i++)
             a[i]=sc.nextInt();
            Arrays.sort(a);
            for(int i=0;i<n;i++)
            {c=0;
                for(int j=i;j<n;j++)
                {
                    if(a[i]==a[j])
                     c++;
                    else
                     break;
                }
                //System.out.print(c);
                if(c==3)
                 i=i+2;
                else if(c==1)
                 {
                     System.out.println(a[i]);
                     break;
                 }
            }
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    }
}