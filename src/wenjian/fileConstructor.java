package wenjian;

import java.io.File;
import java.io.IOException;

public class fileConstructor {
    public static void main(String [] args)
    {
        fileConstructor fileTeat = new fileConstructor();
        fileTeat.dirMake();
    }

    public void fileMake()
    {
        File f1 = new File("F:\\a\\1.txt");
        File f2 = new File("F:\\2.txt");

        try
        {
            f1.createNewFile();
            f2.createNewFile();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    public void dirMake()
    {
        File dir = new File("F:\\test1");
        File dirs = new File("F:\\a\\b\\test2");//创建多级目录
        dirs.mkdirs();//创建多级目录
        dir.mkdir();
    }
}
