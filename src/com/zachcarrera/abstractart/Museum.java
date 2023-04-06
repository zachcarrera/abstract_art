package com.zachcarrera.abstractart;

import java.util.ArrayList;
import java.util.Random;

public class Museum {

	public static void main(String[] args) {

		// create an ArrayList for museum
		ArrayList<Art> museum = new ArrayList<Art>();

		// create 3 paintings
		Painting painting1 = new Painting("Mona Lisa", "Leoanrdo da vinci", "Oil", "A Renaissance Era Portrait,");
		museum.add(painting1);

		Painting painting2 = new Painting("Nighthawks", "Edward Hopper", "Oil", "A painting from 1942.");
		museum.add(painting2);

		Painting painting3 = new Painting("Impression, Sunrise", "Claude Monte", "Oil", "An Impressionistic painting from 1874.");
		museum.add(painting3);
		
		
		// create sculptures
		Sculpture sculpture1 = new Sculpture("David of Michelangelo", "Michelangelo", "Marble", "A statue of David created between 1501 and 1504.");
		museum.add(sculpture1);
		
		Sculpture sculpture2 = new Sculpture("The Thinker", "Auguste Rodin", "Bronze", "A sculpture created in 1904 and is currently exhibited in Paris.");
		museum.add(sculpture2);
		
		
		
		// shuffle the museum ArrayList
		Random randomMachine = new Random();
		
		for (int i = 0; i < museum.size(); i++) {
            int j = randomMachine.nextInt(i + 1);
            if (i == j) {
                continue;
            }
            Art temp = museum.get(i);
            museum.set(i, museum.get(j));
            museum.set(j, temp);
        }
		

		// print the Art objects from museum
		for(Art art : museum) {
			art.viewArt();
		}
	}

}
