package day11;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "changeme";
		char[] UpperCase  =  new char[test.length()] ;
char[] indexArray =test.toCharArray();
for(int i=0;i<indexArray.length;i++)
{
	if(i%2!=0)
	{
		UpperCase[i] = Character.toUpperCase(indexArray[i]);
	}
	else
	{
		UpperCase[i]=indexArray[i];
	}
}
System.out.println(UpperCase);
	}

}
