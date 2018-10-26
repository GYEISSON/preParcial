package preParcial;
import java.util.*;


public abstract class Plan {
	
	protected long number;
	protected boolean active;
	protected ArrayList<Week> weeks;
	
	public Plan() {
		number = 0;
		active = true;
		weeks = new ArrayList<Week>();
	}

	public abstract  void inactive();
	public abstract boolean evaluate();
	
	public long getNumber(){ return number; }
	public boolean state(){  return active; }
}
