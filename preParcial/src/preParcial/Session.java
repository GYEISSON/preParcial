package preParcial;
import java.util.*;

public class Session{
	private Activity activity;
	Session(){
		
	}
	public void newActivity(){
		activity = new Activity();
	}
	
	public boolean evaluate(){
		if(activity!= null){
			activity.evaluate();
		}
	}
}