
public class Book {
	private String author, title, genre, publisher;
	private int publicationYear, numberOfPages;
	
	public Book(){
		author = "Anonymous";
		title = "Untitled";
		genre = "Uncategorized";
		publicationYear = 2015;
		publisher = "Self Published";
		numberOfPages = 5;
	}
	public Book(String Author, String Title, String Genre, int Year, String Publisher, int Pages){
		author = Author;
		title = Title;
		genre = Genre;
		publicationYear = Year;
		publisher = Publisher;
		numberOfPages = Pages;
	}
	
	
	public String getAuthor() {
		return author;
	}
	public String getTitle() {
		return title;
	}
	public String getGenre() {
		return genre;
	}
	public String getPublisher() {
		return publisher;
	}
	public int getPublicationYear() {
		return publicationYear;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	
	
	public void setAuthor(String Author) {
		author = Author;
	}
	public void setTitle(String Title) {
		title = Title;
	}
	public void setGenre(String Genre) {
		genre = Genre;
	}
	public void setPublisher(String Publisher) {
		publisher = Publisher;
	}
	public void setPublicationYear(int Year) {
		publicationYear = Year;
	}
	public void setNumberofPages(int Pages) {
		numberOfPages = Pages;
	}

}
