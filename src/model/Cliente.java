package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cliente {
    private String nome;
    private List<Aluguel> dvdsAlugados = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionaAluguel(Aluguel aluguel) {
        dvdsAlugados.add(aluguel);
    }

    public String extrato() {
        final String fimDeLinha = System.getProperty("line.separator");

        double valorTotal = 0.0;

        int pontosDeAlugadorFrequente = 0;

        Iterator<Aluguel> alugueis = dvdsAlugados.iterator();
        StringBuilder resultado = new StringBuilder("Registro de Alugueis de " + getNome() +
                fimDeLinha);

        while (alugueis.hasNext()) {
            double valorCorrente = 0.0;
            Aluguel cada = alugueis.next();

            valorCorrente += cada.calcularAluguel();

            pontosDeAlugadorFrequente++;

            // adiciona bonus para aluguel de um lançamento por pelo menos 2 dias
            if (cada.ehDVDBonus() && cada.getDiasAlugado() > 1) {
                pontosDeAlugadorFrequente++;
            }

            // mostra valores para este aluguel

            resultado.append("\t").append(cada.getDVD().getTitulo()).append("\t").append(valorCorrente).append(fimDeLinha);
            valorTotal += valorCorrente;
        }
        // while
        // adiciona rodapé
        resultado.append("Valor total devido: ").append(valorTotal).append(fimDeLinha);
        resultado.append("Voce acumulou ").append(pontosDeAlugadorFrequente).append(" pontos de alugador frequente");
        return resultado.toString();
    }
}