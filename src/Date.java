import javax.swing.JOptionPane;

/*
 * Jonathan Meredith
 */

public class Date {

	public static void main(String[] args) {
			
			String input,
				monthWord;
			
			int month,
				day,
				year,
				validDay;
			
			boolean leapYear;

			input = JOptionPane.showInputDialog("Enter the Year");
			year = Integer.parseInt(input);
			
			if(year>=10000) {
				JOptionPane.showMessageDialog(null, year + " is not valid year");
				System.exit(0);
			}
			if(year%4==0) {
				leapYear = true;
			} else {
				leapYear = false;
			}
			
			input = JOptionPane.showInputDialog("Enter the Month");
			month = Integer.parseInt(input);
			
			if(!(1>=month || month<=12)) {
					JOptionPane.showMessageDialog(null, "Not valid");
					System.exit(0);
			}
			
			if 
			
			input = JOptionPane.showInputDialog("Enter the Day");
			day = Integer.parseInt(input);

			input = JOptionPane.showInputDialog("Enter the Year");
			month = Integer.parseInt(input);

	}

}
