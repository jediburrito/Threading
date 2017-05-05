
public class Cup {

	private int coffee;
	
	public Cup (int coffee){
		
		this.coffee = coffee;
		
	}

	synchronized public int getCoffee() {
		return coffee;
	}

	synchronized public void setCoffee(int coffee) {
		this.coffee = coffee;
	}
	
	
	
	synchronized public void pour(){
		int localCoffee = coffee;
		localCoffee++;
		System.out.print(" Pour ");
		try {
			Thread.sleep((long)(120*Math.random()));
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		coffee = localCoffee;
	}
	
	
	synchronized public void drink(){
		int localCoffee = coffee;
		localCoffee--;
		System.out.print(" sip ");
		
	
			try {
				Thread.sleep((long)(100*Math.random()));
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		
			coffee = localCoffee;
		
	}
	
	
	
}
