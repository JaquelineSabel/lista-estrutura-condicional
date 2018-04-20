import javax.swing.JOptionPane;
public class exercicio05{
    public static void main(String[] args){
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        if (numero % 2 !=0 ) {
            JOptionPane.showMessageDialog(null,"Esse numero é impar");
        } else{
            JOptionPane.showMessageDialog(null,"Esse numero não é impar");
        }
    }
}  