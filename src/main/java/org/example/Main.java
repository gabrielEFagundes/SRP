package org.example;

import org.example.model.Pedido;
import org.example.service.ProcessadorService;

public class Main {
    public static void main(String[] args) {
        ProcessadorService processador = new ProcessadorService();
        Pedido pedido1 = new Pedido("PED-123", 600.00, 5, "cliente@email.com");

        try {
            double total = processador.processar(pedido1);
            System.out.println("Resultado final: Pedido processado com sucesso! Total: R$" + total);

        } catch (Exception e) {
            System.out.println("Erro ao processar pedido: " + e.getMessage());
        }
    }
}