public class FactoriaAire extends FactoriaAbstractaMisionesYSoldados {
    public MisionAire crearMision() {
        return new MisionAire();
    }

    public SoldadoAire crearSoldado() {
        return new SoldadoAire();
    }
}
