/*
*   Nombre:         Luis Daniel Erazo A.            *
*   Fecha:          Martes 30 de octubre del 2018   *
*   Asignatura:     Programación de Algoritmos      *
*/
package TareaUno.FrecuenciasCardiacas;

import java.util.Scanner;

public class PruebaFrecuencias {
    public static void main(String[] args) {
        
        String pNombre,apellido;
        int mes,anio,dia;
        int anioAc;
        double fcpm;
        Scanner t = new Scanner (System.in);
        FrecuenciasCardiacas pacienteUno = new FrecuenciasCardiacas();
        
        System.out.println("---\nPrograma de Control de Frecuencia Cardiaca\n---");
        System.out.print("Ingrese su primer nombre: ");
        pNombre = t.next();
        System.out.print("Ingrese su apellido: ");
        apellido = t.next();
        System.out.print("Ingrese su año de nacimiento: ");
        anio = t.nextInt();
        System.out.print("Ingrese su mes de nacimiento: ");
        mes = t.nextInt();
        System.out.print("Ingrese su dia de nacimiento: ");
        dia = t.nextInt();
        anioAc = pacienteUno.calculoEdad(anio, mes, dia);
        System.out.println("---\nResumen Final");
        System.out.printf("---\nEdad actual: %d años\n",anioAc);
        pacienteUno.presentarMsj(pNombre, apellido, dia, mes, anio, anioAc);
        fcpm = pacienteUno.calculoFrecuencia(anioAc);
        System.out.printf("La Frecuencia cardiaca por minuto es: %.2f\n",fcpm);
        pacienteUno.calculoFrecEsperad(fcpm);

    }
        

}
