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
public class Saldo {
    private float cantidad;
    private String divisa;
    private String pais;

    /**
     *
     * @param cantidad
     * @param divisa
     * @param pais
     */
    public Saldo(float cantidad, String divisa, String pais) {
        this.cantidad = cantidad;
        this.divisa = divisa;
        this.pais = pais;
    }

    /**
     *
     * @return
     */
    public float getCantidad() {
        return cantidad;
    }

    /**
     *
     * @return
     */
    public String getDivisa() {
        return divisa;
    }

    /**
     *
     * @return
     */
    public String getPais() {
        return pais;
    }

    /**
     *
     * @param cantidad
     */
    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    /**
     *
     * @param divisa
     */
    public void setDivisa(String divisa) {
        this.divisa = divisa;
    }

    /**
     *
     * @param pais
     */
    public void setPais(String pais) {
        this.pais = pais;
    }
    
    
}


