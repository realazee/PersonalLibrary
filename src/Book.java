
// TODO: Auto-generated Javadoc
/**
 * The Class Book.
 */
public class Book extends Media {
	
	/** The author. */
	private String author;
	
	
	/**
	 * Instantiates a new book.
	 *
	 * @param title the title
	 */
	public Book(String title) {
		// TODO Auto-generated constructor stub
		super(title);
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {
		String str = "author: " + this.getAuthor() + "\n"
					+"Song Title: " + this.getTitle() + "\n"
					+"Format: " + this.getFormat() + "\n"
					+"Location: " + this.getLocation() + "\n"
					+"Notes: " + this.getNotes();
		return str;
	}

	/**
	 * Gets the author.
	 *
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}


	/**
	 * Sets the author.
	 *
	 * @param author the new author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	
}
