import java.util.Comparator;

public class Media implements Comparable<Media>, Comparator<Media> {
		
	private String title;
	private String location;
	private String notes;
	private String format;
	
	
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getNotes() {
		return notes;
	}


	public void setNotes(String notes) {
		this.notes = notes;
	}


	public String getFormat() {
		return format;
	}


	public void setFormat(String format) {
		this.format = format;
	}


	public Media(String title, String location, String notes, String format) {
		// TODO Auto-generated constructor stub
		this.title = title;
		this.location = location;
		this.notes = notes;
		this.format = format;
	}
	public Media(String title) {
		// TODO Auto-generated constructor stub
		this.title = title;
	}

	
	// These may be helpful for use cases 3-5...
	// Ignore for use cases 1,2
	@Override
	public int compare(Media o1, Media o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compareTo(Media o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
