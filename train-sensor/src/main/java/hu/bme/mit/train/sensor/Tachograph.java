package hu.bme.mit.train.sensor;
import com.google.common.collect.Table;

public class Tachograph {
	private Table<Integer,Integer,Integer> tachograph;
	
	public Tachograph(){
		tachograph = Table.create();
	}
	
	public void put(int time,int pos, int speed){
		tachograph.put(time,pos,speed);
	}
	
	public int getSpeed(int time, int pos){
		return tachograph.get(time,pos);
	}
}
