package Practica5;

public class Descuentos {
    static final double plata = 0.05;
    static final double oro = 0.08;
    static final double diamante = 0.12;

    final double descuentoCumple = 0.50;
    final double descuentoMartes = 0.10;
    final double descuentoLunes_Jueves = 0.12;





    public double descuentoBase (String membresia, double precio) {
        double descuento = 0.0;
        switch (membresia.toLowerCase()) {
            case "plata":
                descuento = precio * plata;
                break;
            case "oro":
                descuento = precio * oro;
                break;
            case "diamante":
                descuento = precio * diamante;
                break;
            default:
                System.out.println("Esta menbresia no existe, no hay descuento");
                break;
        }
        return descuento;
    }

    public double descuentoAdicional(double precio, String membresia, String dia, boolean cumple) {
        double descuentoTotal = descuentoBase(membresia, precio);
        double subtotal       = precio - descuentoTotal; 

        if (cumple) {
            return precio * descuentoCumple;
        }

        if (dia.equalsIgnoreCase("lunes") || dia.equalsIgnoreCase("jueves")) {
            return precio * descuentoLunes_Jueves;
        }
    
        if (dia.equalsIgnoreCase("martes") &&(membresia.equalsIgnoreCase("oro") || membresia.equalsIgnoreCase("diamante"))) {
            descuentoTotal += subtotal * descuentoMartes;
        }

        return descuentoTotal;
    }
}