/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorizacion1;

import java.time.LocalDate;
import java.util.Arrays;

/**
 *
 * @author Vanesa
 */
public class Main {
    public static void main (String [] args){
        Libros libro1=new Libros("La Iliada", (short)1572, "Homero", Tipo.NOVELA);
        Lectores lector1=new Lectores("03132020L", "Pepe", 0);
        LocalDate fIni=LocalDate.parse("2020-03-23");
        LocalDate fFin=LocalDate.parse("2020-04-15");
        Prestamos prestamo1=new Prestamos(lector1, libro1, fIni, fFin);
        
        lector1.impInfo();
        prestamo1.getInfo();
    }
}
