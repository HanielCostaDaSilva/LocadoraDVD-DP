package model;

public abstract class Produto {
    private String titulo;
    private Tipo codigoDePreco;

    public Produto(String titulo, Tipo codigoDePreco) {
        this.titulo = titulo;
        this.codigoDePreco = codigoDePreco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Tipo getCodigoDePreco() {
        return codigoDePreco;
    }

    public void setCodigoDePreco(Tipo codigoDePreco) {
        this.codigoDePreco = codigoDePreco;
    }
}
