package ec.edu.ups.poo.principal;
//Hola
import ec.edu.ups.poo.clases.Familiar;
import ec.edu.ups.poo.clases.Persona;//se importa porque estan en paquetes diferentes

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setCedula("02002020");
        persona.setNombre("Jose");
        persona.setApellido("Perez");
        persona.setDireccion("Loja");




        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingreseel numero de familiares");
        int numeroFamilares = scanner.nextInt();
        Familiar[] familiares = new Familiar[numeroFamilares];
        scanner.nextLine();
        for (int i = 0; i < numeroFamilares; i++) {

            System.out.println("Ingrese el numero de cedula");
            String cedula = scanner.nextLine();
            System.out.println("Ingrese el nombre");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese el apellido");
            String apellido = scanner.nextLine();
            System.out.println("Ingrese la direccion");
            String direccion = scanner.nextLine();
            System.out.println("Ingrese el parentesco");
            String parentesco = scanner.nextLine();
            System.out.println("Ingrese el Tipo de Sangre");
            String tipoDeSangre = scanner.nextLine();
            System.out.println("Ingrese la fecha de nacimiento");
            System.out.println("Ingrese el anio de nacimiento");
            int anio = scanner.nextInt();
            System.out.println("Ingrese el mes de nacimiento");
            int mes = scanner.nextInt();
            System.out.println("Ingrese el dia de nacimiento");
            int dia = scanner.nextInt();
            GregorianCalendar fechaDeNacimiento = new GregorianCalendar(anio, mes - 1, dia);

            Familiar familiar = new Familiar(nombre, apellido, cedula, direccion, tipoDeSangre, parentesco, fechaDeNacimiento);
            familiares[i] = familiar;
        }
        // Imprimir sin toString
//        for (int i = 0; i <numeroFamilares;i++){
//            System.out.println(familiares[i].getCedula());
//            System.out.println(familiares[i].getNombre());
//            System.out.println(familiares[i].getApellido());
//            System.out.println(familiares[i].getDireccion());
//            System.out.println(familiares[i].getParentesco());
//            System.out.println(familiares[i].getTipoDeSangre());
//            System.out.println(familiares[i].calcularEdad(familiares[i].getFechaDeNacimiento()));
//        }
        //Imprimir con el toString

        for (int i = 0; i < numeroFamilares; i++) {
            System.out.println(familiares[i].toString());
        }

        System.out.println("Ingrese el numero de personas: ");
        int numeroPersonas = scanner.nextInt();
        scanner.nextLine();
        Persona[] personas = new Persona[numeroPersonas];
        for (int i = 0; i < numeroPersonas; i++) {

            Persona persona = new Persona();
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.println("Ingrese el numero de cedula");
            String cedula = scanner.nextLine();
            System.out.println("Ingrese el nombre");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese el apellido");
            String apellido = scanner.nextLine();
            System.out.println("Ingrese la direccion");
            String direccion = scanner.nextLine();

            persona.setCedula(cedula);
            persona.setNombre(nombre);
            persona.setApellido(apellido);
            persona.setDireccion(direccion);


            personas[i] = persona;
        }
        // Imprimir sin el toString
//        for (int i = 0; i < numeroPersonas; i++) {
//            System.out.println("--------------------------------------------------------------------------------------");
//            System.out.println(personas[i].getCedula());
//            System.out.println(personas[i].getNombre());
//            System.out.println(personas[i].getApellido());
//            System.out.println(personas[i].getDireccion());
//        }
        //Imprimir con el toString
        for (int i = 0; i < numeroPersonas; i++) {
            System.out.println(personas[i].toString());
        }
    }
}