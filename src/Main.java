import static java.lang.Thread.sleep;

class MyThread implements Runnable {
    private int init;
    private int increment;
    private int delay;
    public MyThread(int init, int increment, int delay) {
        this.init = init;
        this.increment = increment;
        this.delay = delay;
    }
    public void run() {
        for(;;){
            System.out.println(init +" ");
            init += increment;
            sleep(delay);

        }
        System.out.println("Thread started");
    }
}



class Main{
    public static void main(String[] args) {
        new MyThread(1,3,3000).start();
        new MyThread(100,50,1000).start();

    }
}