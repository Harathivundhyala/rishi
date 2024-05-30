from sys import stdin,stdout 
import math
def power(x,n):
    res=1
    mod=1000000007
    while n:
        if(n&1):
            res=(res*x)%mod
        x=((x%mod)*(x%mod))%mod
        n=n>>1
    return res
for i in range(int(input())):
    n=int(stdin.readline())
    i=((int(math.sqrt((n<<3)-1)))+1)>>1
    x=n-((i*(i-1))>>1)-1
    stdout.write(str(((power(2,i))+power(2,x))%1000000007)+'\n')