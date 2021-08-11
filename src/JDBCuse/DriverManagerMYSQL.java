package JDBCuse;

//导入JDBC驱动程序
public class DriverManagerMYSQL {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
//            Class.forName("org.gjt.mm.mysql.Driver");
            System.out.println("找到驱动程序类");
        }catch(ClassNotFoundException e){
            System.out.println("找不到驱动程序类");
        }
    }
}
