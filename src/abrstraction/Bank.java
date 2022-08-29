package abrstraction;

public class Bank implements RbiBank,WordBank {

	@Override
	public void deposit() {
		System.out.println("interest is 5%");
		
	}

	@Override
	public void saving() {
		System.out.println("interest is 8%");
	}

	@Override
	public void fixed() {
		System.out.println("interest is 15%");		
	}

	public static void main(String[] args) {
		Bank b= new Bank();
		b.deposit();
		b.saving();
		b.fixed();
		
	}
}
