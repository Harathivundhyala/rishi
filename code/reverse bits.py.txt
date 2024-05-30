t=int(input())
while t>0:
    a=bin(int(input()))[2:]
    a=a[::-1]
    a=(a+("0"*(32-len(a))))
    print(int(a,2))
    t=t-1