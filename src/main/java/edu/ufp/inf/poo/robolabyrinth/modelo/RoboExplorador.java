
package edu.ufp.inf.poo.robolabyrinth.modelo;

/**
 * Representa um robo especializado na exploracao
 * do labirinto.
 *
 * Herda os atributos e comportamentos da classe Robo.
 */
public class RoboExplorador extends Robo {

    // Atributo especifico do robo explorador
    private double alcanceSensores;

    /**
     * Construtor do RoboExplorador.
     *
     * @param nome nome do robo
     * @param id identificador unico
     * @param nivelBateria nivel de bateria
     * @param estadoOperacional estado atual
     * @param alcanceSensores alcance dos sensores
     */
    public RoboExplorador(String nome, String id,
                          double nivelBateria,
                          String estadoOperacional,
                          double alcanceSensores) {

        super(nome, id, nivelBateria, estadoOperacional);

        if (alcanceSensores <= 0) {
            throw new IllegalArgumentException(
                    "O alcance dos sensores deve ser positivo.");
        }

        this.alcanceSensores = alcanceSensores;
    }

    /**
     * Devolve o alcance dos sensores.
     *
     * @return alcance dos sensores
     */
    public double getAlcanceSensores() {
        return alcanceSensores;
    }

    /**
     * Altera o alcance dos sensores.
     *
     * @param alcanceSensores novo alcance
     */
    public void setAlcanceSensores(double alcanceSensores) {
        if (alcanceSensores <= 0) {
            throw new IllegalArgumentException(
                    "O alcance dos sensores deve ser positivo.");
        }

        this.alcanceSensores = alcanceSensores;
    }

    /**
     * Executa a funcionalidade de exploracao.
     */
    public void explorar() {
        if (getNivelBateria() <= 0) {
            throw new IllegalStateException(
                    "O robo nao tem bateria suficiente.");
        }

        System.out.println(
                "Robo " + getNome() +
                        " esta a explorar o labirinto.");

        System.out.println(
                "Alcance dos sensores: " +
                        alcanceSensores);
    }

    @Override
    public String toString() {
        return "RoboExplorador{" +
                "nome='" + getNome() + '\'' +
                ", id='" + getId() + '\'' +
                ", nivelBateria=" + getNivelBateria() +
                ", alcanceSensores=" + alcanceSensores +
                '}';
    }
}
