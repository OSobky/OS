

public class Player extends Thread   {
	 int ID  ;
	 int waiting_time ; 
	 boolean on_board = false ;
	 boolean ride_complete = false ;
	
	 
	 public Player(int ID , int waiting_time){
		 this.ID = ID ; 
		 this.waiting_time = waiting_time ;
		 
		
	 }
	 
	 public void run(){
		try {
			Thread.sleep(waiting_time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
}
