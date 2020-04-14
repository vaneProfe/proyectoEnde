package refactorizacion2;

/**
 * La clase Cuenta sirve para crear una cuenta bancaria y asociarla a un usuario
 * @author Vanesa
 * @version 1.0
 * @since 20/03/2020
 */

public class Cuenta implements Operaciones{
    //Atributos
    /**
     * Atributos clase:
     * numCuenta, saldo, nombreGestor y usuario
     */
    private String numCuenta;
    private Saldo saldo;
    private String nombreGestor;
    private Usuario usuario;

    /**
     * Constructor con los cuatro parámetros
     * @param numCuenta Es el número de 20 dígitos de la cuenta bancaria
     * @param saldo Saldo inicial de la cuenta
     * @param nombreGestor La persona encargada de gestionar la cuenta
     * @param usuario El titular de la cuenta
     */
    public Cuenta(String numCuenta, Saldo saldo, String nombreGestor, Usuario usuario) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.nombreGestor = nombreGestor;
        this.usuario=usuario;
    }

    /**
     *Método que devuelve el número de cuenta
     * @return numCuenta el número de 20 dígitos de la cuenta bancaria
     */
    public String getNumCuenta() {
        return numCuenta;
    }

    /**
     * Establece un nuevo número de cuenta
     * @param numCuenta nuevo número de cuenta
     */
    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    /**
     * Método para ver el nombre del gestor
     * @return nombreGestor nombre del gestor
     */
    public String getNombreGestor() {
        return nombreGestor;
    }

    /**
     * Método para cambiar el nombre del gestor
     * @param nombreGestor nombre del nuevo gestor
     */
    public void setNombreGestor(String nombreGestor) {
        this.nombreGestor = nombreGestor;
    }

    /**
     * Método para ver el saldo
     * @return saldo dinero disponible en la cuenta
     */
    public Saldo getSaldo() {
        return saldo;
    }

    /**
     * Método para variar el saldo disponible
     * @param saldo nuevo saldo a guardar
     */
    public void setSaldo(Saldo saldo) {
        this.saldo = saldo;
    }
   
    /**
     * Método implementado del interfaz Operaciones
     * Nos permite sacar dinero de la cuenta
     * @param importe cantidad de dinero a extraer de la cuenta, debe ser una cantidad
     * positiva y menor que el saldo disponible
     */
    @Override
    public void sacarDinero(float importe){
        if(importe<0)System.out.println("No se puede sacar un importe negativo");
        else if (importe>this.saldo.getCantidad())System.out.println("Saldo insuficiente");
        else {
            this.saldo.setCantidad(this.saldo.getCantidad()-importe);
            System.out.println("El saldo acutal es: " +this.saldo.getCantidad());
        }
    }
    
    /**
     * Método que nos permite añadir dinero a la cuenta
     * @param importe el saldo a añadir a la cuenta, debe ser positivo.
     */
    @Override
    public void ingresarDinero(float importe){
        if(importe<0)System.out.println("No se puede ingresar un importe negativo");
        else {
            this.saldo.setCantidad(this.saldo.getCantidad()+importe);
            System.out.println("El saldo acutal es: " +this.saldo.getCantidad());
        }
    }
    
}
