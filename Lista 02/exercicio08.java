import javax.swing.JOptionPane;


public class exercicio08{
    public static void main(String[] args){
        
        String pedido1 = JOptionPane.showInputDialog(null,  "NOME                                                       VALOR"+
                                                            "\nBolo Brigadeiro...........................................R$ 29.50"+  
                                                            "\nBolo Floresta Negra.......................................R$ 2.00"+ 
                                                            "\nBolo Leite com Nutella....................................R$ 29.23"+
                                                            "\nBolo Mousse de Chocolate..................................R$ 7.10"+
                                                            "\nBolos Nega Maluca.........................................R$ 19.33"+ 
                                                            "\nDoces Bomba de creme......................................R$ 17.71"+ 
                                                            "\nDoces Bomba de Morango....................................R$ 4.82"+
                                                            "\nSanduíches Filé-Mignon com fritas e cheddar...............R$ 21.16"+
                                                            "\nSanduíches Hamburguer com queijo, champignon e rúcula.....R$ 12.70"+ 
                                                            "\nSanduíches Provolone com salame ..........................R$ 19.70"+
                                                            "\nSanduíches Vegetariano de beringela.......................R$ 28,22"+
                                                            "\nPizza Calabresa...........................................R$ 8.96"+ 
                                                            "\nPizza Napolitana..........................................R$ 0.42"+
                                                            "\nPizza Peruana.............................................R$ 18.36"+ 
                                                            "\nPizza Portuguesa..........................................R$ 27.50"+
                                                            "\nInfome o seu pedido1: ");
        String pedido2 = JOptionPane.showInputDialog(null,    "NOME                                                       VALOR"+
                                                            "\nBolo Brigadeiro...........................................R$ 29.50"+  
                                                            "\nBolo Floresta Negra.......................................R$ 2.00"+ 
                                                            "\nBolo Leite com Nutella....................................R$ 29.23"+
                                                            "\nBolo Mousse de Chocolate..................................R$ 7.10"+
                                                            "\nBolos Nega Maluca.........................................R$ 19.33"+ 
                                                            "\nDoces Bomba de creme......................................R$ 17.71"+ 
                                                            "\nDoces Bomba de Morango....................................R$ 4.82"+
                                                            "\nSanduíches Filé-Mignon com fritas e cheddar...............R$ 21.16"+
                                                            "\nSanduíches Hamburguer com queijo, champignon e rúcula.....R$ 12.70"+ 
                                                            "\nSanduíches Provolone com salame ..........................R$ 19.70"+
                                                            "\nSanduíches Vegetariano de beringela.......................R$ 28,22"+
                                                            "\nPizza Calabresa...........................................R$ 8.96"+ 
                                                            "\nPizza Napolitana..........................................R$ 0.42"+
                                                            "\nPizza Peruana.............................................R$ 18.36"+ 
                                                            "\nPizza Portuguesa..........................................R$ 27.50"+
                                                            "\nInfome o seu pedido2: ");

        String pedido3 = JOptionPane.showInputDialog(null,   "NOME                                                       VALOR"+
                                                           "\nBolo Brigadeiro...........................................R$ 29.50"+  
                                                           "\nBolo Floresta Negra.......................................R$ 2.00"+ 
                                                           "\nBolo Leite com Nutella....................................R$ 29.23"+
                                                           "\nBolo Mousse de Chocolate..................................R$ 7.10"+
                                                           "\nNega Maluca...............................................R$ 19.33"+ 
                                                           "\nDoces Bomba de creme......................................R$ 17.71"+ 
                                                           "\nDoces Bomba de Morango....................................R$ 4.82"+
                                                           "\nSanduíches Filé-Mignon com fritas e cheddar...............R$ 21.16"+
                                                           "\nSanduíches Hamburguer com queijo, champignon e rúcula.....R$ 12.70"+ 
                                                           "\nSanduíches Provolone com salame ..........................R$ 19.70"+
                                                           "\nSanduíches Vegetariano de beringela.......................R$ 28,22"+
                                                           "\nPizza Calabresa...........................................R$ 8.96"+ 
                                                           "\nPizza Napolitana..........................................R$ 0.42"+
                                                           "\nPizza Peruana.............................................R$ 18.36"+ 
                                                           "\nPizza Portuguesa..........................................R$ 27.50"+
                                                           "\nInfome o seu pedido3: ");
        String pedidoCliente = "";
        double total = 0;

        if(pedido1.equalsIgnoreCase("Bolo Brigadeiro")){
            pedidoCliente = pedidoCliente + "Bolo Brigadeiro ----- Valor R$ 29,50 \n";
            total = total + 29.50;
        } 
        if(pedido1.equalsIgnoreCase("Bolo Floresta Negra")){
            pedidoCliente = pedidoCliente + "Bolo Floresta Negra ----- Valor R$ 2,00 \n";
            total = total + 2.00;
        } 
        if(pedido1.equalsIgnoreCase("Bolo Leite com Nutella")){
            pedidoCliente = pedidoCliente + "Bolo leite com Nutella ----- Valor R$ 29,23 \n";
            total = total + 29.23;
        } 
        if(pedido1.equalsIgnoreCase("Bolo Mousse de Chocolate")){
            pedidoCliente = pedidoCliente + "Mousse de Chocolate ----- Valor R$ 7,10 \n";
            total = total + 7.10;
        } 
        if(pedido1.equalsIgnoreCase("Nega Maluca")){
            pedidoCliente = pedidoCliente + "Nega Maluca ----- Valor R$ 19,33 \n";
            total = total + 19.33;
        } 
        if(pedido1.equalsIgnoreCase("Doces Bomba de Creme")){
            pedidoCliente = pedidoCliente + "Bomba de Creme ----- Valor R$ 17,71 \n";
            total = total + 17.71;
        } 
        if(pedido1.equalsIgnoreCase("Doces Bomba de Morango")){
            pedidoCliente = pedidoCliente + "Bomba de Morando ----- Valor R$ 4,82 \n";
            total = total + 4.82;
        } 
        if(pedido1.equalsIgnoreCase("Sanduíches Filé-Mignon com fritas e cheddar")){
            pedidoCliente = pedidoCliente + "Sanduíches Filé-Mignon com fritas e cheddar ----- Valor R$ 21,16 \n";
            total = total + 21.16;
        } 
        if(pedido1.equalsIgnoreCase("Sanduíche Hambúrguer com queijos, champignon e rucúla")){
            pedidoCliente = pedidoCliente + "Sanduíche Hambúrguer com queijos, champignon e rucúla ----- Valor R$ 12,70 \n";
            total = total + 12.70;
        } 
        if(pedido1.equalsIgnoreCase("Sanduíches Provolone com salame")){
            pedidoCliente = pedidoCliente + "Sanduíches Provolone com salame ----- Valor R$ 19,70 \n";
            total = total + 19.70;
        } 
        if(pedido1.equalsIgnoreCase("Sanduíches Vegetariano de berinjela")){
            pedidoCliente = pedidoCliente + "Sanduíches Vegetariano de berinjela ----- Valor R$ 28,22\n";
            total = total + 28.22;
        } 
        if(pedido1.equalsIgnoreCase("Pizza Calabresa")){
            pedidoCliente = pedidoCliente + "Pizza Calabresa ----- Valor R$ 8,98 \n";
            total = total + 8.98;
        } 
        if(pedido1.equalsIgnoreCase("Pizza Napolitana")){
            pedidoCliente = pedidoCliente + "Pizza Napolitana ----- Valor R$ 0,42 \n";
            total = total + 0.42;
        } 
        if(pedido1.equalsIgnoreCase("Pizza Peruana")){
            pedidoCliente = pedidoCliente + "Pizza Peruana ----- Valor R$ 18,36 \n";
            total = total + 18.36;
        } 
        if(pedido1.equalsIgnoreCase("Pizza Portuguesa")){
            pedidoCliente = pedidoCliente + "Pizza Portuguesa ----- Valor R$ 27,50 \n";
            total = total + 27.50;
        } 


        if(pedido2.equalsIgnoreCase("Bolo Brigadeiro")){
            pedidoCliente = pedidoCliente + "Bolo Brigadeiro ----- Valor R$ 29,50 \n";
            total = total + 29.50;
        } 
        if(pedido2.equalsIgnoreCase("Bolo Floresta Negra")){
            pedidoCliente = pedidoCliente + "Bolo Floresta Negra ----- Valor R$ 2,00 \n";
            total = total + 2.00;
        } 
        if(pedido2.equalsIgnoreCase("Bolo Leite com Nutella")){
            pedidoCliente = pedidoCliente + "Bolo leite com Nutella ----- Valor R$ 29,23 \n";
            total = total + 29.23;
        } 
        if(pedido2.equalsIgnoreCase("Bolo Mousse de Chocolate")){
            pedidoCliente = pedidoCliente + "Mousse de Chocolate ----- Valor R$ 7,10 \n";
            total = total + 7.10;
        } 
        if(pedido2.equalsIgnoreCase("Nega Maluca")){
            pedidoCliente = pedidoCliente + "Nega Maluca ----- Valor R$ 19,33 \n";
            total = total + 19.33;
        } 
        if(pedido2.equalsIgnoreCase("Doces Bomba de Creme")){
            pedidoCliente = pedidoCliente + "Bomba de Creme ----- Valor R$ 17,71 \n";
            total = total + 17.71;
        } 
        if(pedido2.equalsIgnoreCase("Doces Bomba de Morango")){
            pedidoCliente = pedidoCliente + "Bomba de Morando ----- Valor R$ 4,82 \n";
            total = total + 4.82;
        } 
        if(pedido2.equalsIgnoreCase("Sanduíches Filé-Mignon com fritas e cheddar")){
            pedidoCliente = pedidoCliente + "Sanduíches Filé-Mignon com fritas e cheddar ----- Valor R$ 21,16 \n";
            total = total + 21.16;
        } 
        if(pedido2.equalsIgnoreCase("Sanduíche Hambúrguer com queijos, champignon e rucúla")){
            pedidoCliente = pedidoCliente + "Sanduíche Hambúrguer com queijos, champignon e rucúla ----- Valor R$ 12,70 \n";
            total = total + 12.70;
        } 
        if(pedido2.equalsIgnoreCase("Sanduíches Provolone com salame")){
            pedidoCliente = pedidoCliente + "Sanduíches Provolone com salame ----- Valor R$ 19,70 \n";
            total = total + 19.70;
        } 
        if(pedido2.equalsIgnoreCase("Sanduíches Vegetariano de berinjela")){
            pedidoCliente = pedidoCliente + "Sanduíches Vegetariano de berinjela ----- Valor R$ 28,22\n";
            total = total + 28.22;
        } 
        if(pedido2.equalsIgnoreCase("Pizza Calabresa")){
            pedidoCliente = pedidoCliente + "Pizza Calabresa ----- Valor R$ 8,98 \n";
            total = total + 8.98;
        } 
        if(pedido2.equalsIgnoreCase("Pizza Napolitana")){
            pedidoCliente = pedidoCliente + "Pizza Napolitana ----- Valor R$ 0,42 \n";
            total = total + 0.42;
        } 
        if(pedido2.equalsIgnoreCase("Pizza Peruana")){
            pedidoCliente = pedidoCliente + "Pizza Peruana ----- Valor R$ 18,36 \n";
            total = total + 18.36;
        } 
        if(pedido2.equalsIgnoreCase("Pizza Portuguesa")){
            pedidoCliente = pedidoCliente + "Pizza Portuguesa ----- Valor R$ 27,50 \n";
            total = total + 27.50;
        } 


        if(pedido3.equalsIgnoreCase("Bolo Brigadeiro")){
            pedidoCliente = pedidoCliente + "Bolo Brigadeiro ----- Valor R$ 29,50 \n";
            total = total + 29.50;
        } 
        if(pedido3.equalsIgnoreCase("Bolo Floresta Negra")){
            pedidoCliente = pedidoCliente + "Bolo Floresta Negra ----- Valor R$ 2,00 \n";
            total = total + 2.00;
        } 
        if(pedido3.equalsIgnoreCase("Bolo Leite com Nutella")){
            pedidoCliente = pedidoCliente + "Bolo leite com Nutella ----- Valor R$ 29,23 \n";
            total = total + 29.23;
        } 
        if(pedido3.equalsIgnoreCase("Bolo Mousse de Chocolate")){
            pedidoCliente = pedidoCliente + "Mousse de Chocolate ----- Valor R$ 7,10 \n";
            total = total + 7.10;
        } 
        if(pedido3.equalsIgnoreCase("Nega Maluca")){
            pedidoCliente = pedidoCliente + "Nega Maluca ----- Valor R$ 19,33 \n";
            total = total + 19.33;
        } 
        if(pedido3.equalsIgnoreCase("Doces Bomba de Creme")){
            pedidoCliente = pedidoCliente + "Bomba de Creme ----- Valor R$ 17,71 \n";
            total = total + 17.71;
        } 
        if(pedido3.equalsIgnoreCase("Doces Bomba de Morango")){
            pedidoCliente = pedidoCliente + "Bomba de Morando ----- Valor R$ 4,82 \n";
            total = total + 4.82;
        } 
        if(pedido3.equalsIgnoreCase("Sanduíches Filé-Mignon com fritas e cheddar")){
            pedidoCliente = pedidoCliente + "Sanduíches Filé-Mignon com fritas e cheddar ----- Valor R$ 21,16 \n";
            total = total + 21.16;
        } 
        if(pedido3.equalsIgnoreCase("Sanduíche Hambúrguer com queijos, champignon e rucúla")){
            pedidoCliente = pedidoCliente + "Sanduíche Hambúrguer com queijos, champignon e rucúla ----- Valor R$ 12,70 \n";
            total = total + 12.70;
        } 
        if(pedido3.equalsIgnoreCase("Sanduíches Provolone com salame")){
            pedidoCliente = pedidoCliente + "Sanduíches Provolone com salame ----- Valor R$ 19,70 \n";
            total = total + 19.70;
        } 
        if(pedido3.equalsIgnoreCase("Sanduíches Vegetariano de berinjela")){
            pedidoCliente = pedidoCliente + "Sanduíches Vegetariano de berinjela ----- Valor R$ 28,22\n";
            total = total + 28.22;
        } 
        if(pedido3.equalsIgnoreCase("Pizza Calabresa")){
            pedidoCliente = pedidoCliente + "Pizza Calabresa ----- Valor R$ 8,98 \n";
            total = total + 8.98;
        } 
        if(pedido3.equalsIgnoreCase("Pizza Napolitana")){
            pedidoCliente = pedidoCliente + "Pizza Napolitana ----- Valor R$ 0,42 \n";
            total = total + 0.42;
        } 
        if(pedido3.equalsIgnoreCase("Pizza Peruana")){
            pedidoCliente = pedidoCliente + "Pizza Peruana ----- Valor R$ 18,36 \n";
            total = total + 18.36;
        } 
        if(pedido3.equalsIgnoreCase("Pizza Portuguesa")){
            pedidoCliente = pedidoCliente + "Pizza Portuguesa ----- Valor R$ 27,50 \n";
            total = total + 27.50;
        }         

        JOptionPane.showMessageDialog(null, "Pedido Cliente: \n" + pedidoCliente + 
                                            "Valor Total do Pedido: " + total);
    }

}        
