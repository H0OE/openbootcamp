package ejercicio_tema_8;

public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona(20, "Juan", 123456789);

        persona.setEdad(10);
        persona.setNombre("Pedro");
        persona.setTelefono(987654321);

        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Teléfono: " + persona.getTelefono());
    }
}
