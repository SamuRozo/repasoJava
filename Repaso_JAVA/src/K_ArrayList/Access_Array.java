package K_ArrayList;
import java.util.ArrayList;
public class Access_Array {

        public static void main(String[] args) {
            ArrayList<String> lista = new ArrayList<>();
            lista.add("Manzana");
            lista.add("Banana");
            lista.add("Cereza");

            // Acceder a un elemento
            System.out.println("Elemento en índice 1: " + lista.get(1));

            // Modificar un elemento
            lista.set(1, "Uva");
            System.out.println("Lista después de modificar: " + lista);

            // Eliminar un elemento
            lista.remove(2);
            System.out.println("Lista después de eliminar: " + lista);
        }

    }
