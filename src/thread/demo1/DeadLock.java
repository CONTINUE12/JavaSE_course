package thread.demo1;

// 死锁
// 与之对应的还有Lock锁，可以显式的加锁(Lock.lock())解锁(Lock.unlock())

public class DeadLock {
    public static void main(String[] args) {
        Makeup g1 = new Makeup(0, "灰姑娘");
        Makeup g2 = new Makeup(1, "白雪公主");
        g1.start();
        g2.start();
    }
}

// 口红
class LipStick {

}

// 镜子
class Mirro {

}

class Makeup extends Thread {
    // 保证需要的资源只有一份
    static LipStick lipStick = new LipStick();
    static Mirro mirro = new Mirro();

    int choice; // 选择
    String gilrName; // 使用化妆品的人

    Makeup(int choice,String gileName) {
        this.choice = choice;
        this.gilrName = gileName;
    }

    @Override
    public void run() {
        try {
            makeup();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // 化妆，互相持有对方的锁，就是需要拿到对方的资源
    private void makeup() throws InterruptedException {
        if (choice == 0) {
            synchronized (lipStick) {
                System.out.println(this.gilrName + "获得口红的锁");
                Thread.sleep(1000);
            }
            synchronized (mirro) {
                System.out.println(this.gilrName + "获得镜子的锁");
            }

        }else {
            synchronized (mirro) {
                System.out.println(this.gilrName + "获得镜子的锁");
                Thread.sleep(1000);
            }
            synchronized (lipStick) {
                System.out.println(this.gilrName + "获得口红的锁");
            }
        }
    }
}