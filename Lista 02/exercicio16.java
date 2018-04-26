import javax.swing.JOptionPane;
public class exercicio16{
    public static void main(String[] args){

        double temperatura = Double.parseDouble(JOptionPane.showInputDialog(null," Informe a temperatura desejada "));
        String origem = JOptionPane.showInputDialog(null," Informe a origem desejada");
        String destino = JOptionPane.showInputDialog(null," Informe o destino desejado");
        
        if(origem.equalsIgnoreCase("Celsius") && destino.equalsIgnoreCase("Fahrenheit")){
            JOptionPane.showMessageDialog(null,( 1.8 * temperatura) + 32);
        }else if(origem.equalsIgnoreCase("Celsius") && destino.equalsIgnoreCase("Kelvin")){
            JOptionPane.showMessageDialog(null,( temperatura + 273));
        }else if(origem.equalsIgnoreCase("Fahrenheit") && destino.equalsIgnoreCase("Celsius")){
            JOptionPane.showMessageDialog(null,( temperatura - 32 / 1.8));
        }else if(origem.equalsIgnoreCase("Fahrenheit") && destino.equalsIgnoreCase("Kelvin")){
            JOptionPane.showMessageDialog(null,(temperatura - 32 / 9));
        }else if(origem.equalsIgnoreCase("Kelvin") && destino.equalsIgnoreCase("Celsius")){
            JOptionPane.showMessageDialog(null,( temperatura - 273));
        }else if(origem.equalsIgnoreCase("Kelvin") && destino.equalsIgnoreCase("Fahrenheit")){
            JOptionPane.showMessageDialog(null, (temperatura - 273/ 5));
        }

    }

}