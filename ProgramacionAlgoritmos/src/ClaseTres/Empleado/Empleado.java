/*
    Nombre:         Luis Daniel Erazo A.
    Fecha:          Lunes 22 de octubre del 2018
    Asignatura:     Programación de Algoritmos
 */
package ClaseTres.Empleado;

public class Empleado {

    public String PrimerNom;
    public String ApPat;
    public double salario;
    
    public Empleado(String PrimerNom, String ApPat, double salario) {
        this.PrimerNom = PrimerNom;
        this.ApPat = ApPat;
        setSalario(salario);
    }

    public String getPrimerNom() {
        return PrimerNom;
    }

    public void setPrimerNom(String PrimerNom) {
        this.PrimerNom = PrimerNom;
    }

    public String getApPat() {
        return ApPat;
    }

    public void setApPat(String ApPat) {
        this.ApPat = ApPat;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            this.salario = 0;
        } else {
            this.salario = salario;
        }    
    }

    public double salarioAnual(double salario) {
        double salarioAnio;
        salarioAnio = salario * 12;
        return salarioAnio;
    }

    public double salarioAumento(double anioSalario) {
        double saldoAumento;
        saldoAumento = anioSalario + (anioSalario * 0.10f);
        return saldoAumento;
    }
}
