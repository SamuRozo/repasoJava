package I_Herencia_Polimorfismo;

public class Super_Animal {
    void comer() {
        System.out.println("El animal está comiendo.");
    }
}

class Perrito extends Super_Animal {
    @Override
    void comer() {
        super.comer();  // Llama al método de la clase padre
        System.out.println("El perro está comiendo croquetas.");
    }

}
