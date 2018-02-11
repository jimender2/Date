import javax.swing.JOptionPane;

/*
 * Jonathan Meredith
 */

public class Date {

	public static void main(String[] args) {

		String input, monthWord, message;

		int month, day, year, validDay, maxDays;

		boolean leapYear;

		monthWord = "error";
		
		input = JOptionPane.showInputDialog("Enter the Year");
		year = Integer.parseInt(input);

		if (year >= 10000) {
			JOptionPane.showMessageDialog(null, year + " is not valid year");
			System.exit(0);
		}
		if (year % 4 == 0) {
			leapYear = true;
		} else {
			leapYear = false;
		}

		input = JOptionPane.showInputDialog("Enter the Month");
		month = Integer.parseInt(input);

		if (!(1 >= month || month <= 12)) {
			JOptionPane.showMessageDialog(null, "Not valid");
			System.exit(0);
		}

		if (month == 1) {
			monthWord = "January";
			maxDays = 31;
		} else if (month == 2) {
			monthWord = "Febuary";
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
			maxDays = 31;
		} else if (month == 5) {
			monthWord = "May";
			maxDays = 31;
		} else if (month == 6) {
			monthWord = "June";
			maxDays = 31;
		} else if (month == 7) {
			monthWord = "July";
			maxDays = 31;
		} else if (month == 8) {
			monthWord = "August";
			maxDays = 31;
		} else if (month == 9) {
			monthWord = "September";
			maxDays = 31;
		} else if (month == 10) {
			monthWord = "October";
			maxDays = 31;
		} else if (month == 11) {
			monthWord = "November";
			maxDays = 31;
		} else if (month == 12) {
			monthWord = "December";
			maxDays = 31;
		}

		input = JOptionPane.showInputDialog("Enter the Day");
		day = Integer.parseInt(input);

		JOptionPane.showMessageDialog(null,	monthWord + " " + day + ", " + year);

	}

}
