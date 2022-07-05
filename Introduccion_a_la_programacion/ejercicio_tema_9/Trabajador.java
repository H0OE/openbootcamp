package ejercicio_tema_9;

public class Trabajador extends Persona {
    int salario;

    public Trabajador(int edad, String nombre, int telefono, int salario) {
        super(edad, nombre, telefono);

        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
