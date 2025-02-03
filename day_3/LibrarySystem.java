package day_3;


class Item{
	String title="Pride and Prejudice";
	String author="Jane Austen";
	int publicationYear=1813;
	void showDetails() {
		System.out.println("title: "+title);
		System.out.println("author: "+author);
		System.out.println("publicationYear: "+publicationYear);
		
	}

}
class Book extends Item{
	String genre="Classic Regency novel";
	void showDetails() {
		System.out.println("title: "+title);
		System.out.println("author: "+author);
		System.out.println("publicationYear: "+publicationYear);
		System.out.println("genre: "+genre);
		
	}
}

class Magazine extends Item{
	int issueNumber=4;
	void showDetails() {
		System.out.println("title: "+title);
		System.out.println("author: "+author);
		System.out.println("publicationYear: "+publicationYear);
		System.out.println("issueNuber: "+issueNumber);
	}

}
public class LibrarySystem {
	public static void main(String[] args) {
		Magazine m=new Magazine();
		Book b=new Book();
		m.showDetails();
		b.showDetails();
		
	}
}
