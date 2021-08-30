package aula.teste;

import java.util.Scanner;

public class Notas {

    public String nome;
    public double nota[] = {0, 0, 0};

    Scanner sc = new Scanner(System.in);

    public double calculaNotaFinal() {
        return nota[0] + nota[1] + nota[2];
    }

    public void entraNotas(){
        for(int i=0; i<3; ++i){
            System.out.print("Entre com a nota do " + (i + 1) + " trimestre: ");
            nota[i] = sc.nextDouble();

            while (0 == i && nota[i] > 30) {
                System.out.print("A nota não deve ser maior que 30, entre novamente: ");
                nota[i] = sc.nextDouble();
            }

            while (i > 0 && nota[i] > 35) {
                System.out.print("A nota não deve ser maior que 35, entre novamente: ");
                nota[i] = sc.nextDouble();
            }
        }
    }

    public void exibeNotas() {
        for (int i = 0; i < 3; ++i) {
            System.out.println("Nota do " + i + " trimestre: " + nota[i]);
        }
    }

    public double pontosFaltando(){
        if(calculaNotaFinal() < 60){
            return 60 - calculaNotaFinal();
        } else {
            return 0;
        }
    }

    public void resultado(){
        if (calculaNotaFinal() < 60) {
            System.out.println("REPROVADO");
            System.out.printf("Faltando %.2f pontos%n", pontosFaltando());
        }else{
            System.out.println("APROVADO");
        }
    }
}
