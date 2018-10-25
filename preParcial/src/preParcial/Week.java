package preParcial;
import java.util.*;

public class Week{
	private ArrayList<Session> sessiones;
	Week(){
		sessiones = new ArrayList<Session>();
	}
	
	public boolean evaluate(){
		for(Session s: sessiones){
			s.evaluate();
			
		}
	}

}