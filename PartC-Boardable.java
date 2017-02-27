package assignment;

import java.util.Date;

public interface Boardable {


	@SuppressWarnings("deprecation")
	public static void setBoardStart(int month, int day, int year, Date boardStart) {
		boardStart = new Date (year, month, day);
		
	}

	@SuppressWarnings("deprecation")
    public static void setBoardEnd(int month, int day, int year, Date boardEnd) {
        boardEnd = new Date(year,month,day);
    }
	
	@SuppressWarnings("deprecation")
    public static boolean boarding(int month, int day, int year) {
	    Date boardStart = null;
		Date boardEnd = null;
	    Date boarding = new Date(year,month,day);
		if(boarding.after(boardStart) && boarding.before(boardEnd)){
            return true;
        }
        else if(boarding.equals(boardStart) || boarding.equals(boardEnd)){
            return true;
        }
        return false;
    }
}
