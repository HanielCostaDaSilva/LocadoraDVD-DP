package model;

public class Locadora {


    public static void main(String[] args) {
        Cliente c1 = new Cliente("Alex Sandro");

        c1.adicionaAluguel(new Aluguel(new DVD("O Atirador", Tipo.NORMAL), 10));
        c1.adicionaAluguel(new Aluguel(new DVD("Luca", Tipo.INFANTIL), 2));
        c1.adicionaAluguel(new Aluguel(new DVD("O Gato de Botas 2",
                Tipo.LANÇAMENTO), 30));

        c1.adicionaAluguel(new Aluguel(new DVD("Arremessando Alto",
                Tipo.LANÇAMENTO), 4));
        c1.adicionaAluguel(new Aluguel(new DVD("Moana", Tipo.INFANTIL), 10));

        c1.adicionaAluguel(new Aluguel(new DVD("Uma Noite no Museu",
                Tipo.NORMAL), 3));

        System.out.println(c1.extrato());
    }
}
