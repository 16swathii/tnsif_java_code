package interface_demo;

interface Camera
{
	void takePhoto();
}

//second interface
interface MusicPlayer
{
	void playMusic();
}

class SmartPhone implements Camera, MusicPlayer
{

	@Override
	public void playMusic() {
		
		System.out.println("Taking a Photo with the smartPhone camera");
	}

	@Override
	public void takePhoto() {
		
		System.out.println("Playing Music on the smartPhone");
	}
	
}


public class Multiple_interface {

	public static void main(String[] args) {
		SmartPhone myphone=new SmartPhone();
		myphone.takePhoto();
		myphone.playMusic();
		
	}

}