package com.api.api;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Escolher uma UF e imprimir o nome por extenso");
            System.out.println("2. Informar a região e imprimir os estados daquela região");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            String opcao = scanner.next();

            switch (opcao) {
                case "1":
                    EscolherUF.escolherUF();
                    break;
                case "2":
                    Regioes.imprimirEstadosPorRegiao();
                    break;
                case "3":
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        }
    }
}
