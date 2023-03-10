import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class SoldadoAbstracto extends Thread {
    int identificador_soldado;
    Tipo tipo ; 
    boolean soldado_caido = false;  // si soldado ha sido incapaz de cumplir la mision -> en un principio a false
    int tiempo_aguantado ;  // tiempo hasta que soldado "cae" ( momento en el que cae )

    @Override
    public String toString() {
        return (tipo + " con identificador número: " + identificador_soldado );
    }

    void soldadoCae(int t) {
        soldado_caido = true;
        tiempo_aguantado = t;
    }

    boolean soldadoCaido() {
        return soldado_caido;
    }

    public void run() {
        try {
            sleep(5000);    // Cinco segundos.
        }
        catch(InterruptedException e) {
            Logger.getLogger(MisionAbstracta.class.getName()).log(Level.SEVERE,null,e);
        }

        if(soldado_caido) System.out.println(toString() + ", ha durado en la mision: " + tiempo_aguantado); // probar en q unidades se mide e incluirlo en el mensaje
        else System.out.println(toString() + ", ¡Ha completado la misión con éxito!") ;
    }
}
