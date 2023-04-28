package local.cdm.energias;

public abstract class Examen implements Accion{
	
	protected String asignatura;
	protected int minutos;
	protected int energiaNecesaria;
	
	
	public Examen(String asignatura, int minutos) {
		this.asignatura = asignatura;
		this.minutos = minutos;
	}
	
	public abstract String hacer();

	
	public String getAsignatura() {
		return asignatura;
	}

	public int getMinutos() {
		return minutos;
	}

	public Integer getEnergia() {
		return energiaNecesaria;
	}	
}