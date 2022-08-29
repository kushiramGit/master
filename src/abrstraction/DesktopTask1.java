package abrstraction;

public class DesktopTask1 implements HardWareTask1,SoftwareTask1 {
	
	
	public void desktopModel() {
		System.out.println("desktopModel:8CG9WF891F");

	}

	@Override
	public void softwareResources() {
		System.out.println("softwareResources:HCL Technology");		
	}

	@Override
	public void hardwareResources() {
		System.out.println("hardwareResources:TCS");
		
	}
	
	public static void main(String[] args) {
		DesktopTask1 d= new DesktopTask1();
		d.hardwareResources();
		d.softwareResources();
		d.desktopModel();
		
		
	}

}
