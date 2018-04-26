import javax.swing.JOptionPane;


public class exercicio12{
    public static void main(String[] args){

       int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null," Digite o primeiro numero"));
       int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null," Digite o segundo numero"));
       

       if (numero1 > numero2){
           JOptionPane.showMessageDialog(null," Numero 1 é maior que numero 2");
       }else{
           JOptionPane.showMessageDialog(null," Numero 2 é maior que numero 1");
       }


    }


}