package NetWork;

//服务器段程序
import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket listen = new ServerSocket(5050); //创建监听对象
        Socket server = listen.accept(); //定义server套接字
        InputStream in = server.getInputStream(); //定义输入输出流
        OutputStream out = server.getOutputStream();
        char c = (char)in.read();
        System.out.println("收到：" + c);
        out.write('s');
        out.close();
        in.close();
        server.close();
        listen.close();
    }
}
