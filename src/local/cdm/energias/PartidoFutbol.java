package local.cdm.energias;

public class PartidoFutbol implements Accion{
	
	private int categoria;
	private int energiaNecesaria;
	private boolean prorroga;
	private boolean penaltis;

    public PartidoFutbol(int categoria) {
        if (categoria <= 1 && categoria <= 7) {
            this.categoria = categoria;            
        } else {
            this.categoria = 1;
        }
        
        this.prorroga = false;
        this.penaltis = false;
        this.energiaNecesaria = 40*categoria;
    }
	
	
	public String hacer() {
		energiaNecesaria = categoria * 40;
		
		if (prorroga = true) {
			int p = energiaNecesaria * 15/100;
			energiaNecesaria += p;
		}
		if (penaltis = true) {
			int p = energiaNecesaria * 5/100;
			energiaNecesaria += p;
		}
		String salida = "Jugando partido de categoria" + categoria;
		if(prorroga = true) {
			salida = "Jugando partido de categoria" + categoria + "prórroga";
			if(penaltis = true) {
				salida = "Jugando partido de categoria" + categoria + "prórroga y penaltis";
			}
		}
		return salida;
	}

	
	public boolean isProrroga() {
		return prorroga;
	}


	public void setProrroga(boolean prorroga) {
		this.prorroga = prorroga;
	}


	public boolean isPenaltis() {
		return penaltis;
	}


	public void setPenaltis(boolean penaltis) {
		if (penaltis == true) {
			this.prorroga = true;
		}
		this.penaltis = penaltis;
	}

    @Override
    public Integer getEnergia() {
        return this.energiaNecesaria;
    }
}
