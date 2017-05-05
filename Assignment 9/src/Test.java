
public class Test {

	public static void main(String[] args) {
		
	Cup cup = new Cup(1);
		
		Waiter bob = new Waiter(cup);
		Customer steve = new Customer(cup);
	
		steve.start();
		bob.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
    System.out.println("\n" + cup.getCoffee());
	}

}
