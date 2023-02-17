package week3.day2;

public class Students {
	
	public void getStudentInfo(int  id) {
		System.out.println("Student Id is :"+id);		
	}
	public void getStudentInfo(int  id,String Name) {
		System.out.println("Student Id is :"+id+ " and Student name is :"+Name);	
	}
	public void getStudentInfo(String mail,String Num) {
		System.out.println("Student Email is :"+mail+ " and Student Phone Number is :"+Num);	
	}

	public static void main(String[] args) {
		Students student = new Students();
		student.getStudentInfo(301111);
		student.getStudentInfo(11, "Bincy");
		student.getStudentInfo("bini@gmail.com", "95001995");

}
}