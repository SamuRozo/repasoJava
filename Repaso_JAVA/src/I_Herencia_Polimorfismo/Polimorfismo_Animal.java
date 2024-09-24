package I_Herencia_Polimorfismo;

public class Polimorfismo_Animal {
    void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}

class Gato extends Polimorfismo_Animal {
    @Override
    void hacerSonido() {
        System.out.println("El gato maúlla.");
    }
}

class Vaca extends  Polimorfismo_Animal {
    @Override
    void hacerSonido() {
        System.out.println("La vaca muge.");
    }
}

