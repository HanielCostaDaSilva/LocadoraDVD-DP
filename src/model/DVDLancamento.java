package model;

public class DVDLancamento extends DVD {

    private final double precoAluguel = 1.5;


    public DVDLancamento(String titulo, int codigoDePreco) {
        super(titulo, codigoDePreco);
        this.setEhBonus(true);
    }


    public double calcularAluguel(int diasAlugados) {
        double valorAluguel = precoAluguel;

        if (diasAlugados > 3) {
            valorAluguel += (diasAlugados - 3) * 1.5;


        }
        return valorAluguel;

    }
}
