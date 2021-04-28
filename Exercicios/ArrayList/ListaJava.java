package BootcampJava;

import java.util.ArrayList;

public class ListaJava {
    public static void main(String[] args) {
        ArrayList<String> carros = new ArrayList<String>();
        carros.add("Uno");
        carros.add("Gol");
        carros.add("Palio");

        System.out.println("Imprimindo o ArrayList");
        for (int i = 0; i < carros.size(); i++){
            System.out.println(carros.get(i));
        }

        System.out.println(" ");

        //removendo o elemento na posição 0
        carros.remove(0);


        System.out.println("Removendo elemento do ArrayList");
        for (int j = 0; j < carros.size(); j++){
            System.out.println(carros.get(j));
        }

        System.out.println(" ");

        //Inserindo elemento na posição desejada

        System.out.println("Inserindo elemento na posição desejada do ArrayList");
        carros.add(1, "Sandero");

        if (carros.contains("Gol")){
            System.out.println("Existe o elemento Gol no array");
        }else {
            System.out.println("Não existe o elemento Gol no array");
        }

        //Retorna o índice da primeira vez que o elemento aparece se não existir, ele retorna como -1
        int posicaoGol = carros.indexOf("Palio");
        System.out.println("O Palio está na posição " + posicaoGol);


        for (int k = 0; k < carros.size(); k++){
            System.out.println(carros.get(k));
        }
    }
}

