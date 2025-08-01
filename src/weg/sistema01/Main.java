package weg.sistema01;

import java.util.Scanner;

public class Main {

    public static void main (String [] args ){

        Scanner input = new Scanner(System.in);
        int numero = 0;
        boolean entradaValida = false;

        while (!entradaValida){
            System.out.print("Insira um número:");
            String texto = input.nextLine();
            try{
                numero = Integer.parseInt(texto);
                entradaValida = true;
            } catch (NumberFormatException e){
                    System.out.println("Entrada Inválida! Tente novamente.");
            }
        }

    }
}
