
public class Video extends Media {
	private String star;
	
	
	public Video(String title) {
		// TODO Auto-generated constructor stub
		super(title);
	}

	
	public String toString() {
		return "star: " + this.getStar() + "\n"
				+"Video Title: " + this.getTitle() + "\n"
				+"Format: " + this.getFormat() + "\n"
				+"Location: " + this.getLocation() + "\n"
				+"Notes: " + this.getNotes();
	}


	public String getStar() {
		return star;
	}


	public void setStar(String star) {
		this.star = star;
	}
	

}
