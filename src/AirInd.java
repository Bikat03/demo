
public class AirInd  extends AirTraffic {
	
	public static void main (String[]arg ){
	
	AirInd a = new AirInd();
	
	a.engine();
	a.wings();
	a.logo();
	a.color();
	
	
	}

	@Override
	public void logo() {
		System.out.println("logo");
		
	}

	@Override
	public void color() {
	System.out.println("color");
		
	}
	

	
	
	}



