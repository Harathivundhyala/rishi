#include <stdio.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int t;
    scanf("%d",&t);
    while(t--)
    {
        long n,p=1;
        scanf("%ld",&n);
        while(p<n)
        {
            p=p*2;
        }
        if(p==n)
        printf("True\n");
        else
        printf("False\n");


    }    
    return 0;
}