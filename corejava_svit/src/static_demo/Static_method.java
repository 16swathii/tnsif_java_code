package static_demo;
class PaymentGateway
{
	static void showSupportedBanks()
	{
		System.out.println("Supported Banks : SBI, HDFC,ICICI,AXis");
	}
}


public class Static_method {

	public static void main(String[] args) {
		PaymentGateway.showSupportedBanks();

	}

}