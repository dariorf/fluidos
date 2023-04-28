/**
 *
 * @author Dario Roldan Fraga
 */
package local.cdm.fluidos;

import local.cdm.energias.Bebible;

public class Copa extends Liquido implements Graduable, Bebible{

    private Graduable alcohol;
    private Liquido mezcla;

    public Graduable getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(Graduable alcohol) {
        this.alcohol = alcohol;
    }

    public Liquido getMezcla() {
        return mezcla;
    }

    public void setMezcla(Liquido mezcla) {
        this.mezcla = mezcla;
    }

    public Copa(Graduable alcohol, Liquido mezcla) throws NoSePuedeMezclarException {
        super(mezcla.mezclar((Liquido) alcohol).getLitros(), mezcla.mezclar((Liquido) alcohol).getColor());
        this.alcohol = alcohol;
        this.mezcla = mezcla;
    }

    @Override
    public Liquido mezclar(Liquido l) throws NoSePuedeMezclarException {
        throw new NoSePuedeMezclarException("No se pueden mezclar Copas");
    }

    @Override
    public Double getGrados() {
        Liquido a = (Liquido) alcohol;
        return (alcohol.getGrados() * a.getLitros()) / this.litros;
    }

    @Override
    public Integer getEnergia() {
        Bebible m = (Bebible) this.mezcla;
        Bebible a = (Bebible) this.alcohol;
        return Math.round((m.getEnergia()/this.getLitros().floatValue())+(a.getEnergia()/this.getLitros().floatValue()));
    }

}
