package ProjetoPizza;

public class Pizza {
    private String massa = "";

    private String tamanho = "";

    private String addIngredientes = "";

    public Pizza(){}

    public void setMassa(String massa) {
        this.massa = massa;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setAddIngredientes(String addIngredientes) {
        this.addIngredientes = addIngredientes;
    }

    @Override
    public String toString(){
    return "Massa: " + this.massa + " " + "Tamanho: " + this.tamanho + " " +
            "Ingredientes: " + this.addIngredientes;
    }
}
