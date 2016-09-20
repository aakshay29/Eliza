
public class mom extends Thread{
	
	public void run(){
		for(int i = 0; i < 1000; i++){
			try {
				mom.sleep(15);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("mom");	
		}
	}
}
