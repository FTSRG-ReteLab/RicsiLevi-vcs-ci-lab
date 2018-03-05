package hu.bme.mit.train.sensor;
import com.google.common.collect.Table;
import com.google.common.collect.HashBasedTable;

public class Tachograph {
	private Table<Integer,Integer,Integer> tachoData;
	
	public Tachograph(){
		tachoData = HashBasedTable.create();
	}
	
	public void put(int time,int pos, int speed){
		tachoData.put(time,pos,speed);
	}
	
	public int getSpeed(int time, int pos){
		return tachoData.get(time,pos);
	}
}
