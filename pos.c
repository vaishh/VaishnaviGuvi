#include <stdio.h>
int main()
{
    int n;

    printf("Enter a number: ");
    scanf("%d", &n);

    if (n<= 0)
    {
        if (n== 0)
            printf("the no is 0");
        else
            printf("the no is a negative number.");
    }
    else
        printf("the no is a positive number.");
    return 0;
}
