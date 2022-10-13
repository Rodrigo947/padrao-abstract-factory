public class FabricaFundoInvestimentoModerado implements FabricaAbstrata {

    @Override
    public Acoes createAcoes() {
        return new AcoesBrasileiras();
    }

    @Override
    public RendaFixa createRendaFixa() {
        return new RendaFixaCDB();
    }
}
