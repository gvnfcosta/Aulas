/*********************************************************************
 * Este programa recebe a cotação do dólar do dia, quantos dólares o
 *  usuário quer comprar e calcula o valor em reais levando em conta
 *  a IOF de 6% acrescida ao valor final.
 *  Exercício de classe estática.
 *********************************************************************/


package aula.teste;

import java.util.Locale;
import java.util.Scanner;

public class Cotacao {

    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual a cotação do dolar hoje? ");
        double cotacao = entrada.nextDouble();

        System.out.print("Quantos dolares você quer comprar? ");
        double dolares = entrada.nextDouble();

        double valor = Converter.quantidadeReais(cotacao, dolares);

        System.out.print("Quantidade a ser paga em Reais = " + valor);

        entrada.close();
    }

}
