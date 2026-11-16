
package edu.ufp.inf.poo.robolabyrinth.modelo;

/**
 * Representa um robo especializado no transporte
 * de artefactos no labirinto.
 *
 * Herda os atributos e metodos da classe Robo.
 */
public class RoboTransporte extends Robo {

    // Atributo especifico indicado no UML
    private int roboTransporte;

    /**
     * Construtor da classe RoboTransporte.
     *
     * @param nome nome do robo
     * @param id identificador unico
     * @param nivelBateria nivel de bateria
     * @param estadoOperacional estado atual
     * @param roboTransporte atributo especifico do transporte
     */
    public RoboTransporte(String nome, String id,
                          double nivelBateria,
                          String estadoOperacional,
                          int roboTransporte) {

        super(nome, id, nivelBateria, estadoOperacional);

        if (roboTransporte < 0) {
            throw new IllegalArgumentException(
                    "O valor nao pode ser negativo.");
        }

        this.roboTransporte = roboTransporte;
    }

    /**
     * Devolve o atributo especifico do robo.
     *
     * @return valor do atributo
     */
    public int getRoboTransporte() {
        return roboTransporte;
    }

    /**
     * Altera o atributo especifico do robo.
     *
     * @param roboTransporte novo valor
     */
    public void setRoboTransporte(int roboTransporte) {
        if (roboTransporte < 0) {
            throw new IllegalArgumentException(
                    "O valor nao pode ser negativo.");
        }

        this.roboTransporte = roboTransporte;
    }

    /**
     * Executa a funcionalidade de transporte.
     */
    public void transportar() {

        mover();

        System.out.println(
                "Robo " + getNome() +
                        " esta a transportar artefactos.");
    }

    /**
     * Devolve os dados do robo de transporte.
     *
     * @return informacao do robo
     */
    @Override
    public String toString() {
        return "RoboTransporte{" +
                "nome='" + getNome() + '\'' +
                ", id='" + getId() + '\'' +
                ", nivelBateria=" + getNivelBateria() +
                ", roboTransporte=" + roboTransporte +
                '}';
    }
}
