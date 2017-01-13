
package boletin14programacion;

/**
 *
 * @author Brais Núñez
 */
public class ConversorTemperaturas {
    
    private final int TEMPERATURA = 80;

    public float centigradosAFharenheit (float tempC)throws TemperaturaErradaExcepcion{
    
        if (tempC<TEMPERATURA){
            
          throw new TemperaturaErradaExcepcion();
        }
     
        return (float)((9.0/5.0)*(tempC + 32.4));
 }
    public float centigradosAReaumur (float tempC){
        
        return (float)(4.0 / 5.0) * tempC;
        }
}
