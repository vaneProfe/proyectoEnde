package refactorizacion3;

/**
 *
 * @author Vanesa
 */
enum Zona {OUTDOOR, INDOOR;}

public class Deportes {
    protected String NOM;
    private int nJ; //Nº jugadores
    private int nH; //Nº horas
    public String material;
    public Zona zona;

    public Deportes(String NOM, int nJ, int nH, String material, Zona zona) {
        this.NOM = NOM;
        this.nJ = nJ;
        this.nH = nH;
        this.material = material;
        this.zona = zona;
    }

    public int getnJ() {
        return nJ;
    }

    public int getnH() {
        return nH;
    }
    public void setnJ(int nJ) {
        this.nJ = nJ;
    }

    public void setnH(int nH) {
        this.nH = nH;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+this.NOM+ 
                " \n Número jugadores: "+this.nJ+
                "\n Número de horas: "+this.nH+
                "\n Material: "+ this.material+
                "\n Zona: " +this.zona ;
    }
    
}
