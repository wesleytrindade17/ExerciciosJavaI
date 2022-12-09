
import javax.swing.JOptionPane;

public class ExercicioIF01 {

 public static void main (String args[]) {
	 
	 float desc_porc, desc_valor, prod_com_desc;
	 
	 String nome_produtoS = JOptionPane.showInputDialog("Digita o nome do Produto");
	 String valor = JOptionPane.showInputDialog("Digite o valor do produto");
	 float valor_f = Float.parseFloat(valor);
	 
	 if (valor_f >= 50 && valor_f <200) {
		 
	     desc_porc = 5;
	     desc_valor = valor_f * desc_porc / 100;
         prod_com_desc = valor_f - desc_valor;
	     String mensagem = "Produto: " + nome_produtoS + "\nValor Original do produto: " + valor_f + "\nValor do Produto com desconto:" + prod_com_desc;
	     JOptionPane.showMessageDialog(null, mensagem);
	 }
	     else if (valor_f >=200 && valor_f <500) {
         desc_porc = 6;
         desc_valor = valor_f * desc_porc / 100;
         prod_com_desc = valor_f - desc_valor;
	     String mensagem = "Produto: " + nome_produtoS + "\nValor Original do produto: " + valor_f + "\nValor do Produto com desconto:" + prod_com_desc;
	     JOptionPane.showMessageDialog(null, mensagem);
         
	     }
	     else if (valor_f >=500 && valor_f <1000) {
	     desc_porc = 7;
         desc_valor = valor_f * desc_porc / 100;
	     prod_com_desc = valor_f - desc_valor;
	     String mensagem = "Produto: " + nome_produtoS + "\nValor Original do produto: " + valor_f + "\nValor do Produto com desconto:" + prod_com_desc;
	     JOptionPane.showMessageDialog(null, mensagem);
	         
		 }
	     else if (valor_f >=1000) {
	     desc_porc = 8;
         desc_valor = valor_f * desc_porc / 100;
	     prod_com_desc = valor_f - desc_valor;
	     String mensagem = "Produto: " + nome_produtoS + "\nValor Original do produto: " + valor_f + "\nValor do Produto com desconto:" + prod_com_desc;
	     JOptionPane.showMessageDialog(null, mensagem);
	         
		 } 
             else if (valor_f < 0 ) {
     
               JOptionPane.showMessageDialog(null, "ERRO. " + valor_f + " Inválido");
             } else JOptionPane.showMessageDialog(null, "ERRO. Digite um valor a partir de 50");
 }
	
}


