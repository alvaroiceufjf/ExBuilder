package org.example;

public class ContratoCreditoBuilder {

    private ContratoCredito contrato;

    public ContratoCreditoBuilder() {
        this.contrato = new ContratoCredito();
    }

    public ContratoCredito build() {
        if (contrato.getNumeroContrato() == 0) {
            throw new IllegalArgumentException("Número do contrato inválido");
        }
        if (contrato.getCpfAssociado().equals("")) {
            throw new IllegalArgumentException("CPF do associado obrigatório");
        }
        if (contrato.getValorSolicitado() <= 0) {
            throw new IllegalArgumentException("Valor solicitado deve ser maior que zero");
        }
        return contrato;
    }

    public ContratoCreditoBuilder setNumeroContrato(int numeroContrato) {
        contrato.setNumeroContrato(numeroContrato);
        return this;
    }

    public ContratoCreditoBuilder setCpfAssociado(String cpfAssociado) {
        contrato.setCpfAssociado(cpfAssociado);
        return this;
    }

    public ContratoCreditoBuilder setValorSolicitado(double valorSolicitado) {
        contrato.setValorSolicitado(valorSolicitado);
        return this;
    }

    public ContratoCreditoBuilder setParcelas(int parcelas) {
        contrato.setParcelas(parcelas);
        return this;
    }

    public ContratoCreditoBuilder setTaxaJuros(double taxaJuros) {
        contrato.setTaxaJuros(taxaJuros);
        return this;
    }

    public ContratoCreditoBuilder setSeguroPrestamista(boolean seguroPrestamista) {
        contrato.setSeguroPrestamista(seguroPrestamista);
        return this;
    }

    public ContratoCreditoBuilder setMesesCarencia(int mesesCarencia) {
        contrato.setMesesCarencia(mesesCarencia);
        return this;
    }
}
