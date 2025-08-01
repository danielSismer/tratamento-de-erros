package weg.sistema04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean valido = false;
        int opcao = 0;

        do {
            System.out.println("============== Sismer Academy ==============\n 1- Cadastrar Pessoa\n 2- Pesquisar Pessoa\n 3- Editar Pessoa\n 4- Deletar Pessoa\n 5- Sair\n");
            System.out.print("Sua Escolha:");
            String texto = input.nextLine();
            try {

                opcao = Integer.parseInt(texto);

                switch (opcao) {
                    case 1 -> { System.out.println("Cadastrar Pessoa!"); valido = true;}
                    case 2 -> {System.out.println("Pesquisar Pessoa!"); valido = true; }
                    case 3 -> { System.out.println("Editar Pessoa!"); valido = true;}
                    case 4 -> { System.out.println("Deletar Pessoa"); valido = true;}
                    case 5 -> { System.out.println("Saindo..."); valido = true;}
                    default -> {  System.out.println("Opção inválida!!! Favor, escolha uma das opções do menu. "); }
                }
            } catch (NumberFormatException e) {  System.err.println("Tipo de entrada Inválida. Favor, tente novamente."); }

        } while (!valido);
    }
}
