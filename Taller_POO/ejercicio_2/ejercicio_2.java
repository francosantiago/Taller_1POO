// El dueño de una papelería desea un programa que le indique el precio de venta de un artículo dado


package ejercicio_2;

import javax.swing.JOptionPane;


public class ejercicio_2 
{
    public static void main(String[] args) 
    {
        int precioTotal;
        int precioCosto;
        int ganancia = 0;

        precioCosto = Integer.parseInt(JOptionPane.showInputDialog("Digite el número: "));

        if (precioCosto < 3000) 
        {
            ganancia = (int) (precioCosto * 0.15);
        } else if (precioCosto <= 6000 && precioCosto >= 3000) 
        {
            ganancia = 500;
        } else if (precioCosto > 6000) 
        {
            ganancia = (int) (precioCosto * 0.25);
        }

        precioTotal = precioCosto + ganancia;
        JOptionPane.showMessageDialog(null,
                "La ganancia del producto es " + ganancia + " y el precio total es " + precioTotal + "!");
        System.exit(0);
    }
}

