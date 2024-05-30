import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int k;
        for(k=0;k<t;k++){
        int n=sc.nextInt();
        int []a=new int[n];
        int j,i;
        for(i=0;i<n;i++)
        a[i]=sc.nextInt();
        int ans=0;
        for( j=0;j<n;j++)
        {
            ans=ans^(a[j]+a[j]);
        }
        System.out.println(ans);
        }

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    }
}