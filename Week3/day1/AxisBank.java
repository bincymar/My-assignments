package week3.day2;

public class AxisBank extends BankInfo {
	
	
	public void deposit()
	{
		System.out.println("AXIS bank has highest rate of return in fixed deposit ");
	}

	public static void main(String[] args) {
		AxisBank axis = new AxisBank();
		axis.deposit();
		axis.saving();
		axis.fixed();
		
	}

	
}
