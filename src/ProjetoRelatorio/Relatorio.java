package ProjetoRelatorio;

public class Relatorio {

    String titulo = "";
    String corpo = "";
    String rodape = "";

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public void setRodape(String rodape) {
        this.rodape = rodape;
    }

    @Override
    public String toString() {
        return
                "TITULO: " + titulo + ".\n" +
                "CORPO: " + corpo + ".\n" +
                "RODAPE: " + rodape + ".\n";
    }
}
