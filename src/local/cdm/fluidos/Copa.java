/**
 *
 * @author Dario Roldan Fraga
 */
package local.cdm.fluidos;

public class Copa extends Liquido implements Graduable {

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

    public Copa(Graduable alcohol, Liquido mezcla) {
        super(mezcla.getLitros(), mezcla.getColor());
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

}
