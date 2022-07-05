package ejercicio_tema_3;

public class Coche {
    int puertas;

    // Declaración del constructor de clase
    public Coche(int puertas) {
        this.puertas = puertas;
    }

    public void puertasMasUno() {
        puertas++;
    }

    public int getPuertas() {
        return puertas;
    }

}
