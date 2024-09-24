package C_AutoBoxing_UnBoxing;

import javax.swing.JOptionPane;
public class TiposDeDatos {
    //Crea un programa que solicite al usuario su edad, altura y si es mayor de edad usando Clases Wrapper.
    //Convierte estos valores de vuelta a tipos primitivos y muestra un mensaje que confirme los datos ingresados.


        public static void main(String[] args) {
            // Solicitar datos usando clases wrapper
            Integer edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad:"));
            Double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su altura:"));
            Boolean esMayorDeEdad = JOptionPane.showConfirmDialog(null, "¿Es mayor de edad?") == 0;

            // Convertir a primitivos
            int edadPrimitivo = edad;
            double alturaPrimitivo = altura;
            boolean mayorDeEdadPrimitivo = esMayorDeEdad;

            // Mostrar los datos
            JOptionPane.showMessageDialog(null, "Edad: " + edadPrimitivo + ", Altura: " + alturaPrimitivo + ", Mayor de edad: " + mayorDeEdadPrimitivo);
        }
    }

}
