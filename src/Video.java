
public class Video extends Media {
	private String star;
	//by Aaron Zheng
	
	//constructor 
	public Video(String title) {
		// TODO Auto-generated constructor stub
		super(title);
	}

	//to string method that returns the string of the item.
	public String toString() {
		return "star: " + this.getStar() + "\n"
				+"Video Title: " + this.getTitle() + "\n"
				+"Format: " + this.getFormat() + "\n"
				+"Location: " + this.getLocation() + "\n"
				+"Notes: " + this.getNotes();
	}

//getter for star
	public String getStar() {
		return star;
	}

//setter for star
	public void setStar(String star) {
		this.star = star;
	}
	

}
