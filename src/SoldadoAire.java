import java.util.Random;

public class SoldadoAire extends SoldadoAbstracto {
    
    public SoldadoAire() {
        this.identificador_soldado = new Random().nextInt() % 20;
        tipo = Tipo.AIRE ;
    }
}
