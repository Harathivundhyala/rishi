import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int ris=s.nextInt();
        while(ris-->0){
            int n=s.nextInt();
            int i,j;
            int a[][]=new int[n][n];
            for(i=0;i<n;i++)
             for(j=0;j<n;j++)
              a[i][j]=s.nextInt();
            int t=0,b=n-1,l=0,r=n-1;
            while(true){
                for(i=l;i<=r;i++)
                 System.out.print(a[t][i]+" ");
                t++;
                if(l>r || t>b){
                    System.out.println(" ");
                 break;
                }
                for(i=t;i<=b;i++)
                 System.out.print(a[i][r]+" ");
                r--;
                if(l>r || t>b){
                    System.out.println();
                 break;
                }
                for(i=r;i>=l;i--)
                 System.out.print(a[b][i]+" ");
                b--;
                if(l>r || t>b){
                    System.out.println();
                 break;
                }
                for(i=b;i>=t;i--)
                 System.out.print(a[i][l]+" ");
                l++;
                if(l>r || t>b){
                    System.out.println();
                 break;
                
                }
            }
            
              
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    }
}