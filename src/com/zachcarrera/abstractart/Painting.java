package com.zachcarrera.abstractart;

public class Painting extends Art {

	private String paintType;

	// constructors
	public Painting() {
		super();
		this.paintType = "Unknown Paint Type";
	}
	
	public Painting(String title, String author, String description, String paintType) {
		super(title, author, description);
		this.paintType = paintType;
	}

	// abstract method implementation
	@Override
	public void viewArt() {

		System.out.printf("%s was painted by %s with %s paint\n", this.getTitle(), this.getAuthor(), this.paintType);
		System.out.println("Description: " + this.getDescription());

	}


	// getters and setters
	public String getPaintType() {
		return paintType;
	}

	public void setPaintType(String paintType) {
		this.paintType = paintType;
	}
	
	

}
