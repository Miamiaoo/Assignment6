package assignment;

public class MainMreview {

	public static void main(String[] args) {
		Mreview m = new Mreview("Mia's Book", 2);
		
		m.addRating(7);
		
		System.out.println(m.aveRating());
		System.out.println(m.getTitle());
		System.out.println(m.numRatings());
		System.out.println(m.toString());

	}

}
