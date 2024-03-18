package model;

public abstract class DVD {

    private String titulo;
    private int codigoDePreco;

    private boolean ehBonus = false;


    public DVD(String titulo, int codigoDePreco) {
        this.titulo = titulo;
        this.codigoDePreco = codigoDePreco;
    }

/*    public DVD(String titulo) {
        this.titulo = titulo;
    }*/

    public abstract double calcularAluguel(int diasAlugados);


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }



    public int getCodigoDePreco() {
        return codigoDePreco;
    }

    public void setCodigoDePreco(int codigoDePreco) {
        this.codigoDePreco = codigoDePreco;
    }


    public boolean ehBonus() {
        return ehBonus;
    }

    // Método setter para modificar o atributo ehBonus
    protected void setEhBonus(boolean ehBonus) {
        this.ehBonus = ehBonus;
    }

}
