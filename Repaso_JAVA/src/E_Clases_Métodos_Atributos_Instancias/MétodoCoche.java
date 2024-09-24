package E_Clases_Métodos_Atributos_Instancias;

public class MétodoCoche {
    String marca;
    String modelo;

    void arrancar() {
        System.out.println("El coche ha arrancado.");
    }
    void mostrarDetalles() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }
    //Objetos:
    public static void main(String[] args) {
        MétodoCoche miCoche = new MétodoCoche();
        miCoche.marca = "Toyota";
        miCoche.modelo = "Corolla";
        miCoche.arrancar();  // Llamada al método

    }
}

