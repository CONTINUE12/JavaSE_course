//判断水仙花数
package shuixianhua; //定义包，防止不同类文件中的类名及方法重复产生冲突

public class shuixianhuashuClass {
    public void isshuixianhuashu(int num)
    {
        if(num<100&&num>999)
        {
            System.out.println(num + "不是正确的取值数");
        }

        int bai = num/100;
        int shi = (num-100*bai)/10;
        int ge = num%10;
        if(bai*bai*bai + shi*shi*shi + ge*ge*ge == num)
        {
            System.out.println(num + "是水仙花数");
        }
        else
        {
            System.out.println(num + "不是水仙花数");
        }
    }

    public static void main(String [] args)
    {
        int num1 = 153;
        int num2 = 695;
        shuixianhuashuClass sxh = new shuixianhuashuClass();
        sxh.isshuixianhuashu(num1);
        sxh.isshuixianhuashu(num2);
    }
}
