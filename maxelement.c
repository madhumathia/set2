#include<stdio.h>
#include<conio.h>
void main()
{
    int great,n,arr[7];
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    great=arr[0];
    for(int i=0;i<n;i++)
    {
    if(arr[i]>great)
    {
        great=arr[i];
    }
    }
    printf("\nThe greatest number is : %d",great);
}
