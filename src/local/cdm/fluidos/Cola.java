/**
 *
 * @author Dario Roldan Fraga
 */
package local.cdm.fluidos;

public class Cola extends Liquido {
        
    private boolean cafeina;

    public boolean isCafeina() {
        return cafeina;
    }

    public void setCafeina(boolean cafeina) {
        this.cafeina = cafeina;
    }

    public Cola(Double litros, String color) {
        super(litros, color);
        this.cafeina = true;
    }

    @Override
    public Liquido mezclar(Liquido l) throws NoSePuedeMezclarException {
        // TODO
        throw new NoSePuedeMezclarException("No es posible mezclar con Cola");
    }
    
}
