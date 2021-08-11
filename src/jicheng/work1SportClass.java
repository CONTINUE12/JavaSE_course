package jicheng;

public class work1SportClass {
    public String name;
    public int num;
    public void getSportname(String name)
    {
        this.name = name;
    }
    public void needhuman(int num)
    {
        System.out.println(name + "运动需要" + num + "个人参加");
    }
}
