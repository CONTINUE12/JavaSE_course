package thread.demo1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestPopl {

    public static void main(String[] args) {
        // newFixedThreadPool 参数为：线程池大小
        ExecutorService service = Executors.newFixedThreadPool(10);

        // 执行
        service.execute(new MyThread());
        service.execute(new MyThread());
        service.execute(new MyThread());
        service.execute(new MyThread());

        // 关闭
        service.shutdown();

    }

}

class MyThread implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
