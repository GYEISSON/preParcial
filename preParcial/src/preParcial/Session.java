package preParcial;
import java.util.*;

public class Session{
	private Activity activity;
	Session(){
		
	}
	public void newActivity(){
		activity = new Activity();
	}
	//retorna si la secion es saludable      
	public boolean evaluate(){
		float[] list = activity.promedios();
		if((int)list[0]>=120 && (int)list[0]<=140 && (int)list[1]>85) {
			return true;
		}
		return false;
	}
}