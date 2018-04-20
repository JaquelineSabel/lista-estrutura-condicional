import javax.swing.JOptionPane;
public class exercicio06{
    public static void main(String[] args){
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        if (numero ==1 ) {
            JOptionPane.showMessageDialog(null,"Esse numero é igual a 1");
        } else{
            JOptionPane.showMessageDialog(null,"Esse numero não é igual a 1");
        }
    }
}  