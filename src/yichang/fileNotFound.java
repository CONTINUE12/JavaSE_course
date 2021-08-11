//异常处理机制

package yichang;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class fileNotFound {
    public static void main(String [] args)
    {
        File f = new File("noexist.txt");
        try
        {
            System.out.println("试图打开文件 noexist.txt文件");
            new FileInputStream(f);
            System.out.println("文件打开成功");
        }
        catch(FileNotFoundException e)
        {
            System.out.println("文件打开失败，noexist.txt不存在");
            e.printStackTrace();
        }
    }
}
