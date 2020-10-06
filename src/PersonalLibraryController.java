import java.util.ArrayList;

public class PersonalLibraryController {
	PersonalLibraryModel model;
	PersonalLibraryGUI gui;
	String err;
	public PersonalLibraryController() {
		model = new PersonalLibraryModel();

	}

	public String addBook(String author, String title, String format, String location, String notes) {
		err = checkForBlankTitle(title);
		if(err.length() == 0) {
			model.insertBook(author, title, format, location, notes);
		}
		return err;

	}
	public String addSong(String author, String songTitle,String genre, String format, String location, String notes) {
		err = checkForBlankTitle(songTitle);
		if(err.length() == 0) {
			model.insertSong(author, songTitle, genre,format, location, notes);
		}
		return err;
	}
	public String addVideo(String vidTitle, String star, String format, String location, String notes) {
		err = checkForBlankTitle(vidTitle);
		if(err.length() == 0) {
			model.insertVideo(vidTitle, star, format, location, notes);
		}
		return err;
	}
	public String addVideoGame(String gtitle, String format, String location, String notes) {
		err = checkForBlankTitle(gtitle);
		if(err.length() == 0) {
		model.insertVideoGame(gtitle, format, location, notes);
		}
		return err;

	}
	
	
	public String[] getMediaByType(String type) {
	
		return model.getMatchingMedia(type);
	}
	
	public String[] getMediaByTitle(String title) {
		if(title.length() == 0) {
			return new String[0];
		}
		return model.getMatchingTitle(title);
	}
	
	public String[] getMediaByTypeAndTitle(String type, String title) {
		if(type.length() == 0 || title.length() == 0) {
			return new String[0];
		}
		return model.getMatchingTitleMedia(type, title);
	}
	
	
	






	public String checkForBlankTitle(String title) {
		if(title.length() == 0) {
			return "The title cannot be blank! Media will not be entered into personal library.";

		}

		return "";

	}
	
	//written by Anton
	//returns string array
	public String[] getMediaDataStr(){
		ArrayList<Media> al = model.getMedia();
		String[] s = new String[al.size()];
		int i = 0;
		for(Media m : al) {
			s[i] = m.toString();
			i++;
		}
		return s;
	}	

}
