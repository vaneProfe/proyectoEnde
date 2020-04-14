package refactorizacion3;

import java.time.LocalDate;

/**
 *
 * @author Vanesa
 */
public class Empleado extends Persona {
    private String contrasena;
    private LocalDate fIngreso;
    private static byte contEmpleados=0;

    public Empleado(String contrasena, LocalDate fIngreso, short id, String nombre, String apellidos) {
        super(id, nombre, apellidos);
        this.contrasena = contrasena;
        this.fIngreso=fIngreso;
        contEmpleados++;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    private boolean antiguedad (){
        if(this.fIngreso.isBefore(LocalDate.parse("2010-01-01")))
                return true;
        else return false;
    }

    public void cobraAntiguedad(){
        if (this.antiguedad()) 
            System.out.println("El empleado "+ this.nombre+ " cobrára antigüedad.");
        else
            System.out.println("El empleado "+ this.nombre+ " no cobrára antigüedad.");
    }
    
    //@Override
    public void getInfo() {
        System.out.println("Nombre "+this.nombre+ ", apellidos "+
         this.APELL+", id: "+this.id+" contraseña: " +this.contrasena);
    }
    
    
    
}
