package I_Herencia_Polimorfismo;

public class Animal {
    // Clase padre
        String nombre;

        void hacerSonido() {
            System.out.println("El animal hace un sonido.");
        }
    }

    // Clase hija
    class Perro extends Animal {
        void ladrar() {
            System.out.println("El perro ladra.");
        }
    }

