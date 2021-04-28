package DesafioProgramacaoTest;

import javax.swing.*;

public class ParOuImpar {

    public static void main(String[] args) {

        int numTotal, num1;
        int count = 0;

        numTotal = Integer.parseInt(JOptionPane.showInputDialog("Digite o número total: "));

        while (count < numTotal) {
            num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
            if (num1 > 0) {
                if (num1 % 2 != 0) {
                    System.out.println("ÍMPAR POSTIVOS");
                } else {
                    System.out.println("PAR POSITIVO");
                }
            }else if (num1 == 0) {
                System.out.println("NULL");
            }else {
                if (num1 % 2 != 0) {
                    System.out.println("ÍMPAR NEGATIVO");
                } else if (num1 == (numTotal * -1)) {
                    System.out.println("MESMO NEGATIVO");
                } else {
                    System.out.println("PAR NEGATIVO");
                }
            }
            count++;
        }
    }
}
