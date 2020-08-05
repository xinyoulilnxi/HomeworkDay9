package day09;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 创建一个线程，每秒输出一次当前系统时间:yyyy-MM-dd HH:mm:ss
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args)  {
        Runnable run = new Runnable() {
            @Override
            public void run() {
                while(true) {
                    try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                    Date date = new Date();
                    SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String s = sf.format(date);
                    System.out.println(s);
                }
            }
        };
        Thread t = new Thread(run);
        t.start();

    }

}
