import java.util.Random;

public class SoldadoTierra extends SoldadoAbstracto {
    public SoldadoTierra() {
        this.identificador = new Random().nextInt() + 20;
    }
}