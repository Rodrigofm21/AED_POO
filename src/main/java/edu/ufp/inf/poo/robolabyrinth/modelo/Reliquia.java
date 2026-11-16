
package edu.ufp.inf.poo.robolabyrinth.modelo;

/**
 * Representa uma reliquia encontrada no labirinto.
 *
 * Herda os atributos e metodos da classe Artefacto.
 */
public class Reliquia extends Artefacto {

    // Atributo especifico da reliquia
    private String periodoHistorico;

    /**
     * Construtor da classe Reliquia.
     *
     * @param id identificador unico
     * @param descricao descricao da reliquia
     * @param peso peso da reliquia
     * @param valorCientifico valor cientifico
     * @param periodoHistorico periodo historico
     */
    public Reliquia(String id, String descricao,
                    double peso, double valorCientifico,
                    String periodoHistorico) {

        super(id, descricao, peso, valorCientifico);

        if (periodoHistorico == null || periodoHistorico.isBlank()) {
            throw new IllegalArgumentException(
                    "Periodo historico invalido.");
        }

        this.periodoHistorico = periodoHistorico;
    }

    /**
     * Devolve o periodo historico da reliquia.
     *
     * @return periodo historico
     */
    public String getPeriodoHistorico() {
        return periodoHistorico;
    }

    /**
     * Altera o periodo historico.
     *
     * @param periodoHistorico novo periodo
     */
    public void setPeriodoHistorico(String periodoHistorico) {
        if (periodoHistorico == null || periodoHistorico.isBlank()) {
            throw new IllegalArgumentException(
                    "Periodo historico invalido.");
        }

        this.periodoHistorico = periodoHistorico;
    }

    /**
     * Devolve o valor da reliquia.
     *
     * @return valor cientifico da reliquia
     */
    @Override
    public double getValor() {
        return super.getValor();
    }

    @Override
    public String toString() {
        return "Reliquia{" +
                "id='" + getId() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", periodoHistorico='" + periodoHistorico + '\'' +
                ", valor=" + getValor() +
                '}';
    }
}
