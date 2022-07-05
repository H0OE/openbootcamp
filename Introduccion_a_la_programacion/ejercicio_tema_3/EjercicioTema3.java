package ejercicio_tema_3;

public class EjercicioTema3 {
    public static void main(String[] args) {
        System.out.println("La suma es: " + sum3(2, 1, 6));
        Coche coche = new Coche(1);
        System.out.println("El coche tiene: " + coche.getPuertas());
    }

    public static int sum3(int a, int b, int c) {
        return a + b + c;
    }
}