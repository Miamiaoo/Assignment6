package assignment;

import java.util.Date;

public class Dog extends Pet implements Boardable{

    private String size;
    private Date boardStart, boardEnd, boarding;

    public Dog(String petname, String ownername, String color, String size){
        super(petname,ownername, color);
        this.size = size;
    }
       

    public String getSize() {
		return size;
	}
    


	public Dog(String petname, String ownername, String color, Date boardStart, Date boardEnd, Date boarding) {
		super(petname, ownername, color);
		this.boardStart = boardStart;
		this.boardEnd = boardEnd;
		this.boarding = boarding;
	}

    public String toString(){
    	return( "Here is a dog: "+ "\n" + super.toString() + "\nIts size is "+ size );
    }
    
 // main method
    public static void main(String args[]) {
    	Dog d = new Dog("Spot","Susan", "white","medium");
    	d.sex = 2;
    	d.getSex();
   	
    	System.out.println(d.toString());
    	

    	
    }
}