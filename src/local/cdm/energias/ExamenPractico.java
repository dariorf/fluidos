package local.cdm.energias;

public class ExamenPractico extends Examen{

	public ExamenPractico(String asignatura, int minutos) {
		super(asignatura, minutos);
	}
	
	
	@Override
	public String hacer() {
		energiaNecesaria = this.minutos / 2;
		return "Haciendo examen practico de la asignatura " + asignatura;
	}
	
}