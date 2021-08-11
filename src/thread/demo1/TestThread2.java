package thread.demo1;

// 线程实现方法二，实现Runnable接口，重写run方法，执行线程需要丢入runnable接口实现类，调用start方法
public class TestThread2 implements Runnable{
    @Override
    public void run() {
        // 方法线程体
        for (int i = 0; i < 20; i++) {
            System.out.println("我在看代码===" + i);
        }
    }

    public static void main(String[] args) {
        // main线程，，主线程

        //调用start方法开启线程
        TestThread2 testThread2 = new TestThread2();
        new Thread(testThread2).start();

        for (int i = 0; i < 200; i++) {
            System.out.println("我在学习多线程===" + i);
        }
    }
}
