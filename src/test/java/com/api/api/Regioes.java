package com.api.api;

import java.util.*;

import com.api.api.Lista.UF;

public class Regioes {
    private static final Map<String, List<UF>> regioes = new HashMap<>();

    static {
        regioes.put("Norte", Arrays.asList(UF.AC, UF.AP, UF.AM, UF.PA, UF.RO, UF.RR, UF.TO));
        regioes.put("Nordeste", Arrays.asList(UF.AL, UF.BA, UF.CE, UF.MA, UF.PB, UF.PE, UF.PI, UF.RN, UF.SE));
        regioes.put("Centro-Oeste", Arrays.asList(UF.DF, UF.GO, UF.MT, UF.MS));
        regioes.put("Sudeste", Arrays.asList(UF.ES, UF.MG, UF.RJ, UF.SP));
        regioes.put("Sul", Arrays.asList(UF.PR, UF.RS, UF.SC));
    }

    public static void imprimirEstadosPorRegiao() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a região (Norte, Nordeste, Centro-Oeste, Sudeste, Sul): ");
        String regiao = scanner.nextLine();

        List<UF> estados = regioes.get(regiao);
        if (estados != null) {
            System.out.println("Os estados da região " + regiao + " são:");
            for (UF uf : estados) {
                System.out.println(uf.getNome());
            }
        } else {
            System.out.println("Região inválida. Por favor, tente novamente.");
        }
    }
}