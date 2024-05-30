def checkbits(n,k):
    return (n & (1 << (k)))
def generate(arr):
    res=[]
    for i in range(1 << len(arr)):
        temp=0
        for j in range(len(arr)):
            if checkbits(i,j):
                temp+=arr[j]
        res.append(temp)
    return res
def searchlb(arr,lb):
    low=0
    high=len(arr)
    while(low<high):
        mid=(low+high) // 2
        if(lb <= arr[mid]):
            high=mid
        else:
            low=mid+1
    return low
def searchub(arr,ub):
    l=0
    h=len(subs2)
    while(l<h):
        m=(l+h) // 2
        if(ub >= arr[m]):
            l=m+1
        else:
            h=m
    return l
for _ in range(int(input())):
    n,a,b=list(map(int,input().split()))
    arr=list(map(int,input().split()))
    subs1=generate(arr[:(n // 2)+1])
    subs2=sorted(generate(arr[(n // 2) + 1:]))
    c=0
    for i in subs1:
        lowerbound=searchlb(subs2,a-i)
        upperbound=searchub(subs2,b-i)
        c+=(upperbound-lowerbound)
    print(c)