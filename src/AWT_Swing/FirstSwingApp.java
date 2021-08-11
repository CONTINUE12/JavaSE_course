package AWT_Swing;

//开发可视化图形界面
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FirstSwingApp {
    public static void main(String[] args) {
        try{
            //设置窗口风格
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        }catch(Exception e){
            e.printStackTrace();
        }

        JFrame frame = new JFrame("我的第一个Swing程序"); //创建并初始化顶层容器
        Container c = frame.getContentPane(); //创建面板容器
        JPanel pane = new JPanel(); //创建并初始化面板pane
        c.add(pane); //将面板添加到窗口
        pane.setLayout(new FlowLayout()); //设置布局管理器
        final JLabel label = new JLabel(); //创建并初始化标签
        JButton button = new JButton("Press me!"); //创建并初始化按钮
        pane.add(label);
        pane.add(button);
        //添加事件处理
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("监听时间响应成功！");
            }
        });
        //窗口设置成功
        //开始显示
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.setSize(400,280); //设置窗口大小
        frame.setVisible(true); //显示窗口
    }
}
