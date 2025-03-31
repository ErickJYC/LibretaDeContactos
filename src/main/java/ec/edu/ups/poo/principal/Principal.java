package ec.edu.ups.poo.principal;

import ec.edu.ups.poo.clases.Familiar;
import ec.edu.ups.poo.clases.Persona;//se importa porque estan en paquetes diferentes

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Persona persona = new Persona();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero de familiares");
        int numeroFamilares = scanner.nextInt();
        Familiar[] familiares = new Familiar[numeroFamilares];
        for (int i = 0; i < numeroFamilares; i++) {
            scanner.nextLine();
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

        for (int i = 0; i < numeroFamilares; i++) {
            System.out.println(familiares[i].toString());
        }

        System.out.println("Ingrese el numero de personas: ");
        int numeroPersonas = scanner.nextInt();

        Persona[] personas = new Persona[numeroPersonas];
        for (int i = 0; i < numeroPersonas; i++) {

            System.out.println("--------------------------------------------------------------------------------------");
            scanner.nextLine();
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
        for (int i = 0; i < numeroPersonas; i++) {
            System.out.println(personas[i].toString());
        }
    }
}