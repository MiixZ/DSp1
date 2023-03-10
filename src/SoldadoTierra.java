import java.util.Random;

public class SoldadoTierra extends SoldadoAbstracto {

    public SoldadoTierra() {
        this.identificador_soldado = new Random().nextInt() + 20;
        tipo = Tipo.TIERRA ;
    }
}