import java.util.Random;

public class SoldadoAire extends SoldadoAbstracto {
    public SoldadoAire() {
        this.identificador = new Random().nextInt() % 20;
    }
}
