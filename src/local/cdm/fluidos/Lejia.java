/**
 *
 * @author Dario Roldan Fraga
 */
package local.cdm.fluidos;

public class Lejia extends Liquido {

    private Double pureza;

    public Double getPureza() {
        return pureza;
    }

    public void setPureza(Double pureza) {
        if (pureza != null && pureza >= 0.0 && pureza <= 1.0) {
            this.pureza = pureza;
        }
    }

    public Lejia(Double litros) {
        super(litros, "Incoloro");
        this.pureza = 1.0;
    }

    @Override
    public Liquido mezclar(Liquido l) {
        Lejia salida = new Lejia(this.litros + l.getLitros());        

        if (!l.getClass().equals(Lejia.class)) {
            salida.setPureza(this.litros / salida.getLitros());
            salida.setColor(this.color + "-" + l.color);
        }

        return salida;
    }

}
