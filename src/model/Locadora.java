package model;

public class Locadora {


    public static void main(String[] args) {
        Cliente c1 = new Cliente("Alex Sandro");

        c1.adicionaAluguel(new Aluguel(new DVDNormal("O Atirador", 1), 10));
        c1.adicionaAluguel(new Aluguel(new DVDInfantil("Luca", 2), 2));
        c1.adicionaAluguel(new Aluguel(new DVDLancamento("O Gato de Botas 2",
                3), 30));

        c1.adicionaAluguel(new Aluguel(new DVDLancamento("Arremessando Alto",
                3), 4));
        c1.adicionaAluguel(new Aluguel(new DVDNormal("Moana", 2), 10));

        c1.adicionaAluguel(new Aluguel(new DVDNormal("Uma Noite no Museu",
                1), 3));

        System.out.println(c1.extrato());
    }
}
