package weg.sistema02;

import java.util.Scanner;

public class Main {

    public static void main (String [] args ) {

        Scanner input = new Scanner(System.in);
        int parcela01 = 0;
        int parcela02 = 0;
        boolean validado = false;

        while(!validado){
            System.out.print("Insira o 1º número: ");
            String textoParcela01 = input.nextLine();
            System.out.print("Insira o 2º número: ");
            String textoParcela02 = input.nextLine();
            try{
                parcela01 = Integer.parseInt(textoParcela01);
                parcela02 = Integer.parseInt(textoParcela02);
                int soma = parcela01 + parcela02;
                System.out.print("O resultado da soma dos número é: " + soma);
                validado = true;
            } catch (NumberFormatException e ) {
                System.out.println("Número Inválido! Tente novamente. ");
            }
        }
    }
}
