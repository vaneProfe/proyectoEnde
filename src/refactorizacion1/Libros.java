package refactorizacion1;

/**
 *
 * @author Vanesa
 */
enum Tipo{
          NOVELA,TEATRO,POESIA,ENSAYO;
    }
public class Libros {
        //Atributos

    private String titulo;
    private short anio;
    private String autor;
    private Tipo tipo;
    
    //Constructor
    public Libros(String titulo, short anio, String autor, Tipo tipo) {
        this.titulo = titulo;
        this.anio = anio;
        this.autor = autor;
        this.tipo = tipo;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public short getAnio() {
        return anio;
    }

    public String getAutor() {
        return autor;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setAnio(short anio) {
        this.anio = anio;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    private String getInfo(){
        return "Título: "+getTitulo()+" año: "+anio+" autor: " +autor+" tipo: "+tipo;
    }
    
    public void clasificacion(){
        if (anio<=1950) System.out.println("Antigüo");
        else if(anio<2000) System.out.println("Contemporáneo");
        else System.out.println("Moderno");
    }
    
    public short clasificacion2(){
        if (anio<=1950) return 0;
        else if(anio<2000) return 1;
        else return 2;
    }
    
    public void verClasificacion(){
        if (this.clasificacion2()==0) System.out.println("Antigüo");
        else if (this.clasificacion2()==1)System.out.println("Contemporáneo");
        else if (this.clasificacion2()==2)System.out.println("Moderno");
        else System.err.println("Error");
    }
}
