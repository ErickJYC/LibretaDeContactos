package ec.edu.ups.poo.clases;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Familiar extends Persona {
    private String parentesco;
    private String tipoDeSangre;
    private GregorianCalendar fechaDeNacimiento;

    public Familiar() {
    }

    public Familiar(String nombre, String apellido, String cedula, String direccion, String tipoDeSangre, String parentesco, GregorianCalendar fechaDeNacimiento) {
        super(nombre, apellido, cedula, direccion);
        this.tipoDeSangre = tipoDeSangre;
        this.parentesco = parentesco;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getTipoDeSangre() {
        return tipoDeSangre;
    }

    public void setTipoDeSangre(String tipoDeSangre) {
        this.tipoDeSangre = tipoDeSangre;
    }

    public GregorianCalendar getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(GregorianCalendar fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    //    Hacer formato fecha con dia/mes/ano
//    public static String formatoFecha(GregorianCalendar fechaDeNacimiento){
//        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//        // Mostrar la fecha formateada
//        String fechaFormateada;
//        fechaFormateada = dateFormat.format(fechaDeNacimiento.getTime());
//        return fechaFormateada;
//    }
    //Metodo calcular edad
    public double calcularEdad() {
        double edad = 0;
        GregorianCalendar today = new GregorianCalendar();
        long diffMillis = today.getTimeInMillis() - fechaDeNacimiento.getTimeInMillis();
        long diffDays = diffMillis / (24 * 60 * 60 * 1000);
        edad = diffDays / 365.25;
        return edad;
    }

    @Override
    public String toString() {
        return
                super.toString() +// llamar al toString del la calse padre que es "Persona"
                        " parentesco='" + parentesco + '\'' +
                        ", tipoDeSangre='" + tipoDeSangre + '\'' +
                        " edad= " + calcularEdad();
    }
}
