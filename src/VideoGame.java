
public class VideoGame extends Media {

	public VideoGame(String title) {
		super(title);
	}
	public String toString() {
		return "Game Title: " + this.getTitle() + "\n"
				+"Format: " + this.getFormat() + "\n"
				+"Location: " + this.getLocation() + "\n"
				+"Notes: " + this.getNotes();
	}

}
