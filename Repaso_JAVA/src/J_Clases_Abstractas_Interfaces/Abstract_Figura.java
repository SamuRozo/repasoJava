package J_Clases_Abstractas_Interfaces;

public abstract class Abstract_Figura {
        abstract double calcularArea(); // Método abstracto
    }

    class Circulo extends Abstract_Animal{
        double radio;

        Circulo(double radio) {
            this.radio = radio;
        }

        @Override
        double calcularArea() {
            return Math.PI * radio * radio;
        }

        @Override
        void hacerSonido() {

        }
    }
