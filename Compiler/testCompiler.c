//
// Created by shriaas on 10/10/19.
//

#include <stdio.h>
#include "stackHeader2.h"
/*
 * search(array,key) -> index of key
 */
int search(char arr[],char key){
    //
    for (int i = 0; i <= sizeof(arr)/sizeof(int); ++i) {
            if(key == arr[i])
                return i;

    }
    return -1;

}
int main(){
    STACK stack;
    stack.top = 0;
    FILE *fp;
    char ch,value,flag=TRUE,previous=0;
    char opening[] ={'(','{','[','\'','"'}, closing[]={')','}',']','\'','"'};
    int position;

    //opening file in read mode
    fp=fopen("test.txt","r");
    ch=fgetc(fp);
    while(ch!=EOF)
    {
        position =search(opening,ch);

        //pushing opening bracket

        if(position!= -1)
        {
            
            if(previous != '\'') {
                
                value = push(&stack, ch);
            }
            else
                value = FALSE;

        }
        //poping when matching closing bracket is encountered
        else if((position = search(closing,ch))!=-1 && previous != '\'')
        {
            if (isEmpty(stack))
             {
                        printf("Error in Program");
                        flag=FALSE;
                    }
                    else if(pop(&stack) != opening[position])
                    {
                        
                        printf("\n1.Error in Program ");
                        flag=FALSE;
                    }

        }
        if(!(flag))
            break;
        previous=ch;
        ch=fgetc(fp);
    }


    fclose(fp);

    if(isEmpty(stack) && flag==TRUE)
        printf("Successfully Complied \n");
    else if(flag==TRUE)
        printf("\nError in Program \n");


    return 0;
}