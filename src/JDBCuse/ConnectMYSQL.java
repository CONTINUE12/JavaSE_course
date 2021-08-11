package JDBCuse;

//连接数据库并获取内容
import javax.xml.transform.Result;
import java.sql.*;

public class ConnectMYSQL {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/jdbc?user=root&password= &useSSL=false"; //数据库路径
            Connection con = DriverManager.getConnection(url);
            if(con != null){
                System.out.println("数据库连接成功");
            }
            Statement s = con.createStatement(); //创建Statement对象
            ResultSet r = s.executeQuery("select * from employees"); //执行SQL语句
            System.out.println("id\t/name\t/sex\t/entrydate\t/department\t/others");
            //遍历数据表内容
            while(r.next()){
                System.out.println(r.getString("id") + "\t/" + r.getString("name") + "\t/" +
                        r.getString("sex") + "\t\t/" + r.getString("entrydate") + "\t/" +
                        r.getString("department") + "\t\t/" + r.getString("others"));
            }
            s.close();

            System.out.println("****************************");
            //创建PreparedStatement对象
            PreparedStatement patmt = con.prepareStatement("select * from employees where id = ?");
            patmt.setInt(1,3); //将指定参数设置为Int类型的值3
            ResultSet res = patmt.executeQuery(); //执行SQL语句
            System.out.println("id\t/name\t/sex\t/entrydate\t/department\t/others");
            while(res.next()){
                System.out.println(res.getString("id") + "\t/" + res.getString("name") + "\t/" +
                        res.getString("sex") + "\t\t/" + res.getString("entrydate") + "\t/" +
                        res.getString("department") + "\t\t/" + res.getString("others"));
            }
            patmt.close();
            con.close();
        }catch(Exception e){
            System.out.println("数据库与连接失败");
            e.printStackTrace();
        }
    }
}
