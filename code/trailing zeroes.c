#include <stdio.h>
#include <stdlib.h>

int main() {
    int t;
    scanf("%d",&t);
    while(t>0)
    {
        long n;
        scanf("%ld\n",&n);
        long count=0;
        while(n>0)
        {
            count=count+n/5;
            n=n/5;
        }
        printf("%ld\n",count);
        t--;
    }

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    return 0;
}