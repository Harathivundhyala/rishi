import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int tount=(int)Math.pow(2,n)-1;
            System.out.println(tount);
            toh(n,'A','C','B');
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    }
    static void toh(int n,char from,char to,char help){
        
        if(n==1){
            System.out.println("Move 1 from "+from+" to "+to);
            
            return;
        }
        toh(n-1,from,help,to);
        System.out.println("Move "+n+" from "+from+" to "+to);
        toh(n-1,help,to,from);
        
    }
}