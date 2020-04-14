package refactorizacion1;

import java.time.LocalDate;

/**
 *
 * @author Vanesa
 */
public class Prestamos {
    //Atributos
    private Lectores lector;
    private Libros libro;
    private LocalDate fecha_prestamo;
    private LocalDate fecha_limite;
    
    //Constructor
    public Prestamos(Lectores lector, Libros libro, LocalDate fecha_prestamo, LocalDate fecha_limite) {
        this.lector = lector;
        this.libro = libro;
        this.fecha_prestamo = fecha_prestamo;
        this.fecha_limite = fecha_limite;
    }
    //Getters y setters

    public Lectores getLector() {
        return lector;
    }

    public Libros getLibro() {
        return libro;
    }

    public LocalDate getFecha_prestamo() {
        return fecha_prestamo;
    }

    public LocalDate getFecha_limite() {
        return fecha_limite;
    }

    public void setLector(Lectores lector) {
        this.lector = lector;
    }

    public void setLibro(Libros libro) {
        this.libro = libro;
    }

    public void setFecha_prestamo(LocalDate fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }

    public void setFecha_limite(LocalDate fecha_limite) {
        this.fecha_limite = fecha_limite;
    }
     
    public static void devolverLibro(Prestamos prestamo){
            prestamo=null;
    }
    
    public void getInfo(){
        System.out.println(this.lector.getInfo()+" ha cogido el libro: ha cogido el libro: "+"Título: "
                +this.libro.getTitulo()+" año: "+this.libro.getAnio()+" autor: " +this.libro.getAutor()
                +" tipo: "+this.libro.getTipo());
    }
}
