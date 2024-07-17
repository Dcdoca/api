package com.api.api;

import java.util.Scanner;

import com.api.api.Lista.UF;

public class EscolherUF {
    public static void escolherUF() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escolha uma UF (sigla): ");
        String sigla = scanner.next().toUpperCase();

        try {
            UF uf = UF.valueOf(sigla);
            System.out.println("O nome por extenso da UF " + sigla + " é " + uf.getNome() + ".");
        } catch (IllegalArgumentException e) {
            System.out.println("UF inválida. Por favor, tente novamente.");
        }
    }
}
