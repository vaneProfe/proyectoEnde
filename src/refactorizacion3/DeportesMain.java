package refactorizacion3;

/**
 *
 * @author Vanesa
 */
public class DeportesMain {
    public static void main (String [] args){
        Usuario us1=new Usuario((byte)40,(short)1, "pepe", "sanchez");
        Deportes d1= new Deportes ("Fútbol", 22, 3, "Balón", Zona.OUTDOOR);
        Deportes d2= new Deportes ("Tenis", 2, 4, "Raqueta y pelotas", Zona.OUTDOOR);
        us1.getInfo();
        System.out.println("\nDeportes creados: "+d1 + "\n" +d2);
        
        Gimnasio g1=new Gimnasio(us1);
        g1.altaDeporte(d1);
        g1.altaDeporte(d2);
        g1.altaDeporte(d2);
        g1.bajaDeporte(d2);
        g1.mostrarDeportes();
        
        
        
        /*us1.altaDeporte(f1);
        us1.getInfo();
        us1.altaDeporte(de1);
        us1.getInfo();
        us1.altaDeporte(de1);
        us1.getInfo();
        us1.altaDeporte(de1);
        us1.getInfo();
        us1.bajaDeporte(f1);
        us1.getInfo();*/
    }

    }

