package aula99;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a dimensão da matriz? ");
        int n = sc.nextInt();

        int[][] matriz = new int[n][n];

        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz.length; j++){
                System.out.print("Entre com um número: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Numeros diagonais");
        for (int i=0; i<matriz.length; i++){
            System.out.print(matriz[i][i] + " ");
        }

        System.out.println();
        System.out.println("Numeros negativos");
        int x = 0;
        for (int i=0; i<matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    System.out.print(matriz[i][j] + " ");
                    x++;
                }
            }
        }
        System.out.print("Total de números negativos: " + x);
        sc.close();
    }
}