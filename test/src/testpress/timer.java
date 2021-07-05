package testpress;

import java.util.Timer;
import java.util.TimerTask;

public class timer 
{
	static int secondspassed=0;
	Timer time =new Timer ();
	TimerTask task=new TimerTask()
			{
		public void run()
		{
			secondspassed++;
		}};
		public void start()
		{
			time.schedule(task,1000,1000);
			}
		public static void main(String[] args) {
			
		}
	

}
