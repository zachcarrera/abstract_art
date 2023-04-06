package com.zachcarrera.abstractart;

public class Sculpture extends Art {
	private String material;
	
	// constructors
	public Sculpture() {
		super();
		this.material = "Unknown Material";
	}
	
	public Sculpture(String title, String author, String description, String material) {
		super(title, author, description);
		this.material = material;
	}


	// abstract method implementation
	@Override
	public void viewArt() {
		// TODO Auto-generated method stub
		System.out.printf("%s was sculpted by %s with %s\n", this.getTitle(), this.getAuthor(), this.material);
		System.out.println("Description: " + this.getDescription());

	}

	// getters and setters
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	

}
