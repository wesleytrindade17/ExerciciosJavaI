import javax.swing.JOptionPane;

public class ExercicioTabuada03 {

	public static void main (String args[]) {
		
		int tab;
		
		String num = JOptionPane.showInputDialog("Digite um valor");
		int n1 = Integer.parseInt(num);
		
		for (tab=1; tab<=10; ++tab ) {
			
			System.out.println(n1 + " X " + tab + " = " + (tab*n1));
		}
		
		
			
	}
	
	
	
	
}
