public class RendaFixaTesouroDireto implements RendaFixa {

    @Override
    public String relatorioDeRendimentosRendaFixa() {
        return """
                Tesouro Prefixado 2025: R$ 4,56"
                Tesouro Selic 2027: R$ 5,25"
                """;

    }
}
