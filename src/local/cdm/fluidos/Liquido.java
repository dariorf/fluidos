/**
 *
 * @author Dario Roldan Fraga
 */
package local.cdm.fluidos;

public abstract class Liquido {

    protected Double litros;
    protected String color;

    public Double getLitros() {
        return litros;
    }

    public void setLitros(Double litros) {
        this.litros = litros;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Liquido(Double litros, String color) {
        this.litros = litros;
        this.color = color;
    }

    public abstract Liquido mezclar(Liquido l) throws NoSePuedeMezclarException;

    public void incrementar(Double l) {
        if (l != null) {
            this.litros += l;
        }
    }

}
