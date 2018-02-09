import javax.swing.JOptionPane;

/*
 * Jonathan Meredith
 */

public class Date {

	public static void main(String[] args) {
			
			String input;
			int month,
				day,
				year;
			
			input = JOptionPane.showInputDialog("Enter the Month");
			month = Integer.parseInt(input);
			
			JOptionPane.showMessageDialog(null, month);
			
			input = JOptionPane.showInputDialog("Enter the Day");
			day = Integer.parseInt(input);

			input = JOptionPane.showInputDialog("Enter the Year");
			month = Integer.parseInt(input);

	}

}
