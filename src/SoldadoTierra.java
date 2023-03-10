import java.util.Random;

public class SoldadoTierra extends SoldadoAbstracto {
    public SoldadoTierra() {
        this.identificador_soldado = new Random().nextInt() % 20 + 100;
        tipo = Tipo.TIERRA ;
    }
}