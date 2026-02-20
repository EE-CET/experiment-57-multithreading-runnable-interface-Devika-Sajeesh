class MyRunnable implements Runnable {
    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.print(i+" ");
        }
    }
    // TODO: Override run() method
    // Loop from 1 to 5 and print numbers separated by space
}

public class RunnableThread {
    public static void main(String[] args) {
        // TODO: Create an instance of MyRunnable
        MyRunnable r=new MyRunnable();
        // TODO: Create a Thread object passing the runnable instance
        Thread t=new Thread(r);
        // TODO: Start the thread
        t.start();
    }
}
