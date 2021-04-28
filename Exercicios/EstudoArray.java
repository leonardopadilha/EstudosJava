
import java.util.Scanner;

public class EstudoArray {
    public static void main(String[] args) {

        int totalPessoas, idade, qtdConvidados = 0, naoVao = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a quantidade total de pessoas: ");
        totalPessoas = entrada.nextInt();

        int[] numeros = new int[totalPessoas];
        for (int convidados : numeros){
            System.out.print("Digite a idade: ");
            idade = entrada.nextInt();
                if(idade > 18){
                    qtdConvidados += 1;
                }else {
                    naoVao += 1;
                }
        }System.out.println("Podem ir a festa: " + qtdConvidados + "\n Não podem ir: " + naoVao);
    }
}
