//
// Created by shriaas on 10/10/19.
//
#include <stdio.h>
#include "stackHeader2.h"

void printStack(STACK stack)
{
    for(int index=0;index<10;index++)
    {
        printf("%c,",stack.bytes[index]);
    }
    printf("\b\n");
}


//Push Function of the Stack
int push(STACK *stack,char ch)
{
    if(stack->top == (sizeof(stack->bytes)-1))
        return FALSE;
    else
    {
        stack->bytes[stack->top] = ch;
        (stack->top)++;
        return TRUE;
    }
}



char isEmpty(STACK stack)
{
    if(stack.top == 0)
        return TRUE;
    else
        return FALSE;
}

char pop(STACK *stack)
{
    if(isEmpty(*stack))
        return FALSE;
    else
    {
        char ch= stack->bytes[--(stack->top)];
        return ch;
    }
}


