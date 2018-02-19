package hu.bme.mit.train.sensor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class TrainSensorTest {
	Tachograph t1;
	
    @Before
    public void before() {
        t1 = new Tachograph();
        t1.put(0, 50, 10);
    }

    @Test
    public void TachographTest() {
        Assert.assertEquals(10, t1.getSpeed(0, 50));
    }
}
