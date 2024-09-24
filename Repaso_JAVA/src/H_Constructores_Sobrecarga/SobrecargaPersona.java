package H_Constructores_Sobrecarga;

public class SobrecargaPersona {
    String nombre;
    int edad;

    // Constructor sin parámetros
    SobrecargaPersona() {
        nombre = "Desconocido";
        edad = 0;
    }

    // Constructor con parámetros
    SobrecargaPersona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}

