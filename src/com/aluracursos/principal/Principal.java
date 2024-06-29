package com.aluracursos.principal;

import com.aluracursos.calculos.ConsultaAPI;
import com.aluracursos.calculos.ConversionMoneda;
import com.aluracursos.calculos.Moneda;

import java.util.List;
import java.util.Scanner;

import static com.aluracursos.calculos.EntradaTexto.opcionesConversor;

public class Principal {
    public static void main(String[] args) {
        ConsultaAPI consulta = new ConsultaAPI();
        Scanner lectura = new Scanner(System.in);
        List<String> listaMonedas = List.of("USD", "ARS", "BRL", "COP");

        System.out.println("Sea bienvenido/a al conversor de monedas :)");

        int busqueda = 0;

        while (busqueda != 7) {
            opcionesConversor();

            busqueda = Integer.parseInt(lectura.nextLine());
            float saldo = 0;
            String monedaInicial = "";
            String monedaFinal = "";

            if (busqueda != 7) {
                System.out.println("Ingresa tu saldo: ");
                saldo = Float.parseFloat(lectura.nextLine());
            }

            Double tasa = 1.0;

            Moneda moneda;

            switch (busqueda) {
                case 1:
                    monedaInicial = listaMonedas.get(0);
                    monedaFinal = listaMonedas.get(1);
                    moneda = consulta.consultaMoneda(monedaInicial);
                    tasa = moneda.conversion_rates().get(monedaFinal);
                    break;
                case 2:
                    monedaInicial = listaMonedas.get(1);
                    monedaFinal = listaMonedas.get(0);
                    moneda = consulta.consultaMoneda(monedaInicial);
                    tasa = moneda.conversion_rates().get(monedaFinal);
                    break;
                case 3:
                    monedaInicial = listaMonedas.get(0);
                    monedaFinal = listaMonedas.get(2);
                    moneda = consulta.consultaMoneda(monedaInicial);
                    tasa = moneda.conversion_rates().get(monedaFinal);
                    break;
                case 4:
                    monedaInicial = listaMonedas.get(2);
                    monedaFinal = listaMonedas.get(0);
                    moneda = consulta.consultaMoneda(monedaInicial);
                    tasa = moneda.conversion_rates().get(monedaFinal);
                    break;
                case 5:
                    monedaInicial = listaMonedas.get(0);
                    monedaFinal = listaMonedas.get(3);
                    moneda = consulta.consultaMoneda(monedaInicial);
                    tasa = moneda.conversion_rates().get(monedaFinal);
                    break;
                case 6:
                    monedaInicial = listaMonedas.get(3);
                    monedaFinal = listaMonedas.get(0);
                    moneda = consulta.consultaMoneda(monedaInicial);
                    tasa = moneda.conversion_rates().get(monedaFinal);
                    break;
                case 7:
                    break;
            }

            ConversionMoneda.conversor(monedaInicial, monedaFinal, saldo, tasa);
        }
    }
}