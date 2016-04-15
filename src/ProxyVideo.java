
public class ProxyVideo implements Video {
	private RealVideo realVideo;
	private String videoName;
	
	public ProxyVideo(String videoName){
		this.videoName=videoName;
	}
	
	@Override
	public void play(){
		if (realVideo==null) {
			realVideo = new RealVideo(videoName);
		}
		realVideo.play();
	}

}

