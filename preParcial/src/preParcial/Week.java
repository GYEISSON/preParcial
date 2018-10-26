package preParcial;
import java.util.*;

public class Week{
	private ArrayList<Session> sessiones;
	Week(){
		sessiones = new ArrayList<Session>();
	}
	
	public boolean evaluateIntensive(){
		boolean bol = true;
		for(Session s: sessiones){
			bol = bol && s.evaluateIntensive();
		}
		return bol;
	}
	public boolean evaluateEasy(){
		boolean bol = true;
		for(Session s: sessiones){
			bol = bol && s.evaluateEasy();
		}
		return bol;
	}
}