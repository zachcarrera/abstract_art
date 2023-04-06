package com.zachcarrera.abstractart;

public abstract class Art {

	private String title;
	private String author;
	private String description;
	
	
	// constructors
	public Art() {
		this.title = "Anonymous Artwork";
		this.author = "Anonymous Author";
		this.description = "Who made this??";
	}

	public Art(String title, String author, String description) {
		this.title = title;
		this.author = author;
		this.description = description;
	}

	// abstract methods
	public abstract void viewArt();


	// getters and setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
