package ec.edu.ups.poo.clases;

public class Persona {
    //Atributos (Siempre el inicoo de la clase)
    // no tiene un valor inicial, al caso que sea un caso especial
    // los atributos siemore tiene que ser privados

    private String cedula;
    private String nombre;
    private String apellido;
    private String direccion;

    // Contructores siempre en medio de los atributos y los getter y setter
    // tiene que tener la palabra public y no devuelve nada
    // exatamente el dombre de la clase
    // puede haber mas de un construcitor
    public Persona(String cedula) {
        this.cedula = cedula;
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String nombre, String apellido, String cedula, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
    }

    public Persona() {
    }

    // Set-----------------------------------------------------

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    // Get ----------------------------------------------------

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Cedula: " + cedula + "\n" +
                "Nombre: " + nombre +
                "Apellido: " + apellido +
                "Direccion: " + direccion;

    }
}
