package tradiction_suanfa;//方法重载，求参数的最大值

public class getMax {
    public int getMaxNum(int a,int b)
    {
        System.out.println("获取整型参数的最大值");
        return (a > b)? a:b;
    }

    public double getMaxNum(double a,double b)
    {
        System.out.println("获取浮点型参数的最大值");
        return (a > b)? a:b;
    }

    public static void main(String[] args)
    {
        getMax GM = new getMax();
        System.out.println("获取整型参数中的最大值为：" + GM.getMaxNum(10,20));
        System.out.println("获取浮点型参数中的最大值为：" + GM.getMaxNum(15.2,21.8));
    }
}
