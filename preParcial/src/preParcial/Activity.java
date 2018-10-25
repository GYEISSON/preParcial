package preParcial;
import java.util.*;

public class Activity(){
	private ArrayList<Record> records;
	Activity(){
		records = new ArrayList<Record>();
	}
	public boolean evaluate(){
		for(Record r: records){
			r.evaluate();
		}
	}
}