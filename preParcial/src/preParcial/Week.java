package preParcial;
import java.util.*;

public class Week{
	private ArrayList<Session> sessiones;
	Week(){
		sessiones = new ArrayList<Session>();
	}
	
	public boolean evaluate(){
		boolean bol = true;
		for(Session s: sessiones){
			bol = bol && s.evaluate();
		}
		return bol;
	}

}