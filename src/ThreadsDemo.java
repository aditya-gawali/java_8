public class ThreadsDemo {
    public static void main(String[] args) {


        // traditional Method
        Thread thread = new Thread(new MyThread());
        thread.run();


        // lambda expression

        Runnable runnable = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Hello " + i);
            }
        };

        Thread childThread = new Thread(runnable);
        childThread.run();

    }


}

class MyThread implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello " + i);
        }
    }
}