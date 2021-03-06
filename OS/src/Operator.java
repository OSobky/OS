import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Queue;

public class Operator {
	static Wheel wheel ;
	static Queue<Player> Players ;
	
	public static void main(String[] args) {
		 String fileName = "input-1.txt";

	        // This will reference one line at a time
	        String line = null;

	        try {
	            // FileReader reads text files in the default encoding.
	            FileReader fileReader = 
	                new FileReader(fileName);

	            // Always wrap FileReader in BufferedReader.
	            BufferedReader bufferedReader = 
	                new BufferedReader(fileReader);

	            while((line = bufferedReader.readLine()) != null) {
	                System.out.println(line);
	            }   

	            // Always close files.
	            bufferedReader.close();         
	        }
	        catch(Exception ex) {
	            System.out.println(
	                "Unable to open file '" + 
	                fileName + "'");                
	        }
	        
	       
	        String lines[] = line.split("\\r?\\n");
	        int max_waitTime = Integer.parseInt(lines[0]) ;
	        int QueuezSize = Integer.parseInt(lines[1]) ;
	        Players = new LinkedList<Player>() ;
	        for(int i = 2 ; i<QueuezSize ; i ++ ){
	        	String lines2[] = lines[i].split(",");
	        	
 	        	int ID = Integer.parseInt(lines2[0]) ;
 	        	int waiting_time = Integer.parseInt(lines2[1]) ;
	        	Player p = new Player(ID, waiting_time);
	        	Players.add(p);
	        	
	        }
	        wheel = new Wheel(max_waitTime) ;
		
		
		
	}
	
}
