// Calcular e imprimir el doble de un número X

package ejercicio_1;

import javax.swing.JOptionPane;

public class ejercicio_1 
{
    public static void main(String[] args) 
    {
        int x;
        int y;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite el número: "));
        y = (x * 2);
        JOptionPane.showMessageDialog(null, "El doble de " + x + " es " + y + "!", "Doble Número",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}