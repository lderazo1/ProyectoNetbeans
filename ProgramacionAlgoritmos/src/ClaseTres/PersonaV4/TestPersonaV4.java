/*
    Nombre:         Luis Daniel Erazo A.
    Fecha:          Lunes 22 de octubre del 2018
    Asignatura:     Programación de Algoritmos
 */

package ClaseTres.PersonaV4;
public class TestPersonaV4 {

    public static void main(String[] args) {
        System.out.println("Nombre de empresa de Personas <" + PersonaV4.nombreEmpresa + ">");
        PersonaV4 personaA = new PersonaV4("M",4);
        System.out.println("Nombre de empresa de Personas <" + PersonaV4.nombreEmpresa + ">");
        PersonaV4 personaB = new PersonaV4();
        System.out.println("Nombre de empresa de Personas <" + personaB.getNombreEmpresa() + ">");
    }
}
