package iBook;

public class Books {
	private static int idGlobal = 0;
	private int id;
	private String name;
	private String author;
	private String language;
	private Double price;
	private String publishDate;
	private String isbn;
	
	
	
	@Override
	public String toString() {
		return "Books [id=" + id + ", name=" + name + ", author=" + author + ", language=" + language + ", price="
				+ price + ", publishDate=" + publishDate + ", isbn=" + isbn + "]";
	}

	public Books() {
		this.id = idGlobal++;
	}

	public Books(String name, String author, String language, Double price, String publishDate, String isbn) {
        this.id = idGlobal++;
		this.name = name;
		this.author = author;
		this.language = language;
		this.price = price;
		this.publishDate = publishDate;
		this.isbn = isbn;
	}
	
	public static void setIdGlobal(int id) {
		idGlobal = id;
	}

	public static int getIdGlobal() {
		return idGlobal;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
}
