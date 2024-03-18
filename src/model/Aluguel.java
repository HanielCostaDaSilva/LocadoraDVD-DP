package model;

public class Aluguel {
    private final DVD dvd;
    private final int diasAlugado;


    public Aluguel(DVD dvd, int diasAlugado) {
        this.dvd = dvd;
        this.diasAlugado = diasAlugado;
    }

    public DVD getDVD() {
        return dvd;
    }

    public double calcularAluguel(){
        return this.dvd.calcularAluguel(this.diasAlugado);
    }
    public boolean ehDVDBonus(){
        return this.dvd.ehBonus();
    }


    public int getDiasAlugado() {
        return diasAlugado;
    }
}

