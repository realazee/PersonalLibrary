
// TODO: Auto-generated Javadoc
/**
 * The Class Song.
 */
public class Song extends Media {
	// By Anton Cheng
	/** The artist. */
	private String artist;
	
	/** The genre. */
	private String genre;
	
	/**
	 * Instantiates a new song.
	 *
	 * @param title the title
	 */
	public Song(String title) {
		super(title);
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {
		String str = "artist: " + this.getArtist() + "\n"
					+"Song Title: " + this.getTitle() + "\n"
					+"Genre: " + this.getGenre() + "\n"
					+"Format: " + this.getFormat() + "\n"
					+"Location: " + this.getLocation() + "\n"
					+"Notes: " + this.getNotes();
		return str;
	}
	
	/**
	 * Gets the artist.
	 *
	 * @return the artist
	 */
	public String getArtist() {
		return artist;
	}
	
	/**
	 * Sets the artist.
	 *
	 * @param artist the new artist
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	/**
	 * Gets the genre.
	 *
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}
	
	/**
	 * Sets the genre.
	 *
	 * @param genre the new genre
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}
	

}
