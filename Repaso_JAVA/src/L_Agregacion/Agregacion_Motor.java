package L_Agregacion;

public class Agregacion_Motor {
    String tipo;

    Agregacion_Motor(String tipo) {
        this.tipo = tipo;
    }
}

class Coche {
    Agregacion_Motor motor;

    Coche(Agregacion_Motor motor) {
        this.motor = motor;
    }

    void mostrarDetalles() {
        System.out.println("Tipo de motor: " + motor.tipo);
    }

}
