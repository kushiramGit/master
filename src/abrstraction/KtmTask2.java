package abrstraction;

public class KtmTask2 implements BikeTask2 {

	@Override
	public void cost() {
		System.out.println("250000");
				
	}

	@Override
	public void speed() {
		System.out.println("150km/hr");
			}
	
	public static void main(String[] args) {
		KtmTask2 k= new KtmTask2();
		k.speed();
		k.cost();
		
		
	}
	

}
