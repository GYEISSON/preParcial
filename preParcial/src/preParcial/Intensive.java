package preParcial;
import java.util.*;

public class Intensive extends Plan{
	Intensive(){
	
	}
	public void evaluate(){
		for(Week w: weeks){
			w.evaluate();
		}
	}

}