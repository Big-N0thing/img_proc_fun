/*******************************************************************************
* EN ESTA CLASE SE LLEVARÁ A CABO LA EJECUCIÓN DEL HILO PRINCIPAL DEL PROGRAMA *
*******************************************************************************/

import static Utils.TerminalUtils.*;

public class Main {
    public static void main(String[] args) {
        System.out.print( ANSI_CYAN + "*** OPCIONES DEL PROGRAMA ***\n" +
                ANSI_BLUE + "1-- ENCODE/DECODE BASE 64\n" +
                ANSI_PURPLE + "2-- PARSE CSV\n" +
                ANSI_RED + "3-- OTHER..." + ANSI_RESET);
    }
}
