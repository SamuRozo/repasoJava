package F_Modificadores_Acceso;

public class ModificadorPersona {
    public String nombre;      // Accesible desde cualquier parte
    protected int edad;        // Accesible desde el mismo paquete y subclases
    private double salario;    // Accesible solo desde la clase ModificadorPersona

    public void mostrarSalario() {
        System.out.println("Salario: " + salario);
    }
}

