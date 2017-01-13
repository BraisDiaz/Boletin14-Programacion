
package boletin14programacion;

/**
 *
 * @author Brais Núñez
 */
public class Boletin14Programacion {
    
    public static void main(String[] args) {
     
        ConversorTemperaturas conv1 = new ConversorTemperaturas();
        
        try{
            System.out.println("A cantidade en graos fharenheit é de " + conv1.centigradosAFharenheit(85));
            System.out.println("A cantidade en graos reaumur é de " + conv1.centigradosAReaumur(55));
        }
        catch (TemperaturaErradaExcepcion e){
            System.out.println(e.toString());
        }
}
}
