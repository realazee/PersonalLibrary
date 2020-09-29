
public class VideoGame extends Media {


// By Aaron Zheng
	
	//Constructor
	public VideoGame(String title, String location, String notes, String format) {
		super(title, location, notes, format);
		
		
	}
	
	//to string method that returns the string of the item.
	public String toString() {
		return "Game Title: " + this.getTitle() + "\n"
				+"Format: " + this.getFormat() + "\n"
				+"Location: " + this.getLocation() + "\n"
				+"Notes: " + this.getNotes();
	}

}
