package inheritance2;

public class LogManager {
   public void log(int logType) {
	   if(logType==1) {
		   System.out.println("veritabanına loglandı");
	   }
	   else if(logType==2) {
		   System.out.println("dosyaya loglandı");
	   }
	   else {
		   System.out.println("Email gönderildi");
	   }
   }
}


//1-database
//2-File
//3-Email