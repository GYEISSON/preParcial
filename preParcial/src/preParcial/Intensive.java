package preParcial;


public class Intensive extends Plan{
	Intensive(){
	}
	public boolean evaluate(){
		boolean bol= true;
		for(Week w: weeks){
			bol = bol && w.evaluateIntensive();
		}
		return bol;
	}
	public void inactive() {
		active=false;
	}

}