public class ClimaTracker {

    public void setCondicaoAtual(CondicaoClimatica condicaoClimatica) {
        String alerta = condicaoClimatica.gerarAlerta();
        Sysout(alerta);
    }
}