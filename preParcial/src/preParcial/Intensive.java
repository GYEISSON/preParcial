package preParcial;
import java.util.*;

public class Intensive extends Plan{
	Intensive(){
	
	}
	public boolean evaluate(){
		boolean bol= true;
		for(Week w: weeks){
			bol = bol && w.evaluate();
		}
		return bol;
	}
	public void inactive() {
		active=false;
	}

}