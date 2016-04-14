
public class VideoDriver {

	public static void main(String[] args) {
		System.out.println("Creating new ProxyVideo");
		VideoInterface video1 = new ProxyVideo("video1.mov"); 
		
		System.out.println("\nCreating new RealVideo");
		VideoInterface video2 = new RealVideo("video2.mov");
		System.out.println("\nPlaying ProxyVideo");
		video1.play();
		System.out.println("\nPlaying realVideo");
		video2.play();
		System.out.println("\nPlaying ProxyVideo");
		video1.play();
	}

}
