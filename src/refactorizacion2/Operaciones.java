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
public interface Operaciones {
    
    //abstract void abrirCuenta(Usuario user, Cuenta cuenta);
    //La operación abrir cuenta se implementará llamando al constructor de la clase cuenta
    
    abstract void sacarDinero(float importe);
    
    abstract void ingresarDinero(float importe);
}
