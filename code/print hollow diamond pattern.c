#include <stdio.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int t;
    scanf("%d",&t);
    while(t--)
    {
        static int c=1;
        printf("Case #%d:\n",c++);
        int n,i,j,k,m=1;
        scanf("%d",&n);
        int n1=(n/2)+1;
        for(i=n1;i>0;i--)
        {
            for(j=1;j<i;j++)
            printf(" ");
            for(k=1;k<=m;k++)
            {
                if(k==1 || k==m)
                printf("*");
                else
                printf(" ");
            }
            printf("\n");
            m=m+2;
        }
        m=m-4;
        for(i=0;i<(n-n1);i++)
        {
           for(j=0;j<=i;j++)
           printf(" ");
           for(k=1;k<=m;k++)
           {
               if(k==1 || k==m)
               printf("*");
               else
               printf(" ");
           }
           printf("\n");
           m=m-2;
        }
    }   
    return 0;
}