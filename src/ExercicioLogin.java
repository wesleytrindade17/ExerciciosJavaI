import javax.swing.JOptionPane;


public class ExercicioLogin {
	
	public static void main (String args[]) {
		
		int tentativas = 3;
		String login_name = "java", login_senha = "java", user, pass;
		
		
		
		user = JOptionPane.showInputDialog("Usuario:");
		pass = JOptionPane.showInputDialog("Senha:");
		tentativas = --tentativas;

		
	if (!(pass.equals(login_senha)&& user.equals(login_name))) {
		
           do {
        	   
   			String mensagem = "Login e senha errado, restam: " + tentativas ;
		    JOptionPane.showMessageDialog(null, mensagem);
        	user = JOptionPane.showInputDialog("Usuario:");
			pass = JOptionPane.showInputDialog("Senha:");
			tentativas = --tentativas;
			
           } while (!(tentativas <= 0));
	
	       JOptionPane.showMessageDialog(null, "Chances acabadas");
	}
	
	else if (pass.equals(login_senha)&& user.equals(login_name)) {
		
		JOptionPane.showMessageDialog(null, "Login Efetuado");
		
	} else  JOptionPane.showMessageDialog(null, "Chances acabadas");
	
	}

}
