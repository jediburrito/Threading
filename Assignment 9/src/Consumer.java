
public class Consumer extends Thread{

	private OtherCup cup;
	private int number;
	
	public Consumer(OtherCup c, int number){
		
		cup = c;
		this.number = number;
		
		
	}
	
	public void run(){
		int value = 0;
		
		for(int i = 0; i < 10; i++){
			
			try {
				sleep((long)(Math.random())*200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			value = cup.get();
			System.out.println("Consumer #" + this.number + " got:" + value);
			
		}
		
		
		
	}
	
	
}
