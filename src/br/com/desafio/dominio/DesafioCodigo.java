package br.com.desafio.dominio;

public class DesafioCodigo extends Conteudo{
    private int tempoMinutos;

    @Override
    public double calcularXP() {
        return XP_PADRAO / tempoMinutos;
    }

    public int getTempoMinutos() {
        return tempoMinutos;
    }

    public void setTempoMinutos(int tempoMinutos) {
        this.tempoMinutos = tempoMinutos;
    }

    @Override
    public String toString() {
        return "DesafioCodigo{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                "tempoMinutos=" + tempoMinutos +
                '}';
    }
}
