package tradiction_suanfa;//继承work1SportClass父类，创建篮球子类

import jicheng.*;

public class workBasketballSport extends work1SportClass {
    public static void main(String [] args)
    {
        workBasketballSport bas = new workBasketballSport();
        bas.getSportname("basketball");
        bas.needhuman(10);
    }
}