import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// TODO: Auto-generated Javadoc
/**
 * The Class PersonalLibraryModel.
 * @author Ethan Peng
 */
public class PersonalLibraryModel {
	
	/** The bk. */
	private ArrayList<Book> bk;
	
	/** The sg. */
	private ArrayList<Song> sg;
	
	/** The vg. */
	private ArrayList<VideoGame> vg;
	
	/** The vi. */
	private ArrayList<Video> vi;
	
	/**
	 * Instantiates a new personal library model.
	 */
	public PersonalLibraryModel() {
		// TODO Auto-generated constructor stub
		bk = new ArrayList<>();
		sg = new ArrayList<>();
		vg = new ArrayList<>();
		vi = new ArrayList<>();

	}
	
	/**
	 * Insert book.
	 *
	 * @param author the author
	 * @param title the title
	 * @param format the format
	 * @param location the location
	 * @param notes the notes
	 */
	public void insertBook(String author, String title, String format, String location, String notes) {
		bk.add(new Book(author, title,format,location,notes));
	}
	
	/**
	 * Insert song.
	 *
	 * @param author the author
	 * @param songTitle the song title
	 * @param genre the genre
	 * @param format the format
	 * @param location the location
	 * @param notes the notes
	 */
	public void insertSong(String author, String songTitle, String genre,String format, String location, String notes) {
		sg.add(new Song(author, songTitle,genre,format, location,notes));
	}
	
	/**
	 * Insert video.
	 *
	 * @param vidTitle the vid title
	 * @param star the star
	 * @param format the format
	 * @param location the location
	 * @param notes the notes
	 */
	public void insertVideo(String vidTitle, String star, String format, String location, String notes) {
		vi.add(new Video(vidTitle,star, format, location,notes));
	}
	
	/**
	 * Insert video game.
	 *
	 * @param gtitle the gtitle
	 * @param format the format
	 * @param location the location
	 * @param notes the notes
	 */
	public void insertVideoGame(String gtitle, String format, String location, String notes) {
		vg.add(new VideoGame(gtitle,format, location,notes));
	}
	
	/**
	 * The Class ByTitle.
	 */
	private class ByTitle implements Comparator<Media> {
		
		/**
		 * Compare.
		 *
		 * @param o1 the o 1
		 * @param o2 the o 2
		 * @return the int
		 */
		public int compare(Media o1, Media o2) {
			return o1.getTitle().compareTo(o2.getTitle());
		}
	}
	
	/**
	 * Gets the media.
	 *
	 * @return the media
	 */
	public ArrayList<Media> getMedia() {
		Collections.sort(bk,new ByTitle());
		Collections.sort(sg,new ByTitle());
		Collections.sort(vg,new ByTitle());
		Collections.sort(vi,new ByTitle());
		ArrayList<Media> f  = new ArrayList<>();
		for (int i = 0; i < bk.size();i++) {
			f.add(bk.get(i));
		}
		for (int i = 0; i < sg.size();i++) {
			f.add(sg.get(i));
		}
		for (int i = 0; i < vg.size();i++) {
			f.add(vg.get(i));
		}
		for (int i = 0; i < vi.size();i++) {
			f.add(vi.get(i));
		}
		return f;
	}
	
	
}
