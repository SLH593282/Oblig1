package Oblig1;

import javax.swing.JOptionPane;

public class Inntekt_og_skatt {

  public static void main(String[] args) {
    String input = "";

    input = JOptionPane.showInputDialog("Skriv inn Bruttoinntekt", input);
    int income = Integer.parseInt(input);

    int tax = (int) calculateTax(income);
    JOptionPane.showMessageDialog(null, "Trinnskatt: " + tax + "kr");
  }

  private static double calculateTax(int income) {
    boolean trinn0 = income >= 0 && income <= 164100;
    boolean trinn1 = income >= 164101 && income <= 230950;
    boolean trinn2 = income >= 230951 && income <= 580650;
    boolean trinn3 = income >= 580651 && income <= 934050;

    if (trinn0) {
      return 0;
    } else if (trinn1) {
      return income * 0.0093;
    } else if (trinn2) {
      return income * 0.0241;
    } else if (trinn3) {
      return income * 0.1152;
    }

    return income * 0.1452;
  }
}