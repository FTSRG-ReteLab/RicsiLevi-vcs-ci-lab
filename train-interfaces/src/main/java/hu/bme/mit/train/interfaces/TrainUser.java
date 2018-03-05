package hu.bme.mit.train.interfaces;

public interface TrainUser {

	public boolean getAlarmState();

	public void setAlarmState(boolean alarmState);

	int getJoystickPosition();

	boolean getAlarmFlag();

	void overrideJoystickPosition(int joystickPosition);

}
