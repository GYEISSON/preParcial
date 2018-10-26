package preParcial;
import java.util.*;

public class Activity {
	
	private ArrayList<Record> records;
	private float promBeats,speedProm;
	private float[] list;
	Activity(){
		records = new ArrayList<Record>();
		promBeats = speedProm = 0;
		list = new float[2];
	}
	public float[] promedios(){
		
		for(Record r: records){
			promBeats += r.getBeats();
			speedProm += r.getSpeed();			
		}
		
		promBeats/=records.size();
		speedProm/=records.size();
		list[0] = promBeats;
		list[1] = speedProm;
		
		return list;
	}
}