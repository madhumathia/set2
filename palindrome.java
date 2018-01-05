#include<stdio.h>
void main()
{
     int n,temp,num,i,rev=0,ld;
     scanf("%d",&num);
     temp=num;
     while(temp>0)
     {
            ld=temp%10;
            rev=rev*10+ld;
            temp=temp/10;
     }
     if(rev==num)
        {
        printf("yes);
        }
        else
        {
        printf("No");
        }
}

