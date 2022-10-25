package kodlamaIoProject.core.logging;

public class MailLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println(data + " is logged to the mail");
		
	}

}
