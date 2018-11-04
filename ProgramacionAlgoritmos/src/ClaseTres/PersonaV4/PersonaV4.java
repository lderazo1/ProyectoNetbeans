/*
    Nombre:         Luis Daniel Erazo A.
    Fecha:          Lunes 22 de octubre del 2018
    Asignatura:     Programación de Algoritmos
 */
package ClaseTres.PersonaV4;

public class PersonaV4 {

    //Atributos ó campos
    public static String nombreEmpresa;
    public String sexo;
    public int edad;

    //Constructores
    public PersonaV4() {
    }

    public PersonaV4(String sexo, int edad) {
        nombreEmpresa = "UTPL";
        this.sexo = sexo;
        this.edad = edad;
    }

    //Métodos estaticos y no estaticos
    public static double calcularEdad(int anioNacimiento) {
        int edad = 2015 - anioNacimiento;
        return edad;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }
}
