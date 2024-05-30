import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine());
        boolean vis[]=new boolean[10];
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> s=new ArrayList<>();
        generate(s,vis,0,list);
        int t=Integer.parseInt(st.nextToken());
        while(t-->0){
            int a[][]=new int[3][3];
            for(int i=0;i<3;i++){
                st=new StringTokenizer(br.readLine());
                for(int j=0;j<3;j++){
                    a[i][j]=Integer.parseInt(st.nextToken());
                }
            }
            int min=Integer.MAX_VALUE;
            for(List<Integer> i:list){
                int x=0;
                int cost=0;
                for(int j=0;j<9;j++){
                    cost+=Math.abs(a[j/3][j%3]-i.get(j));
                }
                min=Math.min(cost,min);
            }
            w.write(min+"\n");
        }
        w.flush();
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    }
    static void generate(List<Integer> s,boolean vis[],int idx,List<List<Integer>> list){
        if(idx==9){
            if(valid(s))
            list.add(new ArrayList<>(s));
            return;
        }
        for(int i=1;i<=9;i++){
            if(!vis[i]){
                if(s.size()>idx)
                s.set(idx,i);
                else
                s.add(i);
                vis[i]=true;
                generate(s,vis,idx+1,list);
                vis[i]=false;
            }
        }
    }
    static boolean valid(List<Integer> s){
        int s1=s.get(0)+s.get(1)+s.get(2);
        int s2=s.get(3)+s.get(4)+s.get(5);
        int s3=s.get(6)+s.get(7)+s.get(8);

        int s4=s.get(0)+s.get(3)+s.get(6);
        int s5=s.get(1)+s.get(4)+s.get(7);
        int s6=s.get(2)+s.get(5)+s.get(8);

        int s7=s.get(0)+s.get(4)+s.get(8);
        int s8=s.get(2)+s.get(4)+s.get(6);

        if((s1%5)!=0 || (s2%5)!=0 || (s3%5)!=0 || (s4%5)!=0 || (s5%5)!=0 || (s6%5)!=0 || (s7%5!=0) || (s8%5)!=0)
        return false;
        return true;

    }
}