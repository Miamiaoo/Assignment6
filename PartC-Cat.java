package assignment;

import java.util.Date;

public class Cat extends Pet implements Boardable {

    private String hairLength;
    private Date boardStart, boardEnd, boarding;

    public Cat(String petname, String ownername, String color, String hairLength){
        super(petname, ownername, color);
        this.hairLength = hairLength;
    }
      


	public Cat(String petname, String ownername, String color, Date boardStart, Date boardEnd, Date boarding) {
		super(petname, ownername, color);
		this.boardStart = boardStart;
		this.boardEnd = boardEnd;
		this.boarding = boarding;
	}


    public String getHairLength(){
        return hairLength;
    }
    
    public String toString(){
        return( "Here is a cat: "+ "\n" + super.toString() + "\nIts hair is "+ hairLength );
    }
    
 // main method
    public static void main(String args[]) {
    	Cat c = new Cat("Tom","Bob", "black", "short");
   	
    	System.out.println(c.toString());
    	

    	
    }
}
	
