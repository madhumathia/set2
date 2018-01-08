#include<stdio.h>
#include<conio.h>
void main()
{
    int min,n,arr[7];
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    min=arr[0];
    for(int i=0;i<n;i++)
    {
    if(arr[i]<min)
    {
        min=arr[i];
    }
    }
    printf("\nThe smallest number is : %d",min);
}
