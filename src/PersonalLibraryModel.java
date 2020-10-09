import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

// TODO: Auto-generated Javadoc
/**
 * The Class PersonalLibraryModel.
 * @author Ethan Peng
 */
public class PersonalLibraryModel {
	
	/** The arraylist storing books. */
	private ArrayList<Book> bk;
	
	/** The arraylist storing songs. */
	private ArrayList<Song> sg;
	
	/** The arraylist storing videogames. */
	private ArrayList<VideoGame> vg;
	
	/** The arraylist storing videos. */
	private ArrayList<Video> vi;
	
	/** The arraylist storing search results. */
	private ArrayList<Media> search;

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
		 * @param o1 the first object
		 * @param o2 the second object
		 * @return whether o1 goes before o2
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
	
	public String[] getMedia() {
		Collections.sort(bk,new ByTitle());
		Collections.sort(sg,new ByTitle());
		Collections.sort(vg,new ByTitle());
		Collections.sort(vi,new ByTitle());
		search = new ArrayList<>();
		for (int i = 0; i < bk.size();i++) {
			search.add(bk.get(i));
		}
		for (int i = 0; i < sg.size();i++) {
			search.add(sg.get(i));
		}
		for (int i = 0; i < vi.size();i++) {
			search.add(vi.get(i));
		}
		for (int i = 0; i < vg.size();i++) {
			search.add(vg.get(i));
		}
		String[] s = new String[search.size()];
		for (int i = 0; i < search.size();i++) {
			s[i] = search.get(i).toString();
		}	
		return s;
	}
	
	/**
	 * Gets the matching media.
	 *
	 * @param type the type
	 * @return the matching media
	 */
	public String[] getMatchingMedia(String type) {
		Collections.sort(bk,new ByTitle());
		Collections.sort(sg,new ByTitle());
		Collections.sort(vg,new ByTitle());
		Collections.sort(vi,new ByTitle());
		search = new ArrayList<>();
		if (type.equals("Book")) {
			for(Media m : bk) {
				search.add(m);
			}
		} else if (type.equals("Song")) {
			for(Media m : sg) {
				search.add(m);
			}
		} else if (type.equals("Video")) {
			for(Media m : vi) {
				search.add(m);
			}
		} else {
			for(Media m : vg) {
				search.add(m);
			}
		}
		//make tostring
		String[] s = new String[search.size()];
		for (int i = 0; i < search.size();i++) {
			s[i] = search.get(i).toString();
		}
		return s;
	}
	
	/**
	 * Gets the matching title.
	 *
	 * @param title the title
	 * @return the matching title
	 */
	public String[] getMatchingTitle(String title) {
		Collections.sort(bk,new ByTitle());
		Collections.sort(sg,new ByTitle());
		Collections.sort(vg,new ByTitle());
		Collections.sort(vi,new ByTitle());
		search = new ArrayList<>();
		for (int i = 0; i < bk.size(); i++) {
			if (bk.get(i).getTitle().equalsIgnoreCase(title)) {
				search.add(bk.get(i));
			}
		}
		for (int i = 0; i < sg.size(); i++) {
			if (sg.get(i).getTitle().equalsIgnoreCase(title)) {
				search.add(sg.get(i));
			}
		}
		for (int i = 0; i < vi.size(); i++) {
			if (vi.get(i).getTitle().equalsIgnoreCase(title)) {
				search.add(vi.get(i));
			}
		}
		for (int i = 0; i < vg.size(); i++) {
			if (vg.get(i).getTitle().equalsIgnoreCase(title)) {
				search.add(vg.get(i));
			}
		}
		String[] s = new String[search.size()];
		for (int i = 0; i < search.size();i++) {
			s[i] = search.get(i).toString();
		}
		return s;
	}
	
	/**
	 * Gets the type and title.
	 *
	 * @param type the type
	 * @param title the title
	 * @return the matching media
	 */
	public String[] getTypeAndTitle(String type, String title) {
		Collections.sort(bk,new ByTitle());
		Collections.sort(sg,new ByTitle());
		Collections.sort(vg,new ByTitle());
		Collections.sort(vi,new ByTitle());
		search = new ArrayList<>();
		if (type.equals("Book")) {
			for(Media m : bk) {
				if (m.getTitle().equalsIgnoreCase(title)) {
					search.add(m);
				}	
			}
		} else if (type.equals("Song")) {
			for(Media m : sg) {
				if (m.getTitle().equalsIgnoreCase(title)) {
					search.add(m);
				}	
			}
			
		} else if (type.equals("Video")) {
			for(Media m : vi) {
				if (m.getTitle().equalsIgnoreCase(title)) {
					search.add(m);
				}	
			}
			
		} else {
			for(Media m : vg) {
				if (m.getTitle().equalsIgnoreCase(title)) {
					search.add(m);
				}	
			}
		}
		String[] s = new String[search.size()];
		for (int i = 0; i < search.size();i++) {
			s[i] = search.get(i).toString();
		}
		return s;
	}

	/**
	 * Delete.
	 *
	 * @param index the index
	 */
	public void delete(int index) {
		if (search.get(index).getType().equals("Book")) {
			bk.remove(search.get(index));
		} else if (search.get(index).getType().equals("Song")) {
			sg.remove(search.get(index));
		} else if (search.get(index).getType().equals("Video")) {
			vi.remove(search.get(index));
		} else if (search.get(index).getType().equals("Video Game")) {
			vg.remove(search.get(index));
		}
	}
	
}
