
public class CounterThread extends Thread{
	private Counter counter = null;
	public CounterThread(Counter counter){
		this.counter = counter;
	}
	
	public void run(){
		for(int i = 0; i < 1000; i++){
			counter.add(100);
		}
		System.out.println(this.getName() + ":" + counter.getCounter());
	}
}
