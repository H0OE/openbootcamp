package ejercicio_tema_4;

public class Main {
    public static void main(String[] args) {
        int numeroIf = 12;
        int numeroWhile = 0;
        int numeroDo = 6;
        int estacion = 1;

        if (numeroIf < 0) {
            System.out.println("El numeroIf es negativo");
        } else if (numeroIf > 0) {
            System.out.println("El numeroIf es positivo");
        } else {
            System.out.println("El numeroIf es cero");
        }

        while (numeroWhile < 3) {
            System.out.println("El numeroWhile es: " + numeroWhile);
            numeroWhile++;
        }

        do {
            System.out.println("El numeroDo es: " + numeroDo);
            numeroDo++;
        } while (false);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("El numeroFor es: " + numeroFor);
        }

        switch (estacion) {
            case 1:
                System.out.println("Estamos en  primavera");
                break;
            case 2:
                System.out.println("Estamos en Otoño");
                break;
            case 3:
                System.out.println("Estamos en Invierno");
                break;
            case 4:
                System.out.println("Estamos en Verano");
                break;
            default:
                System.out.println("No estamos en ninguna estacion");
                break;
        }

    }
}
