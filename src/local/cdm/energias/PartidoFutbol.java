package local.cdm.energias;

public class PartidoFutbol implements Accion {

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
        this.energiaNecesaria = 40 * categoria;
    }

    @Override
    public String hacer() {
        String salida = "Jugando partido de categoria" + categoria;
        if (prorroga = true) {
            salida = "Jugando partido de categoria" + categoria + "prórroga";
            if (penaltis = true) {
                salida = "Jugando partido de categoria" + categoria + "prórroga y penaltis";
            }
        }
        return salida;
    }

    public boolean isProrroga() {
        return prorroga;
    }

    public void setProrroga(boolean prorroga) {
        if (this.prorroga != prorroga) {
            this.prorroga = prorroga;
            if (this.prorroga) {
                this.energiaNecesaria += this.energiaNecesaria * 0.15;
            } else {
                this.energiaNecesaria -= this.energiaNecesaria * 0.15;
            }
        }
    }

    public boolean isPenaltis() {
        return penaltis;
    }

    public void setPenaltis(boolean penaltis) {
        if (this.penaltis != penaltis) {
            this.penaltis = penaltis;
            if (penaltis == true) {
                setProrroga(true);
                this.energiaNecesaria += this.energiaNecesaria * 0.05;
            } else {
                this.energiaNecesaria -= this.energiaNecesaria * 0.05;
            }
        }
    }

    @Override
    public Integer getEnergia() {
        return this.energiaNecesaria;
    }
}
