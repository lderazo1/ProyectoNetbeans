/*
    Nombre:         Luis Daniel Erazo A.
    Fecha:          Lunes 22 de octubre del 2018
    Asignatura:     Programación de Algoritmos
 */
package ClaseTres.Empleado;

public class PruebaEmpleado {

    public static void main(String[] args) {

        Empleado empleadoA = new Empleado("Luis", "Erazo",120);
        System.out.println(empleadoA.salario);
        Empleado empleadoB = new Empleado("Carlos", "Ortiz", -12);
        System.out.println(empleadoB.salario);
        double salarioanioA = empleadoA.salarioAnual(empleadoA.getSalario());
        double salarioanioB = empleadoB.salarioAnual(empleadoB.getSalario());

        System.out.printf("---\nNombre: %s\nApellido: %s\nSalario: %.2f", empleadoA.getPrimerNom(), empleadoA.getApPat(), empleadoA.getSalario());
        System.out.printf("\nSalario Anual: %.2f", salarioanioA);
        System.out.printf("\nSalario Anual (Aumentado): %.2f", empleadoA.salarioAumento(salarioanioA));
        System.out.printf("\n---\nNombre: %s\nApellido: %s\nSalario: %.2f", empleadoB.getPrimerNom(), empleadoB.getApPat(), empleadoB.getSalario());
        System.out.printf("\nSalario Anual: %.2f", salarioanioB);
        System.out.printf("\nSalario Anual (Aumentado): %.2f\n", empleadoB.salarioAumento(salarioanioB));
    }

}
