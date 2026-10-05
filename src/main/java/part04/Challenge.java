package part04;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3191s
//        rewatch 53:11–58:10 for JOptionPane, and 48:08–52:25 for the math
// Guide: GUIDE.md in this folder
//
// SECTION D — Challenge. A tip calculator with pop-up windows. The README lists the rules.
//
// There is no main method here yet. Typing it is part of the challenge.

import javax.swing.JOptionPane;

public class Challenge {

    public static void main(String[] args) {
        // Prompt for the bill amount
        String billStr = JOptionPane.showInputDialog("Enter the bill amount:");
        double bill = Double.parseDouble(billStr);

        // Calculate a 15% tip
        double tip = bill * 0.15;
        double total = bill + tip;

        // Show the results in a pop-up window
        JOptionPane.showMessageDialog(null, "Tip: $" + tip + "\nTotal: $" + total);
    }
}
