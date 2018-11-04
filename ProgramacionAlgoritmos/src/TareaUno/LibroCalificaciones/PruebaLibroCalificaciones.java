/*
*   Nombre:         Luis Daniel Erazo A.            *
*   Fecha:          Martes 30 de octubre del 2018   *
*   Asignatura:     Programación de Algoritmos      *
*/ 
package TareaUno.LibroCalificaciones;
public class PruebaLibroCalificaciones {
    public static void main(String[] args) {
        
        // crea objeto LibroCalificaciones
        LibroCalificaciones libroCalificaciones1 = new LibroCalificaciones("Programación de Algoritmos","Ing. Pedro Irene");
        LibroCalificaciones libroCalificaciones2 = new LibroCalificaciones("Programación Avanzada","Ing. Santiago Quiñonez");

        // muestra el valor inicial de nombreDelCurso para cada LibroCalificaciones
        System.out.println("Programa LibroCalificaciones\n---");
        //Presentación de Datos
        libroCalificaciones1.mostrarMensaje();
        libroCalificaciones2.mostrarMensaje();
    } // fin de main
} // fin de la clase PruebaLibroCalificaciones
