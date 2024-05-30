import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int l=sc.nextInt();
            HashSet<String> map=new HashSet<String>();
            sc.nextLine();
            while(n-->0){
                String s=sc.nextLine();
                char st[]=s.toCharArray();
                Arrays.sort(st);
                String ans=new String(st);
                map.add(ans);

            }
            System.out.println(map.size());
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    }
}