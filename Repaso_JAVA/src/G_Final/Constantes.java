package G_Final;
//final en atributos: Define constantes; su valor no puede cambiar una vez asignado.
//final en métodos: Evita que un método sea sobrescrito en las subclases.
//final en clases: Evita que una clase sea heredada.

public class Constantes {
    final double PI = 3.1416; // Una constante, su valor no puede cambiar

    final void mostrarConstante() {
        System.out.println("El valor de PI es: " + PI);
    }
}
