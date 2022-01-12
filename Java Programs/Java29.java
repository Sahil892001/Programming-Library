import java.util.*;

class Searching
{
	public boolean LinearSearch(int Arr[],int no)
	{
		int i=0;
		for(i=0;i<Arr.length;i++)
		{
			if(Arr[i]==no)
			{
				break;
			}
		}
		
		if(i==Arr.length)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}

class Java29
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sobj.nextInt();
		
		int Arr[]=new int[size];
		
		System.out.println("Enter the Elements");
		for(int i=0;i<Arr.length;i++)
		{
			Arr[i]=sobj.nextInt();
		}
		
		System.out.println("Enter element to search");
		int value=sobj.nextInt();
		
		Searching obj=new Searching();
		
		boolean bRet=obj.LinearSearch(Arr,value);
		
		if(bRet==true)
		{
			System.out.println("Element is there");
		}
		else
		{
			System.out.println("Element is not there");
		}
	}
}