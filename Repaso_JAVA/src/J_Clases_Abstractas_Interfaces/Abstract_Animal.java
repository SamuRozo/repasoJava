package J_Clases_Abstractas_Interfaces;

public abstract class Abstract_Animal {
    abstract double calcularArea();

    abstract void hacerSonido(); // Método abstracto

    void dormir() { // Método concreto
        System.out.println("El animal está durmiendo.");
    }
}

class Perro extends Abstract_Animal {
    @Override
    void hacerSonido() {
        System.out.println("El perro ladra.");
    }
}


