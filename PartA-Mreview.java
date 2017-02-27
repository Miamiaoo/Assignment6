package assignment;
import java.util.*;


public class Mreview implements Comparable<Mreview> {
	private String title;   // title of the movie
	private ArrayList<Integer> ratings; // list of ratings stored in a Store object

	//3 constructors
	public Mreview() {
		title = ""; //set title to ""
		ratings = new ArrayList<>(); //creates an empty ArrayList to ratings
	}
	
	public Mreview(java.lang.String ttl) {
		this.title = ttl;
		ratings = new ArrayList<>();
	}
	
	public Mreview(String ttl, int firstRating) {
		this.title = ttl;
		ratings = new ArrayList<>(1); //creates a ratings list whose size() is one
		ratings.add(firstRating); //having the parameter int as the (only/first) element
	}

	// 7 methods
	public void addRating(int r) {
		ratings.add(r); //Inserts the parameter rating in the ratings list.
	}
	
	public double aveRating() {
		double sum = 0;
		double ave = 0.00;
		for(int i = 0; i < ratings.size(); i++) {
			sum += ratings.get(i);
		}
		ave = sum / ratings.size(); //Returns the average of the ratings stored in the rating list.
		return ave;
	}
	

	@Override
	public int compareTo(Mreview obj) {
		return this.title.compareTo(obj.title); //Overrides the abstract method defined in Comparable interface.
	}
	
	@Override
	public boolean equals(java.lang.Object obj) {
		return this.title.equals(obj); //Overrides the method derived from Object.
		
	}
	
	public String getTitle() {
		return title; //Returns the title string.
	}

	public int numRatings() {
		return ratings.size(); //Returns the size of the rating list.
	}

	@Override
	public String toString() {
		//String representation of a Mreview.
		return("This is " + title + ", average " + aveRating() + " out of " + ratings.size() + " ratings.");
	}
	

}
