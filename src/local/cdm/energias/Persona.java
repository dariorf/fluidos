package local.cdm.energias;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Persona implements Energetico {

    private String nombre;
    private Double capacidadVejiga;
    private Double estadoVejiga;
    private int energiaActual;
    private List<Accion> tareas;

    public Persona(String nombre, Double capacidadVejiga) {
        this.nombre = nombre;
        this.capacidadVejiga = capacidadVejiga;
        this.estadoVejiga = 0.00;
        this.energiaActual = 100;
        this.tareas = new ArrayList<>();
    }

    public void addTarea(Accion a) {
        tareas.add(a);
    }

    public int hacerTareas() {
        int c = 0;
        
        Iterator it = this.tareas.iterator();
        
        while (it.hasNext()) {
            Accion t = (Accion) it.next();
            if (this.energiaActual-t.getEnergia() >= 0) {
                t.hacer();
                this.energiaActual-=t.getEnergia();
                it.remove();
                c++;
            } else {
                break;
            }
        }
        return c;
    }

    @Override
    public Integer getEnergia() {
        return this.energiaActual;
    }
    
    public void vaciarVejiga() {
        this.estadoVejiga = 0.0;
    }
    
    public Double beber(Bebible b) {
        double aux = this.capacidadVejiga - this.estadoVejiga;
        this.estadoVejiga += b.getLitros();
        
        if (this.estadoVejiga > this.capacidadVejiga) {            
            this.estadoVejiga = this.capacidadVejiga;
            this.energiaActual += aux * b.getEnergia() / b.getLitros();
        } else {
            this.energiaActual += b.getEnergia();
        }
        
        return this.estadoVejiga;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getCapacidadVejiga() {
        return capacidadVejiga;
    }

    public Double getEstadoVejiga() {
        return estadoVejiga;
    }

    public int getEnergiaActual() {
        return energiaActual;
    }

    public List<Accion> getTareas() {
        return tareas;
    }
    
    

}
