package model;

public class Aluguel {
    private final Produto produto;
    private int diasAlugado;

    public Aluguel(Produto produto, int diasAlugado) {
        this.produto = produto;
        this.diasAlugado = diasAlugado;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getDiasAlugado() {
        return diasAlugado;
    }
}

