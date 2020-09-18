
// TODO: Auto-generated Javadoc
/**
 * The Class Song.
 */
public class Song extends Media {
	
	/** The artist. */
	private String artist;
	private String genre;
	
	/**
	 * Instantiates a new song.
	 */
	public Song(String title) {
		super(title);
	}
	public String toString() {
		String str = "artist: " + this.getArtist() + "\n"
					+"Song Title: " + this.getTitle() + "\n"
					+"Genre: " + this.getGenre() + "\n"
					+"Format: " + this.getFormat() + "\n"
					+"Location: " + this.getLocation() + "\n"
					+"Notes: " + this.getNotes();
		return str;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	

}
