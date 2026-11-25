package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContratoCreditoBuilderTest {

    @Test
    void deveRetornarExcecaoParaContratoSemNumero() {
        try {
            new ContratoCreditoBuilder()
                    .setCpfAssociado("111.222.333-44")
                    .setValorSolicitado(10000.0)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número do contrato inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaContratoSemCpf() {
        try {
            new ContratoCreditoBuilder()
                    .setNumeroContrato(100)
                    .setValorSolicitado(10000.0)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("CPF do associado obrigatório", e.getMessage());
        }
    }

    @Test
    void deveConstruirContratoValido() {
        ContratoCredito contrato = new ContratoCreditoBuilder()
                .setNumeroContrato(101)
                .setCpfAssociado("111.222.333-44")
                .setValorSolicitado(15000.0)
                .setParcelas(24)
                .setTaxaJuros(1.5)
                .setSeguroPrestamista(true)
                .setMesesCarencia(2)
                .build();

        assertNotNull(contrato);
        assertEquals(101, contrato.getNumeroContrato());
        assertTrue(contrato.isSeguroPrestamista());
    }
}