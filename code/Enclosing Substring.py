from collections import Counter
def ismapset(mapa,mapb):
    for i in mapa:
        try:
            if mapa[i]>mapb[i]:
                return False
        except:
            return False
    return True
for _ in range(int(input())):
    a,b=input().split()
    mapa=dict(Counter(a))
    mapb=dict(Counter(b))
    if(ismapset(mapa,mapb) == False):
        print(-1)
        continue
    mapb=dict()
    i=0
    j=0
    ans=(1 << 31) - 1
    while(i< len(b) and j<len(b)):
        while(not ismapset(mapa,mapb) and j<len(b)):
            try:
                mapb[b[j]]+=1
            except:
                mapb[b[j]]=1
            j+=1
        if j==len(b) and ismapset(mapa,mapb) == False:
            break
        ans=min(j-i,ans)
        while(ismapset(mapa,mapb) and i<len(b)-len(a)+1):
            mapb[b[i]]-=1
            if mapb[b[i]]==0:
                del mapb[b[i]]
            i+=1
        ans=min(ans,j-i+1)
    print(ans)