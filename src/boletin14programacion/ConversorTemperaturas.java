
package boletin14programacion;

/**
 *
 * @author Brais Núñez
 */
public class ConversorTemperaturas {
    
    private final int temperatura = 80;

    public float centigradosAFharenheit (float tempC)throws TemperaturaErradaExcepcion{
    
        if (tempC<temperatura){
            
          throw new TemperaturaErradaExcepcion();
        }
     
        return (float)((9.0/5.0)*(tempC + 32.4));
 }
    public float centigradosAReaumur (float tempC){
        
        return (float)(4.0 / 5.0) * tempC;
        }
}
