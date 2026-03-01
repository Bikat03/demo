
public class AusTraffic implements IntTraffic,  WorldTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		IntTraffic  intr = new  AusTraffic();
		
		WorldTraffic  intr1 = new  AusTraffic();
		
		 intr.green();
		 intr.red();
		 intr.yellow();
		 
		 intr1.wordt();
 AusTraffic aus = new  AusTraffic ();
		 
		 aus.ausrule();
			 
		

	}

	@Override
	public void red() {
		System.out.println( " red");
		
	}

	@Override
	public void green() {
		System.out.println("green");
		
	}

	@Override
	public void yellow() {
	System.out.println("yellow");
		
	}
	
	
	public void ausrule() {
		
		System.out.println ( " this is austraffic rule");
	}

	@Override
	public void wordt() {
		System.out.println( " this is workd traffic");
		
	}

	 
	

}
