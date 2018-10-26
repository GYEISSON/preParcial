package preParcial;
import java.util.*;

public class Session{
	private Activity activity;
	private Workout workout;
	Session(){
		workout = new Workout();
	}
	public void newActivity(){
		activity = new Activity();
	}
	//retorna si la secion es saludable      
	public boolean evaluate(){
		float[] list = activity.promedios();
		if((int)list[0]>=120 && (int)list[0]<=140 && (int)list[1]>85 
				&& workout.toHours() > 2) {
			return true;
		}
		return false;
	}
}