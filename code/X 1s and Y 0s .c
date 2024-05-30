#include <stdio.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int t;
    scanf("%d",&t);
    while(t--)
    {
        int x,y,i;
        long ans=0;
        scanf("%d%d",&x,&y);
        for(i=0;i<x;i++)
        {
            ans=ans<<1;
            ans=ans | 1;
        
        }
        ans=ans<<y;
        ans=ans%1000000007;
        printf("%ld\n",ans);

    }   
    return 0;
}