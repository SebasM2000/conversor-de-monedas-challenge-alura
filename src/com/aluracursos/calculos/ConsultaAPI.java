package com.aluracursos.calculos;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaAPI {
    public Moneda consultaMoneda(String tipoMonedaBase) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/f260c4c64c7ef0cb023fb463/latest/"
                + tipoMonedaBase);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}