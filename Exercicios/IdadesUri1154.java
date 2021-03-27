package DesafioProgramacaoTest;
import java.util.Scanner;

public class IdadesUri1154 {
    public static void main(String[] args) {

        int count = 0;
        double numeros;
        double idade = 0;
        double result;

        Scanner leitor = new Scanner(System.in);

        do {
            numeros = leitor.nextInt();
            if (numeros >= 0){
                idade += numeros;
                count ++;
            }
        }while (numeros >= 0);

        result = idade / count;
        System.out.println(String.format("%.2f", result));
    }
}
