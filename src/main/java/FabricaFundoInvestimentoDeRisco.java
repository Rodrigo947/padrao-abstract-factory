public class FabricaFundoInvestimentoDeRisco implements FabricaAbstrata {

    @Override
    public Acoes createAcoes() {
        return new AcoesEstrangeiras();
    }

    @Override
    public RendaFixa createRendaFixa() {
        return new RendaFixaTesouroDireto();
    }
}
