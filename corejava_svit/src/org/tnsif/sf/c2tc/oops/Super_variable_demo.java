package org.tnsif.sf.c2tc.oops;
class Notification
{
	String message="default Notification";
}
class PushNotification extends Notification
{
	String message="Push Notification from whatsapp";
	
	void showNotification()
	{
		System.out.println("child message :"+message);
		System.out.println("parent message :"+super.message);
	}
}

public class Super_variable_demo {

	public static void main(String[] args) {
		PushNotification pn=new PushNotification();
		pn.showNotification();

	}

}
