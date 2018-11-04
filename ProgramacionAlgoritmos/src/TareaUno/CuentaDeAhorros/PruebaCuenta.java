/*
*   Nombre:         Luis Daniel Erazo A.            *
*   Fecha:          Martes 30 de octubre del 2018   *
*   Asignatura:     Programación de Algoritmos      *
 */
package TareaUno.CuentaDeAhorros;

public class PruebaCuenta {

    public static void main(String[] args) {
        CuentaDeAhorros ahorradorUno = new CuentaDeAhorros(2000);
        CuentaDeAhorros ahorradorDos = new CuentaDeAhorros(3000);
        
        CuentaDeAhorros.modificarTasalnteres(0.04f);
        
        System.out.println("---\nDatos del Banco");
        System.out.println("---\nMes 1:\n---");
        System.out.printf("Tasa 0.4\nSaldo Total ahorrador 1 añadido interés mensual es: %.2f\n" , ahorradorUno.calcularlnteresMensual());
        System.out.printf("Saldo Total ahorrador 2 añadido interés mensual es: %.2f\n" , ahorradorDos.calcularlnteresMensual());
                
        CuentaDeAhorros.modificarTasalnteres(0.05f);
        
        System.out.println("---\nMes 2:\n---");
        System.out.printf("Tasa 0.5\nSaldo Total ahorrador 1 añadido interés mensual es: %.2f\n" , ahorradorUno.calcularlnteresMensual());
        System.out.printf("Saldo Total ahorrador 2 añadido interés mensual es: %.2f\n---\n" , ahorradorDos.calcularlnteresMensual());
    }
}
