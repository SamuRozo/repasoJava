package L_Agregacion;

public class Composicion_Habitacion {
    String nombre;

    Composicion_Habitacion(String nombre) {
        this.nombre = nombre;
    }
}

class Casa {
    Composicion_Habitacion habitacion;

    Casa(Composicion_Habitacion habitacion) {
        this.habitacion = habitacion;
    }
}

