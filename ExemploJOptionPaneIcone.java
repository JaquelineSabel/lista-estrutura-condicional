import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ExemploJOptionPaneIcone{

    public static void main(String[] args){

        JOptionPane.showMessageDialog(null, "olá mundo" , 
        " Sistema da Vovó", JOptionPane.WARNING_MESSAGE,
           new ImageIcon(
               ExemploJOptionPaneIcone.class.getResource
                ("/imagens/coffee-cup.png")
           )
        );
    }
}