public class FactoriaTierra extends FactoriaAbstractaMisionesYSoldados {

    public SoldadoTierra crearSoldado() {
        return new SoldadoTierra();
    }
    
    public MisionTierra crearMision( int num_soldados) {
        //return new MisionTierra();

        MisionTierra mision = new MisionTierra() ;

        for( int i = 0 ; i < num_soldados ; i++ ) mision.aniadirSoldado(crearSoldado()) ;

        return mision;
    }
}
