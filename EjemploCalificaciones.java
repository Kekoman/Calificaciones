package calificaciones;
import java.util.*;

/**
 *
 * @author Sergio Garza
 */
public class EjemploCalificaciones {
    String nombre = ""; 
    int[] calif= new int[5];

    public static void main(String[] args) {
        
        String capturaNombre=""; 
        float promedioResult = 0; 
        char califNota=' '; 
        
        Calificaciones pCalculoCalif = new Calificaciones(); 
        System.out.print("CALIFICACIONES UNIVERSIDAD TECMILENIO\n");
       
        Scanner s = new Scanner(System.in);
        System.out.println("Nombre del alumno: ");
        capturaNombre = s.next(); 
        pCalculoCalif.setNombre(capturaNombre);
        
        pCalculoCalif.setCalificaciones();
        promedioResult = pCalculoCalif.promedioCal(); 
        califNota = pCalculoCalif.calificaciones(promedioResult);
        pCalculoCalif.imprime(promedioResult, califNota);
    }
    
}
