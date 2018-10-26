package preParcial;
import java.util.*;

public class Record{
	private int beats,power;
	private float speed;
	private double time;
	
	Record(){
		beats = power= 0;
		speed = 3;
		time =  0.55;
	}

	public int getBeats() {return beats;}
	public float getSpeed() {return speed;}
}