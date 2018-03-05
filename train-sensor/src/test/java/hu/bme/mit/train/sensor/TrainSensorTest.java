package hu.bme.mit.train.sensor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
import hu.bme.mit.train.user.*;
import hu.bme.mit.train.interfaces.*;


public class TrainSensorTest {
	Tachograph t1;
	TrainController mockedController = mock(TrainController.class);
	TrainUser mockedUser = mock(TrainUser.class);
	TrainSensorImpl uut;
	
    @Before
    public void before() {
        t1 = new Tachograph();
        t1.put(0, 50, 10);
        uut = new TrainSensorImpl(mockedController, mockedUser);
        
        
    }

    @Test
    public void TachographTest() {
        Assert.assertEquals(10, t1.getSpeed(0, 50));
    }
    
    @Test
    public void overrideSpeedLimit_lessThanZero_setAlarm(){
    	when(mockedController.getReferenceSpeed()).thenReturn(50);
    	uut.overrideSpeedLimit(-5);
    	verify(mockedUser, times(1)).setAlarmState(true);
    }
}
