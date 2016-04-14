
public class VideoDriver {

	public static void main(String[] args) {
		VideoInterface video1 = new ProxyVideo("video1.mov");
		
		VideoInterface video2 = new RealVideo("video2.mov");
		
		video1.play();
		
		video1.play();
		
		video2.play();
		
		video1.play();
	}

}
