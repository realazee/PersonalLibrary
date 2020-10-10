import java.util.ArrayList;
//Written by Aaron Zheng
public class PersonalLibraryController {
	PersonalLibraryModel model;
	String err;
	
	//constructor
	public PersonalLibraryController() {
		model = new PersonalLibraryModel();

	}
	
	//takes in the parameters of a book, error checks and adds it if there is no error.
	public String addBook(String author, String title, String format, String location, String notes) {
		err = checkForBlankTitle(title);
		if(err.length() == 0) {
			model.insertBook(author, title, format, location, notes);
		}
		return err;

	}
	//takes in the parameters of a song, error checks and adds it if there is no error.
	public String addSong(String author, String songTitle,String genre, String format, String location, String notes) {
		err = checkForBlankTitle(songTitle);
		if(err.length() == 0) {
			model.insertSong(author, songTitle, genre,format, location, notes);
		}
		return err;
	}
	//takes in the parameters of a video, error checks and adds it if there is no error.
	public String addVideo(String vidTitle, String star, String format, String location, String notes) {
		err = checkForBlankTitle(vidTitle);
		if(err.length() == 0) {
			model.insertVideo(vidTitle, star, format, location, notes);
		}
		return err;
	}
	
	//takes in the parameters of a video game, error checks and adds it if there is no error.
	public String addVideoGame(String gtitle, String format, String location, String notes) {
		err = checkForBlankTitle(gtitle);
		if(err.length() == 0) {
		model.insertVideoGame(gtitle, format, location, notes);
		}
		return err;

	}
	
	//gets all media in the model
	public String[] getMediaDataStr() {
		return model.getMedia();
	}
	
	//gets all media in the model with matching type parameter
	public String[] getMediaByType(String type) {
	
		return model.getMatchingMedia(type);
	}
	//gets all media in the model of matching title parameter
	public String[] getMediaByTitle(String title) {
		if(title.length() == 0) {
			return new String[0];
		}
		return model.getMatchingTitle(title);
	}
	
	//gets all media in the model of matching title and type parameter
	public String[] getMediaByTypeAndTitle(String type, String title) {
		if(type.length() == 0 || title.length() == 0) {
			return new String[0];
		}
		return model.getTypeAndTitle(type, title);
	}
	
	//Written by Anton
	//deletes media in model of matching index.
	public void delete(int index) {
		model.delete(index);
	}





	//written by Aaron Zheng
	//error checks for blank title.
	public String checkForBlankTitle(String title) {
		if(title.length() == 0) {
			return "The title cannot be blank! Media will not be entered into personal library.";

		}

		return "";

	}
	
	

}