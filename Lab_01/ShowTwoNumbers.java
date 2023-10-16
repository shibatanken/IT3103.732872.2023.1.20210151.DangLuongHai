// Example 4: ShowTwoNumbers.java

import javax.swing.JOptionPane;

public class ShowTwoNumbers{

    public static void main(String[] args) {
        String strNuml, strNum2;
        String strNotification = "You've just entered: ";
        strNuml = JOptionPane.showInputDialog(null,"Luong Hai Dang -20210151- Please input the first number: ",
        "Luong Hai Dang -20210151-  input the first number: ",
                JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNuml + " and";

        strNum2 = JOptionPane.showInputDialog(null, "Luong Hai Dang -20210151-Please input the second number: ",
        "Luong Hai Dang -20210151- input the first number: ",
                JOptionPane.INFORMATION_MESSAGE);

        strNotification += strNum2;

        JOptionPane.showMessageDialog(null, strNotification, "Luong Hai Dang Show two numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}