import java.util.ArrayList;


public class Wheel extends Thread{
	final int capacity=5;
	int num_of_onboard_players;
	ArrayList<Player> onboard_players;
	int waiting_time;
	public Wheel(int waiting_time) {
		super();
		this.waiting_time = waiting_time;
	}
	public String getID (){
		String IDS = null ;
		for (int i =0; i< onboard_players.size();i++){
		int id = onboard_players.get(i).ID;
		 IDS = IDS+id+" ";
		
	}
	return IDS;	
	}
	public void load_players (Player player){
		onboard_players.add(player);
		
	}
	
	public void run_ride(){
		for (int i =0; i< onboard_players.size();i++){
			onboard_players.get(i).on_board=false;
			onboard_players.get(i).ride_complete=true;
			
			
		}
	}
	public void end_ride() throws InterruptedException{
		for (int i =0; i< onboard_players.size();i++){
			onboard_players.remove(i);
			
			
		}
		Wheel.sleep(waiting_time);
	}
	
	
	
	
	
	
	public void run(){
		try {
			Wheel.sleep(waiting_time);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}

}
