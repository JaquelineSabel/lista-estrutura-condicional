import javax.swing.JOptionPane;

public class exercicio14{
    public static void main(String[] args){
         int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null," Digite o primeiro numero" ));
         int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null," Digite o segundo numero"));
         int numero3 = Integer.parseInt(JOptionPane.showInputDialog(null," Digite o terceiro numero"));

         if((numero1 <= numero2) &&(numero1 <= numero3)){  
         if(numero2 <= numero3){
            JOptionPane.showMessageDialog(null,"Ordem crescente"+numero1+" - "+numero2+" - "+numero3);
         } else{
            JOptionPane.showMessageDialog(null,"Ordem crescente"+numero1+" - "+numero3+" - "+numero2);
         }
       }else if((numero2 <= numero1) &&(numero2 <= numero3)){
          if(numero1 <=numero3){
            JOptionPane.showMessageDialog(null,"Ordem crescente"+numero2+" - "+numero1+" - "+numero3);  
          }else{
            JOptionPane.showMessageDialog(null,"Ordem crescente"+numero2+" - "+numero3+" - "+numero1);  
          }
       }else if(numero1 <=numero3){
            JOptionPane.showMessageDialog(null,"Ordem crescente"+numero3+" - "+numero1+" - "+numero2); 
       }else{
            JOptionPane.showMessageDialog(null,"Ordem crescente"+numero3+" - "+numero2+" - "+numero1); 
       }

    }

}    
