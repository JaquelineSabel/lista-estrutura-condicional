import javax.swing.JOptionPane;
public class exercicio20{
    public static void main(String[] args){
        
       double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
       double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));
       double imc = (altura * altura) / peso;

        JOptionPane.showMessageDialog(null, "IMC" +
                                            "Até 9.99......................Desnutrição grau V:" +
                                            "\nDe 10 até 12.9................Desnutrição grau IV:" +
                                            "\nDe 13 até 15.9................Desnutrição grau III:" +
                                            "\nDe 16 até 16.9................Desnutrição grau II:" +
                                            "\nDe 17 até 18.4................Desnutrição grau I:" +
                                            "\nDe 18.5 até 24.9..............Normal:" +
                                            "\nDe 25 até 29.9................Pré-obesidade:" + 
                                            "\nDe 30 até 34.5................Obesidade grau I:" +
                                            "\nDe 35 até 39.9................Obesidade grau II:" +
                                            "\nMaior que 39.9................Obesidade grau III:" +
                                            "\nimc:" + imc);
        if(imc <9.99){
            JOptionPane.showMessageDialog(null,"Desnutrição grau V");
        } else if(imc >10 && < 12.9){
            JOptionPane.showMessageDialog(null,"Desnutrição grau IV");
        } else if(imc <15.9){
            JOptionPane.showMessageDialog(null,"Desnutrição grau III");
        } else if(imc <16.9){
            JOptionPane.showMessageDialog(null,"Desnutrição grau II");
        } else if(imc <18.4){
            JOptionPane.showMessageDialog(null,"Desnutrição grau I");
        } else if(imc <24.9){
            JOptionPane.showMessageDialog(null,"Normal");
        } else if(imc <29.9)
    }

}        
       
       