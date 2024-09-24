package J_Clases_Abstractas_Interfaces;

public interface Interface_Volador {
    void volar();

    interface Volador {
        void volar();
    }

    class Pajaro implements Interface_Volador {
        @Override
        public void volar() {
            System.out.println("El pájaro está volando.");
        }
    }
}
