import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PersonalLibraryModel {
	private ArrayList<Book> bk;
	private ArrayList<Song> sg;
	private ArrayList<VideoGame> vg;
	private ArrayList<Video> vi;
	public PersonalLibraryModel() {
		// TODO Auto-generated constructor stub
		bk = new ArrayList<>();
		sg = new ArrayList<>();
		vg = new ArrayList<>();
		vi = new ArrayList<>();

	}
	
	public void insertBook(String author, String title, String format, String location, String notes) {
		bk.add(new Book(author, title,format,location,notes));
	}
	public void insertSong(String author, String songTitle, String format, String location, String notes) {
		sg.add(new Song(author, songTitle,format, location,notes));
	}
	public void insertVideo(String vidTitle, String star, String format, String location, String notes) {
		vi.add(new Video(vidTitle,star, format, location,notes));
	}
	public void insertVideoGame(String gtitle, String format, String location, String notes) {
		vg.add(new VideoGame(gtitle,format, location,notes));
	}
	
	private class ByTitle implements Comparator<Media> {
		public int compare(Media o1, Media o2) {
			return o1.getTitle().compareTo(o2.getTitle());
		}
	}
	
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
