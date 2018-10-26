package preParcial;

public class  Easy extends Plan  {
	public Easy() {}
	public boolean evaluate(){
		boolean bol= true;
		for(Week w: weeks){
			bol = bol && w.evaluateEasy();
		}
		return bol;
	}
	public void inactive() {
		active=false;
	}

}
