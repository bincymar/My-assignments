package day11;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s= "madam";
String rev="";
	int sLength = s.length();

    for (int i = (sLength - 1); i >=0; i--) {
      rev = rev + s.charAt(i);
    }

    if (s.toLowerCase().equals(rev.toLowerCase())) 
    {
      System.out.println(s + " is a Palindrome String.");
    }
    else {
      System.out.println(s + " is not a Palindrome String.");
    }
  }
}

