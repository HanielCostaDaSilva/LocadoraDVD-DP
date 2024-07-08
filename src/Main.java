import model.Aluguel;
import model.Cliente;
import model.DVD;
import model.HtmlExtrato;
import model.TextExtrato;
import model.TipoDVD;

public class Locadora {

    public static void main(String[] args) {
        Cliente c1 = new Cliente("Alex Sandro");
        c1.setExtrato(new TextExtrato(c1));
        c1.adicionaAluguel(new Aluguel(new DVD("O Atirador", TipoDVD.NORMAL), 10));
        c1.adicionaAluguel(new Aluguel(new DVD("Luca", TipoDVD.INFANTIL), 2));
        c1.adicionaAluguel(new Aluguel(new DVD("O Gato de Botas 2",
                TipoDVD.LANCAMENTO), 30));
                
        c1.adicionaAluguel(new Aluguel(new DVD("Arremessando Alto",
        TipoDVD.LANCAMENTO), 4));
        c1.adicionaAluguel(new Aluguel(new DVD("Moana", TipoDVD.INFANTIL), 10));

        c1.adicionaAluguel(new Aluguel(new DVD("Uma Noite no Museu", TipoDVD.NORMAL), 3));
        
        System.out.println(c1.getExtrato());
        c1.setExtrato(new HtmlExtrato(c1));
        System.out.println(c1.getExtrato());
    }
}
