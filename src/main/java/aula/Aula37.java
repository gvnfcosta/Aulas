package aula;
import java.util.Scanner;

public class Aula37 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String texto;

        // Solicita a entrada de uma palavra ou frase
        System.out.print("Insira seu texto: ");
        texto = input.nextLine();
        int szTexto = texto.length(); //szTexto = quantidade de caracteres do texto


        String[] y = new String[szTexto];
        for(int i=0, j = szTexto -1; i<szTexto; ++i, --j){ //atribui a um vetor cada caractere
                                                            // do texto de trás para frente
            char result = texto.charAt(j);
            y[i] = Character.toString(result);

        }

        texto = ""; //Limpa a string
        for (int i = 0; i < szTexto; i++){ //Refaz a string com o texto invertido
            texto = texto + y[i];
        }

        System.out.println("Como fica o texto ao contrário: " + texto);
    }
}


