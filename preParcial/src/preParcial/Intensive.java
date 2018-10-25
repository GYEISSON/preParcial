package preParcial;
import java.util.*;

public class Intensive extends Plan{
	Intensive(){
	
	}
	public boolean evaluate(){
		for(Week w: weeks){
			w.evaluate();
		}
	}

}