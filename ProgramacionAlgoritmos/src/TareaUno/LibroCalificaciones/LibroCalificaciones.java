/*
*   Nombre:         Luis Daniel Erazo A.            *
*   Fecha:          Martes 30 de octubre del 2018   *
*   Asignatura:     Programación de Algoritmos      *
 */
package TareaUno.LibroCalificaciones;
public class LibroCalificaciones {

    private String nombreDelCurso; // nombre del curso para este LibroCalificaciones
    private String nombreInstructor; // nombre del instructor de curso

    // el constructor inicializa nombreDelCurso con un argumento String
    public LibroCalificaciones(String nombre, String nInstructor) // el nombre del constructor es el nombre de la clase
    {
        nombreDelCurso = nombre; // inicializa nombreDelCurso
        nombreInstructor = nInstructor; //Inicializa nInstructor
    } // fin del constructor

    // método para establecer el nombre del curso
    public void establecerNombreDelCurso(String nombre) {
        nombreDelCurso = nombre; // almacena el nombre del curso
    } // fin del método establecerNombreDelCurso

    // método para establecer el nombre del instructor
    public void establecerNombreInstructor(String nInstructor) {
        nombreInstructor = nInstructor; // almacena el nombre del instructor
    } // fin del método establecerNombreInstructor

    // método para obtener el nombre del curso
    public String obtenerNombreDelCurso() {
        return nombreDelCurso;
    } // fin del método obtenerNombreDelCurso

    // método para obtener el nombre del Instructor
    public String obtenerNombreInstructor() {
        return nombreInstructor;
    } // fin del método obtenerNombreDelInstructor    

    // muestra un mensaje de bienvenida al usuario de LibroCalificaciones
    public void mostrarMensaje() {
        // esta instrucción llama a obtenerNombreDelCurso para obtener el 
        // nombre del curso que este LibroCalificaciones representa
        System.out.printf("Bienvenido al Libro de calificaciones para: %s\nEste curso es presentado por: %s\n---\n", obtenerNombreDelCurso(), obtenerNombreInstructor());
    } // fin del método mostrarMensaje
} // fin de la clase LibroCalificaciones