package ejercicio_tema_9;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Cliente cliente = new Cliente(20, "Juan", 123456789, 1000);
        System.out.println("Cliente: " + cliente.getNombre() + " Edad: " + cliente.getEdad() + " Telf.:" + cliente.getTelefono()
                + " Credito " + cliente.getCredito());
        Trabajador trabajador = new Trabajador(30, "Pedro", 123456789, 1000);
        System.out.println("Trabajador: " + trabajador.getNombre() + " Edad: " + trabajador.getEdad() + " Telf.:"
                + trabajador.getTelefono() + " Salario: " + trabajador.getSalario());
    }

}
