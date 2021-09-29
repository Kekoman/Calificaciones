package calificaciones; 
import java.util.*;

/** 
 * 
 * @author Sergio Garza
 */

public class Calificaciones {
    
    String nombre = ""; 
    int[] calif= new int[5];
    
    public float promedioCal(){
        float promedio = 0;
        int suma = 0; 
        
        for (int i=0; i<calif.length; i++) {
            suma += calif[i];
        }
        
        promedio = (suma/calif.length);
    
        return promedio; 
    }
    
    public char calificaciones(float pPromedio) {
        char nota=' '; 
  
     if (pPromedio <= 50) {
            nota = 'F';
        } else if (pPromedio <= 60 ){
            nota = 'E';
        } else if (pPromedio <= 70 ){
            nota = 'D';
        } else if (pPromedio <= 80 ){
            nota = 'C';
        } else if (pPromedio <= 90 ){
            nota = 'B';
        } else {
            nota = 'A';
        }
        return nota; 
    }

    public void imprime (float pPromedio, char pNota) {
         System.out.println("Promedio: " + pPromedio);
         System.out.println("Calificación: " + pNota);
     
    }

    public void setNombre(String pNombre) {
        nombre = pNombre; 
    }
    
    public void setCalificaciones() {
        Scanner s = new Scanner (System.in);
        
        System.out.println("Calificacion 1: ");
        calif[0]=s.nextInt(); 
        
        System.out.println("Calificacion 2: ");
        calif[1]=s.nextInt();
        
        System.out.println("Calificacion 3: ");
        calif[2]=s.nextInt();
        
        System.out.println("Calificacion 4: ");
        calif[3]=s.nextInt();
        
        System.out.println("Calificacion 5: ");
        calif[4]=s.nextInt();
    }
}
