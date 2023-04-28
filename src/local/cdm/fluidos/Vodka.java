/**
 *
 * @author Dario Roldan Fraga
 */
package local.cdm.fluidos;

public class Vodka extends Liquido implements Graduable {
    
    private Double grados;

    @Override
    public Double getGrados() {
        return grados;
    }

    public void setGrados(Double grados) {
        if (grados != null && grados >= 0.0 && grados < 1.0) {
            this.grados = grados;
        }
    }

    public Vodka(Double grados, Double litros) {
        super(litros, "Incoloro");
        if (grados != null && grados >= 0.0 && grados < 1.0) {
            this.grados = grados;
        }
    }

    @Override
    public Liquido mezclar(Liquido l) throws NoSePuedeMezclarException {
        if (l.getClass().equals(Cola.class) || l.getClass().equals(Agua.class)) {
            return new Copa(this, l.mezclar(this));
        } else {
            throw new NoSePuedeMezclarException("Solo de puede mezclar Vodka con Agua o Cola");
        }        
    }

}