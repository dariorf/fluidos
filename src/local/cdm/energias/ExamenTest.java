package local.cdm.energias;

public class ExamenTest extends Examen{
	
	private int numPreguntas;
	private boolean resta;
	
	public ExamenTest(String asignatura,int numPreguntas,boolean resta) {
		super(asignatura, numPreguntas);
		this.numPreguntas = numPreguntas;
	}

	@Override
	public String hacer() {
		minutos =  numPreguntas * (1 / 2);
		
		if(resta == false) {
			energiaNecesaria = numPreguntas / 4;
		}else {
			energiaNecesaria = numPreguntas / 2;
		}
		
		int c = 0;
		String frase2 = "";
		while (c < numPreguntas){
			c++;
			String frase = "Haciendo pregunta "+ c +" del examen de la asignatura "+asignatura + "\n";
			
			frase2 += frase;
		}
		return frase2;
	}

	public int getNumPreguntas() {
		return numPreguntas;
	}

	public boolean isResta() {
		return resta;
	}

}