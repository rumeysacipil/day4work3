package interfaces;

public class SmsLogger implements Logger{//implements logger� sms loggera uyarla demek

	@Override
	public void log(String message) {
 System.out.println("sms g�nderildi: "+message);		
	}


}
