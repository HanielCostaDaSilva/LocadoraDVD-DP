package model;

public class HtmlExtrato extends Extrato {

    public HtmlExtrato(Cliente cliente) {
        super(cliente);
    }

    @Override
    protected String getHeader(String nomeCliente) {

        String s = "<H1>Registro de Alugueis de <EM>" +

                nomeCliente + "</EM></H1><P>" + this.getLineSeparator();
        return s;
    }

    @Override
    protected String getLineSeparator() {
        return System.getProperty("line.separator");
    }

    @Override
    protected String alugelFormater(String dvdTitulo, double valor) {

        String s = dvdTitulo + ": R$ " + valor + "<BR>" + this.getLineSeparator();
        return s;
    }

    @Override
    protected String getFooter(double valorTotal, int pontosTotais) {

        String s = "<P>Valor total pago: <EM>R$ " + valorTotal +
                "</EM>" + this.getLineSeparator();
        s += "<P>Voce acumulou <EM>" + pontosTotais + " pontos </EM> de alugador frequente";
        return s;
    }

}
