import javax.swing.JOptionPane;


public class Exercicio09{
    public static void main(String[] args){

    

        String produto01 = JOptionPane.showInputDialog(
        "Bolos          | Bolo Brigadeiro                           | 29.50"+
        "\n Bolos       | Bolo Floresta Negra                       | 2.00"+
        "\n Bolos       | Bolo leite com Nutella                    | 29.23"+
        "\n Bolos       | Bolo Mousse de chocolate                  | 7.10"+
        "\n Bolos       | Bolo Nega maluca                          | 19.33"+
        "\n Doces       | Bomba de creme                            | 17.71"+
        "\n Doces       | Bomba de morango                          | 4.82"+
        "\n Sanduiches  | File mignon com fritas e cheddar          | 21.16"+
        "\n Sanduiches  | Hambuguer com queijos champignon e rucula | 12.70"+
        "\n Sanduiches  | Provolone com salame                      | 19.70"+
        "\n Sanduiches  | Vegetariano e berinjela                   | 28.22"+
        "\n Pizzas      | Calabresa                                 | 8.98"+
        "\n Pizzas      | Napolitana                                | 0.98"+
        "\n Pizzas      | Peruana                                   | 18.36"+
        "\n Pizzas      | Portuguesa                                | 27.50" );


        double preco01 = 0;
        if(produto01.equalsIgnoreCase("Bolo Brigadeiro")){
            preco01 = 29.50;
        }else if(produto01.equalsIgnoreCase("Bolo Floresta Negra")){
            preco01 = 2.00;
        }else if(produto01.equalsIgnoreCase("Bolo leite com Nutella")){
            preco01 = 29.23;
        }else if(produto01.equalsIgnoreCase("Bolo Mousse de chocolate")){
            preco01 = 7.10;
        }else if(produto01.equalsIgnoreCase("Bolo Nega maluca")){
            preco01 = 19.33;
        }else if(produto01.equalsIgnoreCase("Bomba de creme")){
            preco01 = 17.71;
        }else if(produto01.equalsIgnoreCase("Bomba de morango")){
            preco01 = 4.82;    
        }else if(produto01.equalsIgnoreCase("File mignon com fritas e cheddar")){
            preco01 = 21.16;
        }else if(produto01.equalsIgnoreCase("Hambuguer com queijos champignon e rucula")){
            preco01 = 12.70;
        }else if(produto01.equalsIgnoreCase("Provolone com salame")){
            preco01 = 19.70;
        }else if(produto01.equalsIgnoreCase("Vegetariano e berinjela")){
            preco01 = 28.22;
        }else if(produto01.equalsIgnoreCase("Calabresa")){
            preco01 = 8.98;
        }else if(produto01.equalsIgnoreCase("Napolitana")){
            preco01 = 0.98;
        }else if(produto01.equalsIgnoreCase("Peruana")){
            preco01 = 18.36;
        }else if(produto01.equalsIgnoreCase("Portuguesa")){
            preco01 = 27.50;
        }

        String produto02 = JOptionPane.showInputDialog(
            "Bolos          | Bolo Brigadeiro                           | 29.50"+
            "\n Bolos       | Bolo Floresta Negra                       | 2.00"+
            "\n Bolos       | Bolo leite com Nutella                    | 29.23"+
            "\n Bolos       | Bolo Mousse de chocolate                  | 7.10"+
            "\n Bolos       | Bolo Nega maluca                          | 19.33"+
            "\n Doces       | Bomba de creme                            | 17.71"+
            "\n Doces       | Bomba de morango                          | 4.82"+
            "\n Sanduiches  | File mignon com fritas e cheddar          | 21.16"+
            "\n Sanduiches  | Hambuguer com queijos champignon e rucula | 12.70"+
            "\n Sanduiches  | Provolone com salame                      | 19.70"+
            "\n Sanduiches  | Vegetariano e berinjela                   | 28.22"+
            "\n Pizzas      | Calabresa                                 | 8.98"+
            "\n Pizzas      | Napolitana                                | 0.98"+
            "\n Pizzas      | Peruana                                   | 18.36"+
            "\n Pizzas      | Portuguesa                                | 27.50" );

        double preco02 = 0;
        if(produto02.equalsIgnoreCase("Bolo Brigadeiro")){
            preco02 = 29.50;
        }else if(produto02.equalsIgnoreCase("Bolo Floresta Negra")){
            preco02 = 2.00;
        }else if(produto02.equalsIgnoreCase("Bolo leite com Nutella")){
            preco02 = 29.23;
        }else if(produto02.equalsIgnoreCase("Bolo Mousse de chocolate")){
            preco02 = 7.10;
        }else if(produto02.equalsIgnoreCase("Bolo Nega maluca")){
            preco02 = 19.33;
        }else if(produto02.equalsIgnoreCase("Bomba de creme")){
            preco02 = 17.71;
        }else if(produto02.equalsIgnoreCase("Bomba de morango")){
            preco02 = 4.82;    
        }else if(produto02.equalsIgnoreCase("File mignon com fritas e cheddar")){
            preco02 = 21.16;
        }else if(produto02.equalsIgnoreCase("Hambuguer com queijos champignon e rucula")){
            preco02 = 12.70;
        }else if(produto02.equalsIgnoreCase("Provolone com salame")){
            preco02 = 19.70;
        }else if(produto02.equalsIgnoreCase("Vegetariano e berinjela")){
            preco02 = 28.22;
        }else if(produto02.equalsIgnoreCase("Calabresa")){
            preco02 = 8.98;
        }else if(produto02.equalsIgnoreCase("Napolitana")){
            preco02 = 0.98;
        }else if(produto02.equalsIgnoreCase("Peruana")){
            preco02 = 18.36;
        }else if(produto02.equalsIgnoreCase("Portuguesa")){
            preco02 = 27.50;
        }

        String produto03 = JOptionPane.showInputDialog(
            "Bolos          | Bolo Brigadeiro                           | 29.50"+
            "\n Bolos       | Bolo Floresta Negra                       | 2.00"+
            "\n Bolos       | Bolo leite com Nutella                    | 29.23"+
            "\n Bolos       | Bolo Mousse de chocolate                  | 7.10"+
            "\n Bolos       | Bolo Nega maluca                          | 19.33"+
            "\n Doces       | Bomba de creme                            | 17.71"+
            "\n Doces       | Bomba de morango                          | 4.82"+
            "\n Sanduiches  | File mignon com fritas e cheddar          | 21.16"+
            "\n Sanduiches  | Hambuguer com queijos champignon e rucula | 12.70"+
            "\n Sanduiches  | Provolone com salame                      | 19.70"+
            "\n Sanduiches  | Vegetariano e berinjela                   | 28.22"+
            "\n Pizzas      | Calabresa                                 | 8.98"+
            "\n Pizzas      | Napolitana                                | 0.98"+
            "\n Pizzas      | Peruana                                   | 18.36"+
            "\n Pizzas      | Portuguesa                                | 27.50" );

        double preco03 = 0;
        if(produto03.equalsIgnoreCase("Bolo Brigadeiro")){
            preco03 = 29.50;
        }else if(produto03.equalsIgnoreCase("Bolo Floresta Negra")){
            preco03 = 2.00;
        }else if(produto03.equalsIgnoreCase("Bolo leite com Nutella")){
            preco03 = 29.23;
        }else if(produto03.equalsIgnoreCase("Bolo Mousse de chocolate")){
            preco03 = 7.10;
        }else if(produto03.equalsIgnoreCase("Bolo Nega maluca")){
            preco03 = 19.33;
        }else if(produto03.equalsIgnoreCase("Bomba de creme")){
            preco03 = 17.71;
        }else if(produto03.equalsIgnoreCase("Bomba de morango")){
            preco03 = 4.82;    
        }else if(produto03.equalsIgnoreCase("File mignon com fritas e cheddar")){
            preco03 = 21.16;
        }else if(produto03.equalsIgnoreCase("Hambuguer com queijos champignon e rucula")){
            preco03 = 12.70;
        }else if(produto03.equalsIgnoreCase("Provolone com salame")){
            preco03 = 19.70;
        }else if(produto03.equalsIgnoreCase("Vegetariano e berinjela")){
            preco03 = 28.22;
        }else if(produto03.equalsIgnoreCase("Calabresa")){
            preco03 = 8.98;
        }else if(produto03.equalsIgnoreCase("Napolitana")){
            preco03 = 0.98;
        }else if(produto03.equalsIgnoreCase("Peruana")){
            preco03 = 18.36;
        }else if(produto03.equalsIgnoreCase("Portuguesa")){
            preco03 = 27.50;
        }

        double total = preco01 + preco02 + preco03;
            JOptionPane.showMessageDialog(null, 
            produto01 + " = " + preco01+ 
            "\n" + produto02 + " = " + preco02+
            "\n" + produto03 + " = " + preco03+
            "\n" + "Total é: " + total);


    }
}