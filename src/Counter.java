public class Counter extends Thread {
    @Override
    public void run() {
        for(int i = 1; i<100; i++){
            System.out.print(" "+i);
        }
    }
}
