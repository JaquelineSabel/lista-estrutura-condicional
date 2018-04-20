import javax.swing.JOptionPane;
public class exercicio03{
    public static void main(String[] args){
       int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null,"digite o primeiro numero"));
       int numero2 =  Integer.parseInt(JOptionPane.showInputDialog(null,"digite o segundo numero"));
       int tipoCalculo = Integer.parseInt(JOptionPane.showInputDialog (" informe o tipo de calculo:" + 
                                                                      "\n  1 para somar:" +
                                                                      "\n  2 para subtrair:" + 
                                                                      "\n  3 para multiplicar:" + 
                                                                      "\n  4 para dividir"));
        if(tipoCalculo ==1){
            int resultado = (numero1 + numero2);
            JOptionPane.showMessageDialog(null,"O resultado é:" + resultado);
        }else if (tipoCalculo ==2){
            int resultado = (numero1 - numero2);
            JOptionPane.showMessageDialog(null," O resultado é:" + resultado);
        }else if (tipoCalculo ==3){
            int resultado = (numero1 * numero2);
            JOptionPane.showMessageDialog(null," O resultado é:" + resultado);
        }else if (tipoCalculo ==4){
            int resultado = (numero1 / numero2);
            JOptionPane.showMessageDialog(null," o resultado é:" + resultado);

        }
                                                                     
  
    }
    
}