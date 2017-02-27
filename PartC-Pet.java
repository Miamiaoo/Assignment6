package assignment;

public class Pet {
	private String petname;
	private String ownername;
	private String color;
	
	protected int sex;
	
	public static final int male = 0;
	public static final int female = 1;
	public static final int spayed = 2;
	public static final int neutered = 3;
	

	public Pet (String petname, String ownername, String color) {
		this.petname = petname;
	    this.ownername = ownername;
	    this.color = color;
	}
	
	public String getPetName() {
		return petname;
	}
	
	public String getOwnerName() {
        return ownername;
    }
	
	public String getColor() {
	    return color;
	}
	
	public void setSex(int sexID){
	       try {
	           if(sexID >=0 && sexID <=3)
	           sex = sexID;
	       }catch (IllegalArgumentException e){
	           System.out.println("You should enter only 0,1,2,3");
	       }
	    }
	
	public String getSex() {
		switch (sex){
	        case male       : return "It is MALE";
	        case female     : return "It is FEMALE";
	        case spayed     : return "It is SPAYED";
	        case neutered   : return "It is NEUTERED";
		}
		return "sex";
	}
	
	 public String toString(){
	        return("This is " + petname +" which is owned by "+ ownername + ", its color is "+ color + " and gender is: " + getSex());
	    }




// main method
public static void main(String args[]) {
	Pet p = new Pet("Spot","Mary", "Black and White");

	p.sex = 0;
	
	System.out.println(p.toString());
	

	
}

}