package org.alex.builderpattern;

/**
 * @author alex
 */
public class Book {
	private String title;
	private String author;
	private int publicationYear;
	private String publisher;
	private String isbn;
	private double price;
	private int pages;

	private Book(BookBuilder builder) {
		this.title = builder.title;
		this.author = builder.author;
		this.publicationYear = builder.publicationYear;
		this.publisher = builder.publisher;
		this.isbn = builder.isbn;
		this.price = builder.price;
		this.pages = builder.pages;
	}

	public static class BookBuilder {
		private String title;
		private String author;
		private int publicationYear;
		private String publisher;
		private String isbn;
		private double price;
		private int pages;

		// Required params
		public BookBuilder(String title, String author) {
			this.title = title;
			this.author = author;
		}

		public BookBuilder publicationYear(int publicationYear) {
			this.publicationYear = publicationYear;
			return this;
		}

		public BookBuilder publisher(String publisher) {
			this.publisher = publisher;
			return this;
		}

		public BookBuilder isbn(String isbn) {
			this.isbn = isbn;
			return this;
		}

		public BookBuilder price(double price) {
			this.price = price;
			return this;
		}

		public BookBuilder pages(int pages) {
			this.pages = pages;
			return this;
		}

		public Book build() {
			return new Book(this);
		}
	}
}
