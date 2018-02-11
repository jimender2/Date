import javax.swing.JOptionPane;

/*
 * Jonathan Meredith
 */

public class Date {

	public static void main(String[] args) {
		
		//Declared Variables
		String input, monthWord, message;

		int month, day, year, validDay, maxDays;

		boolean leapYear;

		//Can I get rid of these?
		monthWord = "error";
		maxDays = 0;
		
		//Get the year
		input = JOptionPane.showInputDialog("Enter the Year");
		year = Integer.parseInt(input);

		//Check if Year is Valid
		if (year >= 10000) {
			JOptionPane.showMessageDialog(null, year + " is not valid year");
			System.exit(0);
		}
		
		//Check if Year is Leap Year
		if (year % 4 == 0) {
			leapYear = true;
		} else {
			leapYear = false;
		}

		//Get the Month
		input = JOptionPane.showInputDialog("Enter the Month");
		month = Integer.parseInt(input);

		//Check if Month is valid
		if (!(1 >= month || month <= 12)) {
			JOptionPane.showMessageDialog(null, "Not valid");
			System.exit(0);
		}

		//Set the month equal to its name and get max days
		if (month == 1) {
			monthWord = "January";
			maxDays = 31;
		} else if (month == 2) {
			monthWord = "Febuary";
			
			//Fix for maxDays due to leapYear
			if (leapYear == true) {
				maxDays = 29;
			} else {
				maxDays = 28;
			}
			
		} else if (month == 3) {
			monthWord = "March";
			maxDays = 31;
		} else if (month == 4) {
			monthWord = "April";
			maxDays = 30;
		} else if (month == 5) {
			monthWord = "May";
			maxDays = 31;
		} else if (month == 6) {
			monthWord = "June";
			maxDays = 30;
		} else if (month == 7) {
			monthWord = "July";
			maxDays = 31;
		} else if (month == 8) {
			monthWord = "August";
			maxDays = 31;
		} else if (month == 9) {
			monthWord = "September";
			maxDays = 30;
		} else if (month == 10) {
			monthWord = "October";
			maxDays = 31;
		} else if (month == 11) {
			monthWord = "November";
			maxDays = 30;
		} else if (month == 12) {
			monthWord = "December";
			maxDays = 31;
		}

		//Get the Day
		input = JOptionPane.showInputDialog("Enter the Day");
		day = Integer.parseInt(input);
		
		//Check if Day is Valid
		if (maxDays < day) {
			JOptionPane.showMessageDialog(null, day + " is not a valid day");
			System.exit(0);
		}
		
		message = " " + day + ", " + year;
		JOptionPane.showMessageDialog(null,	monthWord + message);

	}

}
