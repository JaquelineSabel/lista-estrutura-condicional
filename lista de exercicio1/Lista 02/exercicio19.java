import javax.swing.JOptionPane;
public class exercicio19{
    public static void main(String[] args){

        double saldo = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do seu saldo atual"));
        double deposito = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do seu depósito"));
        double parcelaEmprestimo = Double.parseDouble(JOptionPane.showInputDialog(null," Digite o valor da parcela do empréstimo"));
        double saque = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do seu saque"));
        double status = saldo + deposito - parcelaEmprestimo - saque;

        JOptionPane.showMessageDialog(null,
                                           "Saldo:" + saldo +
                                           "\nDepósito:" + deposito +
                                           "\nParcela Emprestimo:" + parcelaEmprestimo +
                                           "\nSaque:" + saque +
                                           "\nStatus:" + status );
        if(status == 0){
            JOptionPane.showMessageDialog(null,"Saldo Neutro");
        }else if(status > 0){
            JOptionPane.showMessageDialog(null,"Saldo Positivo");
        }else if(status < 0 ){
            JOptionPane.showMessageDialog(null,"Saldo Negativo");
        }                                   

    }

}        
        