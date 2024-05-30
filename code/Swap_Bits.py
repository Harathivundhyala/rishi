for i in range(int(input())):
    n=int(input())
    print((n & 0xAAAAAAAAA)>>1 | (n&0x555555555)<<1)