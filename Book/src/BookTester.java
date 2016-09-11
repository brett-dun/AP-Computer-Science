
public class BookTester 
{

	public static void main(String[] args)
	{
		Book reader = new Book();
		Book reader2 = new Book("Robert Jordan", "Eye of the World", "Fantasy",
								1990, "Tor",  895);
		System.out.println("Book [author=" + reader.getAuthor() + 
						    ", title=" + reader.getTitle() + 
						    ", genre=" + reader.getGenre() + 
						    ", publicationYear=" + reader.getPublicationYear() + 
						    ", publisher=" + reader.getPublisher() + 
						    ", numberOfPages=" + reader.getNumberOfPages() + "]");
		
		//Will print out on one line...
		//Book [author=Anonymous, title=Untitled, genre=Uncategorized, 
		//		publicationYear=2015, publisher=Self published, numberOfPages=5]
		
		
		System.out.println("Book [author=" + reader2.getAuthor() + 
			    ", title=" + reader2.getTitle() + 
			    ", genre=" + reader2.getGenre() + 
			    ", publicationYear=" + reader2.getPublicationYear() + 
			    ", publisher=" + reader2.getPublisher() + 
			    ", numberOfPages=" + reader2.getNumberOfPages() + "]");

		//Will print out on one line...
		//Book [author=Robert Jordan, title=Eye of the World, genre=Fantasy, 
		//		publicationYear=1990, publisher=Tor, numberOfPages=895]
						
		reader.setAuthor("Theo Lesieg");
		reader.setGenre("Childens");
		reader.setPublicationYear(1965);
		
		System.out.println("Book [author=" + reader.getAuthor() + 
			    ", title=" + reader.getTitle() + 
			    ", genre=" + reader.getGenre() + 
			    ", publicationYear=" + reader.getPublicationYear() + 
			    ", publisher=" + reader.getPublisher() + 
			    ", numberOfPages=" + reader.getNumberOfPages() + "]");
		
		//Will print out on one line...
		//Book [author=Theo Lesieg, title=Untitled, genre=Childens, 
		//		publicationYear=1965, publisher=Self published, numberOfPages=5]
		
		
	}
}
