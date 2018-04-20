import javax.swing.JOptionPane;
public class exercicio02{
    public static void main(String[] args){
         int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        if(numero <=-1){
            JOptionPane.showMessageDialog(null,"esse numero é negativo"); 
     }  else{
            JOptionPane.showMessageDialog(null,"esse numero não é negativo");
     }

    }
}