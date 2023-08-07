package week3.day1.assignments;

public class AxisBank extends BankInfo {

	@Override
		public void deposit() {
	
		super.deposit();
		System.out.println("Deposit Money");
	}
	
	public static void main(String[] args) {
		
		AxisBank ab = new AxisBank();
		
		ab.deposit();
	}
}
