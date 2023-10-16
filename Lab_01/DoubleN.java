// Luong Hai Dang -20210151
// Example 5
import javax.swing.JOptionPane;
public class DoubleN {
		public static void main(String[] args) {
			String strNum1,strNum2;
			strNum1=JOptionPane.showInputDialog(null,
					"Luong Hai Dang-20210151- Please input the first number: ","Input the first number",
					 JOptionPane.INFORMATION_MESSAGE);
			strNum2=JOptionPane.showInputDialog(null,
					"Luong Hai Dang-20210151- Please input the second number: ","Input the second number",
					 JOptionPane.INFORMATION_MESSAGE);
			double num1,num2;
			num1=Double.parseDouble(strNum1);
			num2=Double.parseDouble(strNum2);
			JOptionPane.showMessageDialog(null, "Sum: "+(num1+num2)+"\n"+
												"Difference: "+(num1-num2)+"\n"+
												"Product: "+(num1*num2)+"\n"+
												"Quotient: "+(num1/num2)+"\n");
			
		}
}