/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorizacion2;

/**
 *
 * @author Vanesa
 */
public class MainCuenta {
    public static void main (String [] args){
        //Crear usuario
        Usuario u1=new Usuario("Carlos", "Sanchez", "03256525L");
        //Establecer saldo inicial
        Saldo s1=new Saldo((float)0.0, "Euro", "España");
        //Crear cuenta
        Cuenta c1=new Cuenta("ES84 1585 2585 12 2563954856", s1, "Pedro Suarez", u1);
        
        c1.ingresarDinero(100);
        c1.sacarDinero(-10);
        c1.sacarDinero(50);
        
        System.out.println("Su saldo es: " +c1.getSaldo().getCantidad());
    }
}
