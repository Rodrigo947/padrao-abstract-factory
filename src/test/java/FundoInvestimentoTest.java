import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FundoInvestimentoTest {
    FundoInvestimentoTest() {
    }

    @Test
    void deveEmitirRelatorioPrecoAcoesBrasileiras() {
        FabricaAbstrata fabrica = new FabricaFundoInvestimentoModerado();
        FundoDeInvestimento fundoDeInvestimento = new FundoDeInvestimento(fabrica);
        Assertions.assertEquals("""
                PETR4: R$33,94
                ITUB4: R$28,64
                """, fundoDeInvestimento.relatorioPrecoAcoes());
    }

    @Test
    void deveEmitirRelatorioPrecoAcoesEstrangeiras() {
        FabricaAbstrata fabrica = new FabricaFundoInvestimentoDeRisco();
        FundoDeInvestimento fundoDeInvestimento = new FundoDeInvestimento(fabrica);
        Assertions.assertEquals("""
                AMZO34: R$29,57
                MSFT34: R$52,07
                """, fundoDeInvestimento.relatorioPrecoAcoes());
    }

    @Test
    void deveEmitirRelatorioDeRendimentosRendaFixaCDB() {
        FabricaAbstrata fabrica = new FabricaFundoInvestimentoModerado();
        FundoDeInvestimento fundoDeInvestimento = new FundoDeInvestimento(fabrica);
        Assertions.assertEquals("""
                Banco Master: R$ 10,12
                Banco Digimais: R$ 9,25
                """, fundoDeInvestimento.relatorioDeRendimentosRendaFixa());
    }

    @Test
    void deveEmitirRelatorioDeRendimentosRendaFixaTesouroDireto() {
        FabricaAbstrata fabrica = new FabricaFundoInvestimentoDeRisco();
        FundoDeInvestimento fundoDeInvestimento = new FundoDeInvestimento(fabrica);
        Assertions.assertEquals("""
                Tesouro Prefixado 2025: R$ 4,56"
                Tesouro Selic 2027: R$ 5,25"
                """, fundoDeInvestimento.relatorioDeRendimentosRendaFixa());
    }
}
