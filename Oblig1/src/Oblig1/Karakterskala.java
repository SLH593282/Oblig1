package Oblig1;

import javax.swing.JOptionPane;

public class Karakterskala {

  public static void main(String[] args) {
    String karakter = "";
    int A = 90;
    int B = 80;
    int C = 60;
    int D = 50;
    int E = 40;

    JOptionPane.showMessageDialog(null, "Skriv inn poengsum for å vite karakter");

    int studentTeller = 1;
    final int SISTE_STUDENT = 10;

    while (studentTeller <= SISTE_STUDENT) {
      karakter = JOptionPane.showInputDialog("Poengsum til elev" + studentTeller, karakter);
      int input = 0;
      boolean error = false;

      try {
        input = Integer.parseInt(karakter);
      } catch (Exception e) {
        error = true;
      }

      if (input >= 101 || input < 0 || error) {
        JOptionPane.showMessageDialog(null, "Ugyldig verdi");
      } else {
        if (input >= A) {
          JOptionPane.showMessageDialog(null, "Din Karakter: A");
        } else if (input >= B) {
          JOptionPane.showMessageDialog(null, "Din Karakter: B");
        } else if (input >= C) {
          JOptionPane.showMessageDialog(null, "Din Karakter: C");
        } else if (input >= D) {
          JOptionPane.showMessageDialog(null, "Din Karakter: D");
        } else if (input >= E) {
          JOptionPane.showMessageDialog(null, "Din Karakter: E");
        } else {
          JOptionPane.showMessageDialog(null, "Din Karakter: F");
        }

        studentTeller++;
      }
    }
  }
}