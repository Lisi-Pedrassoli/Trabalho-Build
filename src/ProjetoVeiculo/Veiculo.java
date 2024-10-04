package ProjetoVeiculo;

public class Veiculo {
    private String tipo = "";
    private String cor = "";
    private int rodas = 0;

    public Veiculo (){}

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    @Override
    public String toString() {
        return "tipo: " + tipo + "" +
                ", cor: " + cor + "" +
                ", rodas: " + rodas + "";
    }
}