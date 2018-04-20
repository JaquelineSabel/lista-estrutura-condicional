import javax.swing.JOptionPane;
public class exercicio07{
    public static void main(String[] args){
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        //par, impar ou neutro
        if(numero % 2 !=0 ){
            JOptionPane.showMessageDialog(null,"Esse numero é impar");
        } else if (numero ==0){
            JOptionPane.showMessageDialog(null,"Esse numero é neutro");
        } else{
            JOptionPane.showMessageDialog(null,"Esse numero é par");
        }   
        //positivo ou negativo 
        if(numero >=1){
            JOptionPane.showMessageDialog(null,"esse numero é positivo"); 
        }  else if(numero <-1){
            JOptionPane.showMessageDialog(null,"esse numero é negativo");
        }
            // maior ou menor que 10
        if(numero >=10){
            JOptionPane.showMessageDialog(null," Esse numero é maior que 10");
        }  else{
            JOptionPane.showMessageDialog(null," Esse numero é menor que 10");
        }  
        //menor ou igual a 50
        if(numero <=50){
            JOptionPane.showMessageDialog(null,"Esse numero é menor que 50");
        } else{
            JOptionPane.showMessageDialog(null,"Esse numero é maior que 50");
        }
        //menor que -10
        if(numero <-10){
            JOptionPane.showMessageDialog(null,"Esse numero é menor que -10");
        } else{
            JOptionPane.showMessageDialog(null,"Esse numero é maior que -10");
        }
        // maior ou igual a 30
        if(numero >=30){
            JOptionPane.showMessageDialog(null,"Esse numero é maior que 30");
        } else{
            JOptionPane.showMessageDialog(null,"Esse numero é menor que 30");
        }
        // diferente de 1
        if(numero !=1){
            JOptionPane.showMessageDialog(null,"Esse numero é diferente de 1");
        } else{
            JOptionPane.showMessageDialog(null,"Esse numero é igual a 1");
        }
    }
}
  