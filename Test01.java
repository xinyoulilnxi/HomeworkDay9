package day09;


/**
 * 使用线程方式一创建两个线程:分别输出1000次，你好和再见
 * @author Bonnie
 *
 */
public class Test01 extends Thread{
    public Test01(String name){
        super(name);
    }
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println( this.getName() + i);
        }
    }
    public static void main(String[] args) {
        Test01 test = new Test01("你好");
        Test01 test1 = new Test01("再见");
        test.start();
        test1.start();


    }

}
