import javax.swing.JOptionPane;

public class atividade5{

    public static void main(String[] args){

        
        String nome = JOptionPane.showInputDialog("Digite o nome do carro");
        double valorCarro = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do carro"));
        double valorParcela = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da parcela"));
        int quantidadeParcela = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de parcela"));
        double valorTotalFinanciamento = valorParcela * quantidadeParcela;
        double diferenca = valorTotalFinanciamento - valorCarro;


        JOptionPane.showMessageDialog(null,
                                           "nome:" + nome +
                                           "\nValor carro:" + valorCarro + 
                                           "\nValor parcela:" + valorParcela + 
                                           "\nQuantidade parcela:" + quantidadeParcela +
                                           "\nValor total financiamento:" + valorTotalFinanciamento + 
                                           "\nDiferenca:" + diferenca );




    }



}