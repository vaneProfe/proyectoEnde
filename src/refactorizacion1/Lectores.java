package refactorizacion1;

import java.time.LocalDate;

/**
 *
 * @author Vanesa
 */
public class Lectores {


    //atributos
    private String DNI;
    private String nombre;
    private int diasMulta;

    /**
     *
     * @param DNI campo para guardar el DNI
     * @param nombre Nombre del lector
     * @param diasMulta Dias de multa que tiene acumulados
     */
    public Lectores(String DNI, String nombre, int diasMulta) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.diasMulta = diasMulta;
    }
    
    /**
     * @return the diasMulta
     */
    public int getDiasMulta() {
        return diasMulta;
    }

    /**
     * @param diasMulta the diasMulta to set
     */
    public void setDiasMulta(int diasMulta) {
        this.diasMulta = diasMulta;
    }
    
    /**
     *
     * @return DNI devuelve el DNI del lector
     */
    public String getDNI() {
        return DNI;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param DNI
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public String getInfo(){
        return "Nombre: " +nombre+" DNI: "+DNI+" multa: "+getDiasMulta();
    }
    
    /**
     *
     */
    public void impInfo(){
        System.out.println(this.getInfo());
    }

    
    

    
   
}
