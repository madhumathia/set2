#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
void main()
{
    char c;
    scanf("%c",&c);
    if(c>='a'&&c<='z'||c>='A'&&c<='z')
    printf("Alphabet");
    else
    printf("no");
}

