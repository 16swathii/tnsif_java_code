package final_demo;

class EcommercePlatform
{
	final void calculateDiscount()
	{
		System.out.println("Base discount =10%");
	}
}
class Amazon extends EcommercePlatform
{
	void calculateDiscount()
	{
	    System.out.println("Extra Discount =20%");	
	}
}
public class Final_method {

	public static void main(String[] args) {
		Amazon obj=new Amazon();
		obj.calculateDiscount();

	}

}