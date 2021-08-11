package NetWork;

//客户端程序
import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) throws IOException{
        Socket client = new Socket("219.216.72.177",5050); //使用ip和端口定义客户端socket
        InputStream in = client.getInputStream(); //创建输入输出流
        OutputStream out = client.getOutputStream();
        out.write('a');
        char c = (char)in.read();
        System.out.println("收到：" + c);
        out.close();
        in.close();
        client.close();
    }
}
