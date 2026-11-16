
package edu.ufp.inf.poo.robolabyrinth.modelo;

/**
 * Representa um material perigoso encontrado
 * durante a exploracao do labirinto.
 *
 * Herda os atributos e metodos de Artefacto.
 */
public class MaterialPerigoso extends Artefacto {

    // Atributo especifico
    private int nivelPerigo;

    /**
     * Construtor da classe MaterialPerigoso.
     *
     * @param id identificador unico
     * @param descricao descricao do material
     * @param peso peso do material
     * @param valorCientifico valor cientifico
     * @param nivelPerigo nivel de perigo
     */
    public MaterialPerigoso(String id, String descricao,
                            double peso, double valorCientifico,
                            int nivelPerigo) {

        super(id, descricao, peso, valorCientifico);

        if (nivelPerigo < 0) {
            throw new IllegalArgumentException(
                    "Nivel de perigo invalido.");
        }

        this.nivelPerigo = nivelPerigo;
    }

    /**
     * Devolve o nivel de perigo.
     *
     * @return nivel de perigo
     */
    public int getNivelPerigo() {
        return nivelPerigo;
    }

    /**
     * Altera o nivel de perigo.
     *
     * @param nivelPerigo novo nivel de perigo
     */
    public void setNivelPerigo(int nivelPerigo) {
        if (nivelPerigo < 0) {
            throw new IllegalArgumentException(
                    "Nivel de perigo invalido.");
        }

        this.nivelPerigo = nivelPerigo;
    }

    /**
     * Devolve o valor do material perigoso.
     *
     * @return valor cientifico herdado
     */
    @Override
    public double getValor() {
        return super.getValor();
    }

    @Override
    public String toString() {
        return "MaterialPerigoso{" +
                "id='" + getId() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", peso=" + getPeso() +
                ", nivelPerigo=" + nivelPerigo +
                ", valor=" + getValor() +
                '}';
    }
}
