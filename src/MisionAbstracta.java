import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Random;


public abstract class MisionAbstracta extends Thread {

    ArrayList<SoldadoAbstracto> soldados = new ArrayList<SoldadoAbstracto>();
    double prob_no_superar ;    // segun tipo mision
    Tipo tipo ;
    int duracion_mision = 30 ;  // ver luego si este valor

    @Override
    public String toString(){return ("Misión de " + tipo );}

    public void aniadirSoldado( SoldadoAbstracto s){
        soldados.add(s);
    }

    public int num_soldados(){return soldados.size();}

    public int duracion_mision(){return duracion_mision;}

    private void comenzarMision(){
        System.out.println(toString() + " empieza justo ahora");

        for( int i = 0 ; i < num_soldados() ; i++ ){
            soldados.get(i).start();
            System.out.println(" El soldado " + soldados.get(i).toString() + " ha comenzado la mision ") ;
        }
    }

    @Override
    public void run(){
        int num_bajas = (int) (prob_no_superar*num_soldados());
        Random r = new Random() ;
        int t_hasta_baja = r.nextInt(duracion_mision);
        int n_aleatorio ;

        for( int i = 0 ; i < num_bajas ; i++ ){
            n_aleatorio = r.nextInt(soldados.size()) ;

            // comprobar si cae existe!!!
            if( !soldados.get(n_aleatorio).soldadoCaido()) soldados.get(n_aleatorio).soldadoCae(t_hasta_baja) ;
            else{
                while( soldados.get(n_aleatorio).soldadoCaido())
                    n_aleatorio = r.nextInt(soldados.size()) ;
                soldados.get(n_aleatorio).soldadoCae(t_hasta_baja) ;
            }
        }

        comenzarMision();

        // 1000ms*30 = 30s
        try{ sleep(duracion_mision*1000); }
        catch(InterruptedException e){ Logger.getLogger(MisionAbstracta.class.getName()).log(Level.SEVERE,null,e);}
    }
}