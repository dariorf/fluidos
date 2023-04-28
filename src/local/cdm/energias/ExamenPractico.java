package local.cdm.energias;

public class ExamenPractico extends Examen{

	public ExamenPractico(String asignatura, int minutos) {
		super(asignatura, minutos);
                energiaNecesaria = this.minutos / 2;
	}
	
	
	@Override
	public String hacer() {		
		return "Haciendo examen practico de la asignatura " + asignatura;
	}
	
}