package interface_demo;

class EmailNotification implements NotificationService
{
	@Override
	public void notifyUser(String message) {
		System.out.println("Sending Email :"+ message);
	}
}

class SMSNotification implements NotificationService
{

	@Override
	public void notifyUser(String message) {
		System.out.println("Sending message :"+message);
		
	}
	
}

public class Functional_interface_demo {

	public static void main(String[] args) {
		NotificationService email=new EmailNotification();
		NotificationService sms=new SMSNotification();
		
		email.notifyUser("Assignment Uploaded");
		sms.notifyUser("class ast 10am");
		
	}

}
