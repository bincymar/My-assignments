package week3.day2;

public class Student extends Department {
	
	public void studentName()
	 
	{
		System.out.println("Student Name is: Bincy ");
	}


	public void studentDept()
	 
	{
		System.out.println("Student belong to: EEE ");
	}

	public void studentId()
	 
	{
		System.out.println("Sudent Roll num is : 301111 ");
	}
	//studentName(),studentDept(),studentId()
public static void main(String[]args)
{
	
	Student stud = new Student();
	stud.studentDept();
	stud.studentName();
	stud.studentId();
	stud.collegeName();
	stud.collegeCode();
	stud.collegeRank();
	stud.deptName();
	
	
}
}
