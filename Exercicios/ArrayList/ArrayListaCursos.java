package BootcampJava.ArrayListTreinamento;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListaCursos {

    private ArrayList<String> cursos = new ArrayList<String>();
    private Scanner entrada = new Scanner(System.in);
    private String resposta;

    private String periodo(){
        System.out.print("Informe a data que pretende iniciar: ");
        String dataInicial = entrada.nextLine();

        System.out.print("Informe a data que pretende terminar: ");
        String dataFinal = entrada.nextLine();

        return dataInicial + " - " + dataFinal;
    }

    private String sairCadastro(){
        System.out.println("Deseja sair? ");
        return entrada.nextLine();
    }

    public void informarCurso(){
        do{
            System.out.print("Informe a área desejada: ");
            String areaCurso = entrada.nextLine();
            cursos.add(areaCurso);

            System.out.print("Informe o curso desejado: ");
            String curso = entrada.nextLine();
            cursos.add(curso);

            System.out.print("Periodo: " + periodo());
            System.out.println("\n" + cursos);

            resposta = sairCadastro();
        }while (!resposta.equals("sim"));
    }
}

