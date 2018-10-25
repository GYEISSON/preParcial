package preParcial;
import java.util.*;

public class Week{
	private ArrayList<Session> sessiones;
	Week(){
		sessiones = new ArrayList<Session>();
	}
	
	public void evaluate(){
		for(Session s: sessiones){
			s.evaluate();
			
		}
	}

}