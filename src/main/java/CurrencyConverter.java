import javax.swing.*;

import java.text.DecimalFormat;

public class CurrencyConverter {

    public static void main(String[] args) throws Exception {

        Object[] options = {"Convertir Divisas", "Convertir Temperatura", "Salir"};
        int elige = JOptionPane.showOptionDialog(null, "¿Que quieres hacer", "Conversor", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        if (elige == 2) {
            JOptionPane.showMessageDialog(null, "Programa cerrado");
            System.exit(0);
        }

        if (elige == 0) {
            DecimalFormat formatearDivisas = new DecimalFormat("#.##");
            boolean continuarPrograma = true;
            while (continuarPrograma) {
                String[] opciones = {"Pesos a Euros", "Pesos a Dolares", "Pesos a Libras Esterlinas", "Pesos a Yen", "Pesos a Won"};
                String cambio = (String) JOptionPane.showInputDialog(null, "Elija una Opcion:", "Conversor de moneda",
                        JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

                String input = JOptionPane.showInputDialog(null, "Ingrese Cantidad de Pesos Colombianos");
                double pesos = 0.00;

                try {
                    pesos = Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Vlaor no valido");
                }

                if (cambio.equals("Pesos a Euros")) {
                    double euros = pesos / 5032;
                    JOptionPane.showMessageDialog(null, pesos + " Pesos Colombianos son: "
                            + formatearDivisas.format(euros) + " Euros.");

                } else if (cambio.equals("Pesos a Dolares")) {
                    double dolares = pesos / 4722;
                    JOptionPane.showMessageDialog(null, pesos + "Pesos Colombianos son: "
                            + formatearDivisas.format(dolares) + "Dolares.");

                } else if (cambio.equals("Pesos a Libras Esterlinas")) {
                    double libra = pesos / 5680;
                    JOptionPane.showMessageDialog(null, pesos + "Pesos Colombianos son: "
                            + formatearDivisas.format(libra) + "Libras Esterlinas.");

                } else if (cambio.equals("Pesos a Yen")) {
                    double yen = pesos / 35;
                    JOptionPane.showMessageDialog(null, pesos + "Pesos Colombianos son: "
                            + formatearDivisas.format(yen) + "Yen.");

                } else if (cambio.equals("Pesos a Won")) {
                    double won = pesos / 3.58;
                    JOptionPane.showMessageDialog(null, pesos + "Pesos Colombianos son: "
                            + formatearDivisas.format(won) + "Won.");
                }

                int confirma = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el programa", "Confirmar",
                        JOptionPane.YES_NO_OPTION);

                if (confirma == JOptionPane.NO_OPTION) {
                    continuarPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa finalizado");
                }
            }
        }
        if (elige == 1) {
            boolean seguirPrograma = true;
            while (seguirPrograma) {
                String[] opciones = {"Celsius a Fahrenheit", "Fahrenheit a Celsius"};
                int opcion = JOptionPane.showOptionDialog(null, "Elija una Opcion:", "Conversor de temperatura",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
                String valorNominal = JOptionPane.showInputDialog(null, "Ingrese valor a convertir");
                double valor = 0.0;
                try {
                    valor = Double.parseDouble(valorNominal);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no valido");
                    System.exit(0);
                }

                double resultado = 0;
                if (opcion == 0) {
                    resultado = (valor * 9 / 5) + 32;
                    JOptionPane.showMessageDialog(null, valor + " Grados Celsius son: " + resultado + "Grados Fahrenheit");
                } else if (opcion == 1) {
                    resultado = (valor - 32) * 5 / 9;
                    JOptionPane.showMessageDialog(null, valor + " Grados Farenheit son: " + resultado + "Grados Celsius");
                }
                int continuar = JOptionPane.showConfirmDialog(null, "¿Desea seguir usando el programa?", "",
                        JOptionPane.YES_NO_OPTION);
                if (continuar == JOptionPane.NO_OPTION) {
                    seguirPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");
                }
            }
        }
    }
}
