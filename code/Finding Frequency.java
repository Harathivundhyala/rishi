mport java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,q,k;
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
           a[i]=sc.nextInt();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(!hm.containsKey(a[i]))
            {
                hm.put(a[i],1);
            }
            else
            {
                hm.put(a[i],hm.get(a[i])+1);
            }
        }
        q=sc.nextInt();
        for(int i=0;i<q;i++){
            k=sc.nextInt();
            if(hm.containsKey(k))
                System.out.println(hm.get(k));
            else
                System.out.println(0);
            
        }
        
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    }
}