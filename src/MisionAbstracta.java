public abstract class MisionAbstracta extends Thread {
    int numMision;

    @Override
    public void run() {
        System.out.println("Iniciada misión " + numMision + "\n");
        super.run();
    }
}