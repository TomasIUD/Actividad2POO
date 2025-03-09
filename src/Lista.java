import java.util.List;
import java.util.ArrayList;

public class Lista {
    private List<Persona> personas = new ArrayList<>();

    public void agregarPersona(Persona persona) {
        this.personas.add(persona);
    }

    public void mostrarPersonas() {
        System.out.println("Personas capturadas:");
        for (Persona p : personas) {
            System.out.println(p);
        }
    }

    public double promedioEdades() {
        double sumaEdades = 0;
        for (Persona p : personas) {
            sumaEdades += p.getEdad();
        }
        return sumaEdades / personas.size();
    }

    public int cantidadMasculinos() {
        int cantidad = 0;
        for (Persona p : personas) {
            if (p.getGenero().equalsIgnoreCase("Masculino")) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public int cantidadFemeninos() {
        int cantidad = 0;
        for (Persona p : personas) {
            if (p.getGenero().equalsIgnoreCase("Femenino")) {
                cantidad++;
            }
        }
        return cantidad;
    }
}
