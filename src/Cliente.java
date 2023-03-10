import java.util.Scanner;   // para poder capturar datos de entrada

public class Cliente {
    public static void main(String[] args) {
        System.out.println("Introduzca cuántos soldados son necesarios para las misiones (es muy poco probable que con un nº" +
                " <=3 los soldados fallen, ya que se estará mandando a la élite): ");
        Scanner soldados_entrada = new Scanner(System.in);
        int num_soldados = soldados_entrada.nextInt();
        soldados_entrada.close();

        FactoriaAbstractaMisionesYSoldados f_aire = new FactoriaAire();
        FactoriaAbstractaMisionesYSoldados f_tierra = new FactoriaTierra();

        f_aire.crearMision(num_soldados).start();
        f_tierra.crearMision(num_soldados).start();
    }
}