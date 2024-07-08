package model;

import java.util.ArrayList;
    import java.util.List;

public class DVD {

    private String titulo;

    public TipoDVD getTipo() {
        return tipo;
    }

    private TipoDVD tipo;

    private boolean ehBonus = false;

    private static final ArrayList<TipoDVD> tiposDVDBonus = new ArrayList<>(List.of(TipoDVD.LANCAMENTO));

    public DVD(String titulo, TipoDVD tipo) {
        this.titulo = titulo;
        this.tipo = tipo;
        ehBonus = tiposDVDBonus.contains(tipo);
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean ehBonus() {
        return ehBonus;
    }

    // Método setter para modificar o atributo ehBonus
    public void setEhBonus(boolean ehBonus) {
        this.ehBonus = ehBonus;
    }

    public void setTipo(TipoDVD tipo) {
        this.tipo = tipo;
    }
}
