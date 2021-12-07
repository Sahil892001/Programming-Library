//Check pailndrome number with two functions

#include<stdio.h> //Header file inclusion
#include<stdbool.h>

bool CheckPalindrome(int iNo)    //Function Declaration
{
	
	int iDigit=0;
	int iRev=0;
	int iTemp=iNo; //temporarily saving iNo var as the value of iNo will become zero at the end of while loop
	
    while(iNo!=0)
	{
		iDigit=iNo%10;
		iRev=(iRev*10)+iDigit;
		iNo=iNo/10;
	}
	if(iRev==iTemp)
	{
		return true;
	}
	else
	{
		return false;
	}
		
}
			
int main()         //Entry point function
{
	int iValue=0;
	bool bRet=false;
	
	printf("Enter the number");
	scanf("%d",&iValue);
	
	bRet=CheckPalindrome(iValue);	//Function call
	
	if(bRet==true
	)
	{
		printf("The number is Palindrome\n");
	}
	else
	{
		printf("The number is not Palindrome\n");
	}
	
	return 0;
}

	



	
	
	