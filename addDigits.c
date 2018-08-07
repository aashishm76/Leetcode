//Leetcode 258: Add Digits

#include<stdio.h>
#include<stdlib.h>

int addDigits(int num)
{
  // Base case
  if((num / 10) == 0)
    return num;

  return addDigits((num / 10) + (num % 10));
}

int main(void)
{
  int value = addDigits(169);
  printf("Output: %d\n", value);
}
