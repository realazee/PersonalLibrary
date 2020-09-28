
public class VideoGame extends Media {
// By Aaron Zheng
	
	//Constructor
	public VideoGame(String title) {
		super(title);
	}
	
	//to string method that returns the string of the item.
	public String toString() {
		return "Game Title: " + this.getTitle() + "\n"
				+"Format: " + this.getFormat() + "\n"
				+"Location: " + this.getLocation() + "\n"
				+"Notes: " + this.getNotes();
	}

}
