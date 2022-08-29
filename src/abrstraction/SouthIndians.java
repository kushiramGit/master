package abrstraction;

public class SouthIndians extends Indains {

	@Override
	public void Breakfast() {
		System.out.println("idly or dosa");
		
	}
	
	public static void main(String[] args) {
		SouthIndians s =new SouthIndians();
		s.Breakfast();
		s.pancard();
		s.voterId();
		
	}

}
