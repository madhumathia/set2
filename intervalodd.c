#include<stdio.h>
#include<conio.h>
void main()
{
    int i,j,n,m;
    scanf("%d",&n);
    scanf("%d",&m);
    for(i=n+1;i<=m-1;i++)
    {
        if(i%2==0)
        printf(" %d\t ",i);
    }
}

