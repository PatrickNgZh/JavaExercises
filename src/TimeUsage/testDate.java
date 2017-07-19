package TimeUsage;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class testDate {

	public static void main(String[] args) {
		long INCRE =1000;
		Calendar calendar = Calendar.getInstance();  
        calendar.set(Calendar.HOUR_OF_DAY, 20); 
        calendar.set(Calendar.MINUTE, 54);  
        calendar.set(Calendar.SECOND, 0);  
        Date date=calendar.getTime(); 
        Timer timer=new Timer();
        timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				System.out.println(new Date());
			}
		}, date, 1000);
	}

}





  
        
