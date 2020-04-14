/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorizacion3;

/**
 *
 * @author Vanesa
 */
public class Gimnasio {
    private Usuario us;
    private Deportes[] deporte;

    public Gimnasio(Usuario us) {
        this.us = us;
        this.deporte=new Deportes[3];
    }

    public boolean deportesLleno() {
        for (int i = 0; i < deporte.length; i++) {
            if (deporte[i] == null) { //Controlo nulos
                return false; //indico que no esta llena
            }
        }
        return true; //esta llena
 
    }
    
    public boolean deporteDuplicado(Deportes d){
        boolean duplicado=false;
        for (int i=0; i<deporte.length&&!duplicado; i++){        
            if(deporte[i]==d)
                duplicado=true;
            else
                duplicado=false;
        }
        return duplicado;
    }
    
    public void altaDeporte(Deportes d) {
        if (deportesLleno()) { //Indico si tiene el máximo de deportes cogido
            System.out.println("lLENO");}
        else if (deporteDuplicado(d)){
            System.out.println("DUPLICADO");
        } else {
            boolean insertado = false;
            for (int i = 0; i < deporte.length&& !insertado; i++) {
                if (deporte[i] == null) { //controlo los nulos
                    deporte[i] = d; //Inserto el deporte elegido 
                    insertado=true;
                }
            }
            if (insertado) {
                System.out.println("Se ha añadido");
            } else {
                System.out.println("No se ha podido añadir");
            }
        }
    }

    public void bajaDeporte(Deportes d) {
        boolean encontrado = false;
        for (int i = 0; i < deporte.length && !encontrado; i++) {
            if (deporte[i] != null && deporte[i].equals(d)) {//Si encuentro ese deporte
                deporte[i] = null; //Lo pongo a nulo
                encontrado = true; //Indico que lo he encontrado
            }
        }
        if (encontrado) {
            System.out.println("Se ha eliminado el deporte");
        } else {
            System.out.println("No se ha eliminado el deporte");
 
        }
    }
    public void mostrarDeportes() {
        for (int i = 0; i < deporte.length; i++){
            if(deporte[i]!=null) 
                System.out.print(deporte[i].NOM+"\n ");
        }
    }
}
