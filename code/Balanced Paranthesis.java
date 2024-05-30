import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=1;
        int t=sc.nextInt();
        for(int k=0;k<t;k++)
        {
            int n=sc.nextInt();
            String a="";
            System.out.println("Test Case #"+x+":");
            x++;
            vp(a,2*n,0,0,0);
            
        }
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    }
    static void vp(String a,int n,int idx,int oc,int cc)
    {
        if(idx==n)
        {
            System.out.println(a);
            return;
        }
        if(oc<n/2)
        {
            vp(a+'{',n,idx+1,oc+1,cc);
        }
        if(cc<oc)
        {
            vp(a+'}',n,idx+1,oc,cc+1);
        }
    }
}