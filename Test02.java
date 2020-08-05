package day09;

import java.util.concurrent.*;

/**
 * 使用线程方式二创建两个线程:分别输出1000次，你好和再见
 * @author Bonnie
 *
 */
public class Test02 implements Runnable{
    private String name;
    public Test02(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(this.name + i);
        }
    }

    public static void main(String[] args) {
        Test02 t = new Test02("你好");
        Thread th = new Thread(t);
        th.start();
        Test02 t1 = new Test02("再见");
        Thread th1 = new Thread(t1);
        th1.start();
    }

}
