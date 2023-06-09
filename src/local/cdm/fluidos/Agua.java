/**
 *
 * @author Dario Roldan Fraga
 */
package local.cdm.fluidos;

import local.cdm.energias.Bebible;

public class Agua extends Liquido implements Bebible {

    private Double pureza;

    public Double getPureza() {
        return pureza;
    }

    public void setPureza(Double pureza) {
        if (pureza != null && pureza >= 0.0 && pureza <= 1.0) {
            this.pureza = pureza;
        }
    }

    public Agua(Double litros) {
        super(litros, "incoloro");
        this.pureza = 1.0;
    }

    @Override
    public Liquido mezclar(Liquido l) {
        Agua salida = new Agua(this.litros + l.getLitros());

        if (!l.getClass().equals(Agua.class)) {
            salida.setPureza(this.litros / salida.getLitros());
            salida.setColor(this.color + "-" + l.color);
        }

        return salida;
    }

    @Override
    public Integer getEnergia() {
        return Math.round(30*this.litros.floatValue());
    }
    
}
