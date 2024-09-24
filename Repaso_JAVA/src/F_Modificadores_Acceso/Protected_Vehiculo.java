package F_Modificadores_Acceso;

public class Protected_Vehiculo {
    protected String tipo;

    protected void mostrarTipo() {
        System.out.println("Tipo de vehículo: " + tipo);
    }
}

class Coche extends Protected_Vehiculo {
    public void establecerTipo() {
        tipo = "Automóvil";
    }

}
