package local.cdm.energias;

import java.util.Scanner;
import local.cdm.fluidos.*;

public class Principal {

    public static void main(String[] args) throws NoSePuedeMezclarException {

        Scanner sc = new Scanner(System.in);
        Persona p = new Persona("Pepe", 100.0);
        ExamenPractico ep = new ExamenPractico("Programacion", 120);
        PartidoFutbol partido = new PartidoFutbol(1);
        String input;

        p.addTarea(ep);
        p.addTarea(partido);

        while (!p.getTareas().isEmpty()) {
            p.hacerTareas();

            while (p.getEnergia() == 0) {
                System.out.println("Elija una bebida: ");
                System.out.println("1: Agua");
                System.out.println("2: Cola");
                System.out.println("3: Vodka");
                System.out.println("4: Ron");
                System.out.println("5: Copa");
                System.out.println("6: Lejía");

                input = sc.nextLine();

                switch (input) {
                    case "1":
                        p.beber(new Agua(100.0));
                        break;
                    case "2":
                        p.beber(new Cola(100.0, "Negro"));
                        break;
                    case "3":
                        p.beber(new Vodka(1.0, 100.0));
                        break;
                    case "4":
                        p.beber(new Ron(1.0, 100.0));
                        break;
                    case "5":
                        p.beber(new Copa(new Vodka(1.0, 50.0), new Agua(50.0)));
                        break;
                    case "6":
                        System.out.println("No puedes beber lejía");
                        break;
                }
                
                if (p.getEstadoVejiga().equals(p.getCapacidadVejiga())) {
                    System.out.println("Vejiga llena! Quieres evacuar? (S/N)");
                    input = sc.nextLine();
                    
                    if (input.toUpperCase().equals("S")) {
                        p.vaciarVejiga();
                    } else {
                        break;
                    }
                }

            }
        }

    }
}
