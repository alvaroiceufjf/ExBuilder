package org.example;

public class ContratoCredito {

    private int numeroContrato;
    private String cpfAssociado;
    private double valorSolicitado;
    private int parcelas;
    private double taxaJuros;
    private boolean seguroPrestamista;
    private int mesesCarencia;

    public ContratoCredito() {
        this.numeroContrato = 0;
        this.cpfAssociado = "";
    }

    public int getNumeroContrato() { return numeroContrato; }
    public void setNumeroContrato(int numeroContrato) { this.numeroContrato = numeroContrato; }

    public String getCpfAssociado() { return cpfAssociado; }
    public void setCpfAssociado(String cpfAssociado) { this.cpfAssociado = cpfAssociado; }

    public double getValorSolicitado() { return valorSolicitado; }
    public void setValorSolicitado(double valorSolicitado) { this.valorSolicitado = valorSolicitado; }

    public int getParcelas() { return parcelas; }
    public void setParcelas(int parcelas) { this.parcelas = parcelas; }

    public double getTaxaJuros() { return taxaJuros; }
    public void setTaxaJuros(double taxaJuros) { this.taxaJuros = taxaJuros; }

    public boolean isSeguroPrestamista() { return seguroPrestamista; }
    public void setSeguroPrestamista(boolean seguroPrestamista) { this.seguroPrestamista = seguroPrestamista; }

    public int getMesesCarencia() { return mesesCarencia; }
    public void setMesesCarencia(int mesesCarencia) { this.mesesCarencia = mesesCarencia; }
}
