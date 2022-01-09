import java.util.*;

class StringX
{
	public String str;
	
	public void Accept()
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the string");
		
		str=sobj.nextLine();
	}
	
	public void Display()
	{
		System.out.println("String is :"+str);
	}
}

class Marvellous extends StringX
{
	public String ReverseX()
	{
		char Arr[]=str.toCharArray();
		int iStart=0,iEnd=Arr.length-1;
		char temp;
		while(iStart<iEnd)
		{
			temp=Arr[iStart];
			Arr[iStart]=Arr[iEnd];
			Arr[iEnd]=temp;
			
			iStart++;
			iEnd--;
		}
		return new String(Arr);
	}
}

class Java24
{
	public static void main(String arg[])
	{
		
		Marvellous mobj=new Marvellous();
		int iRet=0;
		mobj.Accept();
		mobj.Display();
		
		String string=mobj.ReverseX();
		System.out.println("Reverse string is : "+string);
	}
}