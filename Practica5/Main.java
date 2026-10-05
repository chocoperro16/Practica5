package Practica5;


import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        double precio              = 1000.0;
        String membresia           = "ORO";
        LocalDate fechaNacimiento  = LocalDate.of(1998, 12, 25); 

    
        LocalDate hoy = LocalDate.now();
        String diaSemana = hoy.getDayOfWeek()
                .getDisplayName(TextStyle.FULL, new Locale("es", "MX"));

        boolean cumple = (fechaNacimiento.getDayOfMonth() == hoy.getDayOfMonth()) && (fechaNacimiento.getMonthValue() == hoy.getMonthValue());

    
        Descuentos descuentos = new Descuentos();

    
        double descTotal = descuentos .descuentoAdicional(precio, membresia, diaSemana, cumple);
        double totalPagar = precio - descTotal;

    
    System.out.println("Hoy es: " + diaSemana);
    System.out.println("Su membresía es: " + membresia);
    System.out.println("El descuento total es de: $" + descTotal);
    System.out.println("Total a pagar: $" + totalPagar);

    }
}