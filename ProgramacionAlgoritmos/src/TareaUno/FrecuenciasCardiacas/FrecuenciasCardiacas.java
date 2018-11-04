/*
*   Nombre:         Luis Daniel Erazo A.            *
*   Fecha:          Martes 30 de octubre del 2018   *
*   Asignatura:     Programación de Algoritmos      *
*/ 
package TareaUno.FrecuenciasCardiacas;

import java.util.Calendar;

public class FrecuenciasCardiacas {
    private String pNombre;
    private String apellido;
    private int anio;
    private int mes;
    private int dia;

    public FrecuenciasCardiacas(){
    }
    
    public FrecuenciasCardiacas(String pNombre, String Apellido, int anio, int mes, int dia) {
        this.pNombre = pNombre;
        this.apellido = Apellido;
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
    }

    public String getpNombre() {
        return pNombre;
    }

    public void setpNombre(String pNombre) {
        this.pNombre = pNombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String Apellido) {
        this.apellido = Apellido;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    
    public int calculoEdad (int anio,int mes,int dia){
        
        Calendar actual = Calendar.getInstance();
        
        // Cálculo de las diferencias.
        int anioAc = actual.get(Calendar.YEAR) - anio;
        int mesAc = actual.get(Calendar.MONTH) - mes;
        int diaAc = actual.get(Calendar.DAY_OF_MONTH) - dia;
 
        if(mes < 0 // Aún no es el mes de su cumpleaños
           || (mes==0 && dia < 0)) { // o es el mes pero no ha llegado el día.
            anioAc--;
        }
        return anioAc;
    }
    
    public double calculoFrecuencia(int anioAc){
        int fcpm = 220 - anioAc; //Declaracion Frecuencia Cardiaca por Minuto
        return fcpm;
    }
    
    public void calculoFrecEsperad(double fcpm){
        double rango = 0.5f,rangoDos = 0.15f,fEsperada,fMaxima;
        fEsperada = (fcpm * rango);
        fMaxima = fcpm - (fcpm*rangoDos);
        System.out.printf("La Frecuencia cardiaca esperada va desde los %.2f hasta los %.2f fcpm\n---\n",fEsperada,fMaxima);
    }
    
    public void presentarMsj(String pNombre,String apellido,int dia,int mes,int anio,int anioAc){
        System.out.println("Primer Nombre: "+pNombre);
        System.out.println("Apellido: "+apellido);
        System.out.printf("Fecha de Nacimiento: %d/%d/%d\n",dia,mes,anio);        
    }
}
