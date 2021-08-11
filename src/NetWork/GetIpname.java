package NetWork;

//获取Internet IP地址
import java.net.InetAddress;

public class GetIpname {
    public static void main(String[] args) throws Exception {
        InetAddress address = InetAddress.getByName("www.neu.edu.cn");
        System.out.println(address);

        System.out.println("******");

        InetAddress[] addresses = InetAddress.getAllByName("www.neu.edu.cn"); //获取所有的对象
        for(InetAddress addr : addresses){
            System.out.println(addr);
        }

        System.out.println("******");

        InetAddress localaddress = InetAddress.getLocalHost(); //本机地址
        System.out.println(localaddress);
    }
}
