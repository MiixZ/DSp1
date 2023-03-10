import java.util.Scanner;   // para poder capturar datos de entrada

public class Cliente{

    public static void main(String[] args){
        // aqui he puesto n soldados tanto para misiones aereas como terrestres, tengo q comprobar
        // si es un requisito hacer el mismo número de misiones de cada tipo o no
        // y si no, pues caputramos otro valor entero de entrada y lo diferenciamos x misiones
        System.out.println("Introduzca cuántos soldados son necesarios para las misiones: ");
        Scanner soldados_entrada = new Scanner(System.in);
        int num_soldados = soldados_entrada.nextInt();
        soldados_entrada.close() ;  

        // usamos factorias concretas
        FactoriaAbstractaMisionesYSoldados f_aire = new FactoriaAire();
        FactoriaAbstractaMisionesYSoldados f_tierra = new FactoriaTierra();

        // y ejecutamos las hebras
        f_aire.crearMision(num_soldados).start();
        f_tierra.crearMision(num_soldados).start();
    }

}