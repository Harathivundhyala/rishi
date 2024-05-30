t=int(input())
while t>0:
    a,b=map(int,input().split())
    print(((1<<a)|(1<<b))%1000000007)
    t=t-1