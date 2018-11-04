/*
*   Nombre:         Luis Daniel Erazo A.            *
*   Fecha:          Martes 30 de octubre del 2018   *
*   Asignatura:     Programación de Algoritmos      *
*/ 
package TareaUno.CuentaDeAhorros;
public class CuentaDeAhorros {

    private float saldoDeAhorros;
    public static float tasaInteresAnual;

    public CuentaDeAhorros(float saldoDeAhorros) {
        this.saldoDeAhorros = saldoDeAhorros;
    }
    
    public float calcularlnteresMensual (){
        float intMensual;
        intMensual = ((saldoDeAhorros*tasaInteresAnual)/12)+ saldoDeAhorros;
        return intMensual;
    }
    
    public static void modificarTasalnteres (float porcentaje){
        tasaInteresAnual = porcentaje;
    }
    
    
}
