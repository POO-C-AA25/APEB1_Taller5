import java.util.Arrays;
import java.util.ArrayList;

public class Problema6_EjecutorActividades {
    public static ArrayList<Participante> listaParc;
    public static void main(String[] args) {
        listaParc = new ArrayList<Participante>();
        
        ArrayList <Participante> participantes1 = new ArrayList<>(
                                                        Arrays.asList(new Participante("P1", 2, 10),
                                                                      new Participante("P2", 3, 5 ),
                                                                      new Participante("P3", 5, 7 )));
        ArrayList <Participante> participantes2 = new ArrayList<>(
                                                        Arrays.asList(new Participante("P1", 2, 10),
                                                                      new Participante("P4", 3, 5 ),
                                                                      new Participante("P5", 5, 7 )));
        ArrayList <Participante> participantes3 = new ArrayList<>(
                                                        Arrays.asList(new Participante("P6", 2, 10),
                                                                      new Participante("P7", 3, 9 ),
                                                                      new Participante("P1", 5, 10)));
        
        
    }
    public static void calculoEstaditicas(){
        
    }
}
class Participante{
    public String nombrePar;
    public int asistencia;
    public int puntaje;
    public double promedioRendimiento;
    public int numeroPruebasSuperadas;
    public Participante(String nombrePar, int asistencia, int puntaje) {
        this.nombrePar = nombrePar;
        this.asistencia = asistencia;
        this.puntaje = puntaje;
    }
}
class Actividad{
    public String nombreAct;
    public ArrayList<Participante> participantes;
    ArrayList<Participante> participantesDestacados;

    public Actividad(String nombreAct, ArrayList<Participante> participantes) {
        this.nombreAct = nombreAct;
        this.participantes = participantes;
    }
    public void definirParticipanteDestacados(){
        for (Participante participante : participantes){
            if (participante.puntaje >=9 )
                participantesDestacados.add(participante);
        }
    }
}