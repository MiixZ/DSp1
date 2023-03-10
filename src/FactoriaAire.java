public class FactoriaAire extends FactoriaAbstractaMisionesYSoldados {
    
    @Override
    public SoldadoAire crearSoldado() {
        return new SoldadoAire();
    }
    
    @Override
    public MisionAire crearMision( int num_soldados) {
        //return new MisionAire();

        MisionAire mision = new MisionAire() ;

        for( int i = 0 ; i < num_soldados ; i++ ) mision.aniadirSoldado(crearSoldado()) ;

        return mision ;
    }
}
