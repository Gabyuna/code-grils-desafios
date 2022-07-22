package br.com.dio.basecamp;

//Lógica pessoal
public class Mensagem {

    public static void hora(int h){

        if (h < 1 || h < 5){

            System.out.println("Bom dia!");
        }
        else if (h < 6 || h < 12){

            System.out.println("Bom dia!");
        }
        else if (h < 13 || h < 18){

            System.out.println("Boa tarde!");
        }
        else if (h < 19 || h < 23){

            System.out.println("Boa noite!");
        }
    }
}
