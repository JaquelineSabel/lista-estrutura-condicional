import javax.swing.JOptionPane;
public class exercicio11{
    public static void main(String[] args){

        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota"));
        double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota"));
        double nota5 = Double.parseDouble(JOptionPane.showInputDialog("digite a quinta nota"));
        double media = (nota1 + nota2 + nota3 + nota4 + nota5)/5;

    JOptionPane.showMessageDialog(null,
                                      "nota1:" + nota1 +
                                      "\nnota2:" + nota2 +
                                      "\nnota3:" + nota3 +
                                      "\nnota4:" + nota4 +
                                      "\nnota5:" + nota5 +
                                      "\nmedia:" + media);
                                      

        if(media <6 ){
           JOptionPane.showMessageDialog(null, " Reprovado");
        }else if(media <8){
            JOptionPane.showMessageDialog(null," Recuperação");
        }else{
            JOptionPane.showMessageDialog(null," Aprovado");
        }

    }

}        