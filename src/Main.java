/* 1) Realizar un programa de consola que permita realizar las siguientes operaciones "Las X representan lo que ya he realizado"

a) Realizar una clase que permita capturar el nombre, apellido, genero, edad, estas propiedades deberán ser
definidas mediante el modificador de acceso Privado y permitir que la instancia del objeto
creada pueda realizarse directamente mediante la utilización de un metodo constructor. X

b) Realizar un metodo que permita Capturar y retornar el nombre y el género de 5 personas capturadas por teclado.

c) Realizar un metodo que permita retornar el promedio de las edades capturadas.

d) Realizar un metodo que permita retornar la cantidad de personas con género Masculino.

e) Realizar un metodo que permita retornar la cantidad de personas con género Femenino. */
import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lista lista = new Lista();

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre de la persona " + (i + 1) + ":");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese el apellido de la persona " + (i + 1) + ":");
            String apellido = scanner.nextLine();

            String genero;
            while (true) {
                System.out.println("Ingrese el género de la persona " + (i + 1) + " (Masculino/Femenino):");
                genero = scanner.nextLine();
                if (genero.equalsIgnoreCase("Masculino") || genero.equalsIgnoreCase("Femenino")) {
                    break;
                } else {
                    System.out.println("Género inválido. Por favor, ingrese 'Masculino' o 'Femenino'.");
                }
            }
            int edad;
            while (true) {
                System.out.println("Ingrese la edad de la persona " + (i + 1) + ":");
                String edadInput = scanner.nextLine();
                try {
                    edad = Integer.parseInt(edadInput);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Edad inválida. Por favor, ingrese un número entero.");
                }
            }

            Persona persona = new Persona(nombre, apellido, genero, edad);
            lista.agregarPersona(persona);
        }

        lista.mostrarPersonas();
        System.out.println("Promedio de edades: " + lista.promedioEdades());
        System.out.println("Cantidad de personas con género Masculino: " + lista.cantidadMasculinos());
        System.out.println("Cantidad de personas con género Femenino: " + lista.cantidadFemeninos());
    }
}