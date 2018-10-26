package preParcial;

public class Workout {
	private long hours;
	
	public Workout() {
		hours=0;
	}
	
	public long duration(long multiplicand) {
		return toHours()*multiplicand;
	}
	
	public long toHours() {return hours;}
}
