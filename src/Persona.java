/* 1) Realizar un programa de consola que permita realizar las siguientes operaciones "Las X representan lo que ya he realizado"

a) Realizar una clase que permita capturar el nombre, apellido, genero, edad, estas propiedades deberán ser
definidas mediante el modificador de acceso Privado y permitir que la instancia del objeto
creada pueda realizarse directamente mediante la utilización de un metodo constructor. X

b) Realizar un metodo que permita Capturar y retornar el nombre y el género de 5 personas capturadas por teclado. X

c) Realizar un metodo que permita retornar el promedio de las edades capturadas. X

d) Realizar un metodo que permita retornar la cantidad de personas con género Masculino. X

e) Realizar un metodo que permita retornar la cantidad de personas con género Femenino. X */

public class Persona {
    private String nombre;
    private String apellido;
    private String genero;
    private int edad;

    // Constructor de la clase Persona
    public Persona(String nombre, String apellido, String genero, int edad ) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.edad = edad;

    }

    // Métodos getter para obtener los valores de los atributos
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }


    // Método toString para representar la información del vehículo en texto
    @Override
    public String toString() {
        return "[Nombre: " + nombre + ", Apellido: " + apellido + ", Genero: " + genero + ", Edad: " + edad + "]";
    }
}