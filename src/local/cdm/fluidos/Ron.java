/**
 *
 * @author Dario Roldan Fraga
 */
package local.cdm.fluidos;

import local.cdm.energias.Bebible;

public class Ron extends Liquido implements Graduable, Bebible {

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

    public Ron(Double grados, Double litros) {
        super(litros, "Ámbar");
        if (grados != null && grados >= 0.0 && grados < 1.0) {
            this.grados = grados;
        }
    }

    @Override
    public Liquido mezclar(Liquido l) throws NoSePuedeMezclarException {
        if (l.getClass().equals(Cola.class) || l.getClass().equals(Agua.class)) {
            return new Copa(this, l);
        } else {
            throw new NoSePuedeMezclarException("Solo de puede mezclar Ron con Agua o Cola");
        }
    }

    @Override
    public Integer getEnergia() {
        return Math.round(-100*(this.grados.floatValue()*this.litros.floatValue()));
    }

}
