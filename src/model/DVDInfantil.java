package model;

public class DVDInfantil extends DVD {

    public DVDInfantil(String titulo, int codigoDePreco) {
        super(titulo, codigoDePreco);
    }


    @Override
    public double calcularAluguel(int diasAlugado) {
        return diasAlugado * 3.00;
    }



}
