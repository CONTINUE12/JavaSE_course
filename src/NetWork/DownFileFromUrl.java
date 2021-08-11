package NetWork;

//从指定地址处下载文件并保存到指定位置
import java.io.*;
import java.net.*;

public class DownFileFromUrl {
    public static void main(String[] args) {
        try{
            downLoaFromUrl("https://shouyou.3dmgame.com/gl/190009.html","baidu.html",
                    "D:/JAVA/My_project/prictice/src/NetWork/");
        }catch(Exception w){

        }
    }

    //downLoaFromUrl方法
    public static void downLoaFromUrl(String urlStr, String fileName, String savePath) throws IOException {
        URL url = new URL(urlStr); //新建url对象
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setConnectTimeout(3*1000); //设置超时时间3s
        conn.setRequestProperty("User-agent","Mozilla/4.0 (compatible; MSTE 5.0; Windows NT; DigExt)");
        InputStream inputStream = conn.getInputStream(); //得到输入流
        byte[] getData = readInputStream(inputStream); //获得自己的数组
        File savaDir = new File(savePath); //文件保存位置
        if(!savaDir.exists()){
            savaDir.mkdir();
        }
        File file = new File(savaDir + File.separator + fileName);
        FileOutputStream fos = new FileOutputStream(fileName); //新建输出文件流的对象
        fos.write(getData); //将获取到的文件写入指定位置
        if(fos!=null){
            fos.close();
        }
        if(inputStream!=null){
            inputStream.close();
        }
        System.out.println("info:" + url + "下载成功！");

    }

    //从输入流中获取字节数组函数
    private static byte[] readInputStream(InputStream inputStream) throws IOException {
        byte[] buffer = new byte[1024]; //定义缓冲区大小
        int len = 0;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        while((len = inputStream.read(buffer)) != -1){
            bos.write(buffer, 0, len); //写入
        }
        bos.close();
        return bos.toByteArray();
    }

}
