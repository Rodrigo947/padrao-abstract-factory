public class FundoDeInvestimento {

    private Acoes acoes;
    private RendaFixa rendaFixa;

    public FundoDeInvestimento (FabricaAbstrata fabrica) {
        this.acoes = fabrica.createAcoes();
        this.rendaFixa = fabrica.createRendaFixa();
    }

    public String relatorioPrecoAcoes() {
        return this.acoes.relatorioPrecoAcoes();
    }

    public String relatorioDeRendimentosRendaFixa() {
        return this.rendaFixa.relatorioDeRendimentosRendaFixa();
    }
}
