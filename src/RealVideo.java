
public class RealVideo implements VideoInterface {
	private String videoName;
	
	public RealVideo(String videoName){
		this.videoName=videoName;
		load(videoName);
	}
	
	@Override
	public void play(){
		System.out.println("Playing " + videoName);
	}
	
	private void load(String filename){
		System.out.println("Loading " + videoName);
	}
}
