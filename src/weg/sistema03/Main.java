package weg.sistema03;

import java.util.Scanner;

public class Main {

    public static void main (String [] args ){

        Scanner input = new Scanner(System.in);

        double preco;
        boolean numeroValido = false;

        System.out.print("Insira o Nome do Produto: ");
        String nome = input.nextLine();

        while (!numeroValido){

            System.out.print("Insira o Preço do Produto: ");
            String texto = input.nextLine();

            try{
                preco = Double.parseDouble(texto);
                numeroValido = true;
            } catch(NumberFormatException e ) {
                System.out.println("Entrada Inválida. Favor, insira o preço do produto novamente");
            }

        }
    }
}
