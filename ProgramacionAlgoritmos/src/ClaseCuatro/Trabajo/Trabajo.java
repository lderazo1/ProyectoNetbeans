package ClaseCuatro.Trabajo;
public class Trabajo {

    public int id;
    public String descripcion;
    public double numeroHoras;
    public String estado;
    public double costoTrabajo;
    public int plazo;

    public Trabajo() {
    }

    public Trabajo(int id, String descripcion, double numeroHoras, String estado,
            double costoTrabajo, int plazo) {
        this.id = id;
        this.descripcion = descripcion;
        this.numeroHoras = numeroHoras;
        this.estado = estado;
        this.costoTrabajo = costoTrabajo;
        this.plazo = plazo;
    }

    public String aumentarHoras(double numeroHoras) {
        String msj = "Error, estado del trabajo: finalizado";
        if (!this.estado.equals("finalizado")) {
            this.numeroHoras += numeroHoras;
            msj = "Horas actualizadas con: " + numeroHoras;
        }
        return msj;
    }

    public double calcularCosto() {
        costoTrabajo = numeroHoras * 30;
        return costoTrabajo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String toString() {
        return String.format("Id: %d \nDescripcion: %s"
                + "\nNumero de horas: %.2f"
                + "\nEstado: %s \nCosto de trabajo: %.2f"
                + "\nPlazo: %d\n", id, descripcion, numeroHoras,estado, costoTrabajo, plazo);
    }
    
}
class ReparacionMecanica extends Trabajo {

    public double precioMaterial;

    public ReparacionMecanica() {
    }

    public ReparacionMecanica(double precioMaterial) {
        this.precioMaterial = precioMaterial;
    }

    public ReparacionMecanica(double precioMaterial,
            int id, String descripcion,
            double numeroHoras, String estado,
            double costoTrabajo, int plazo) {
        super(id, descripcion, numeroHoras, estado, costoTrabajo, plazo);
        this.precioMaterial = precioMaterial;
    }

    @Override
    public double calcularCosto() {
        this.costoTrabajo = super.calcularCosto() + (costoTrabajo * 1.1);
        return this.costoTrabajo;
    }

    public String aumentarPrecioMat(double precioMaterial) {
        String msj = "Error, estado del trabajo: finalizado";
        if (!this.estado.equals("finalizado")) {
            this.precioMaterial += precioMaterial;
            msj = "Precio del material aumentado con: $" + precioMaterial;
        }
        return msj;
    }

    @Override
    public String toString() {
        return String.format("%s \nPrecio de material: $%.2f",
                super.toString(), precioMaterial);
    }
}

class ReparacionChapasPintura extends Trabajo {

    public double precioMaterial;

    public ReparacionChapasPintura() {
    }

    public ReparacionChapasPintura(double precioMaterial) {
        this.precioMaterial
                = precioMaterial;
    }

    public ReparacionChapasPintura(double precioMaterial,
            int id, String descripcion,
            double numeroHoras, String estado,
            double costoTrabajo, int plazo) {
        super(id, descripcion, numeroHoras, estado, costoTrabajo, plazo);
        this.precioMaterial
                = precioMaterial;
    }

    public double calcularCostoTrabajo() {
        this.costoTrabajo
                = super
                        .calcularCosto()
                + (costoTrabajo
                * 1.3);
        return this.costoTrabajo;
    }

    public String aumentarPrecioMat(double precioMaterial) {
        String msj
                = "Error, estado del trabajo: finalizado";
        if (!this.estado
                .equals(
                        "finalizado")) {
            this.precioMaterial += precioMaterial;
            msj = "Precio del material aumentado con: $" + precioMaterial;
        }
        return msj;
    }

    @Override
    public String toString() {
        return String.format("%s\nPrecio de material: &%.2f",
                super.toString(), precioMaterial);
    }
}

class Revision extends Trabajo {

    public Revision() {
    }

    @Override
    public double calcularCosto() {
        this.costoTrabajo
                = super
                        .calcularCosto()
                + (this.numeroHoras
                * 20);
        return this.costoTrabajo;
    }
}

class PruebaTrabajos {

    public static void main(String[] args) {
        ReparacionMecanica reparacionMecan1 = new ReparacionMecanica(100, 0, "Es mi reparacionMecan1", 10, "Iniciado", 0, 14);
        System.out.println("\nREPARACION MECAN.1\n == == == == == == == == ==\n" + reparacionMecan1);
        reparacionMecan1.calcularCosto();
        System.out.println("\nREPARACION MECAN.1 <costoTrab.Update >"
                + "\n == == == == == == == == ==\n" + reparacionMecan1);
        System.out.println("\n" + reparacionMecan1.aumentarPrecioMat(15));
        System.out.println("\nREPARACION MECAN.1\n" + "==================\n" + reparacionMecan1);
        System.out.println("\n"+reparacionMecan1.aumentarHoras(25));
        System.out.println("\nREPARACION MECAN.1\n" + "==================\n" + reparacionMecan1);
        reparacionMecan1.setEstado("finalizado");
        System.out.println("\n" + reparacionMecan1.aumentarHoras(25));
    }
}
