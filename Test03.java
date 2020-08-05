package day09;

import java.util.concurrent.*;

/**
 * 使用匿名内部类方式创建两个线程:分别输出1000次，你好和再见
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Runnable run = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("你好" + i);
                }
            }
        };
        Callable call = new Callable() {
            @Override
            public Object call() throws Exception {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("再见" + i);
                }
                return null;
            }
        };
        Thread a = new Thread(run);
        a.start();
        ExecutorService e = Executors.newFixedThreadPool(1);
        Future<String> f = e.submit(call);
        String d = f.get();
        System.out.println(d);
    }
}
