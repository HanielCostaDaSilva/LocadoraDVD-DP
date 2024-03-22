package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cliente {
    private String nome;

    private List<Aluguel> dvdsAlugados = new ArrayList<>();

    private Extrato extrato = new Extrato(this);

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionaAluguel(Aluguel aluguel) {
        dvdsAlugados.add(aluguel);
    }

    public String getExtrato() {

        return extrato.mostrarExtrato(this.dvdsAlugados);

    }
}