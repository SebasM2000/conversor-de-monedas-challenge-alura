package com.aluracursos.calculos;

import java.util.Objects;

public class ConversionMoneda {
    public static void conversor (String tipoMonedaAConvertir,
                                  String tipoMonedaConvertida,
                                  float saldo,
                                  Double valorMoneda){
        double valorFinal = saldo * valorMoneda;

        if (Objects.equals(tipoMonedaAConvertir, "")) {
            System.out.println("Programa finalizado");
        } else {
            System.out.println("El valor de " + String.format("%.2f", saldo) + " [" + tipoMonedaAConvertir + "] "
                    + "corresponde al valor final de " + String.format("%.2f", valorFinal)
                    + " [" + tipoMonedaConvertida + "]\n");
        }
    }
}