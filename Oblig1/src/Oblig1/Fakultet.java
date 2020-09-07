package Oblig1;
import javax.swing.JOptionPane;
public class Fakultet {

	public static void main(String[] args) 
	{
		String input = "";
		int n = 1;
		int svar = 1;
		int temp = 1;
		int orgtall = 0;
		
		JOptionPane.showMessageDialog(null, "Skriv inn et heltall du vil vite fakultetet av");
		
		input = JOptionPane.showInputDialog("Heltall", input);
		n = Integer.parseInt(input);
		orgtall = n;
		
		for (int i = 1; i <= orgtall; i++ )
		{
			temp = n;
			svar = temp * svar;
			n--;
		}
		JOptionPane.showMessageDialog(null, "Svaret ditt er: "+svar);
	}

}
