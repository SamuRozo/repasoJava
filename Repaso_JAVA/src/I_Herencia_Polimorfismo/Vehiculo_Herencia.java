package I_Herencia_Polimorfismo;

public class Vehiculo_Herencia {
    void mover() {
        System.out.println("El vehículo se está moviendo.");
    }
}

class Bicicleta extends Vehiculo_Herencia {
    void pedalear() {
        System.out.println("La bicicleta está pedaleando.");
    }
}
