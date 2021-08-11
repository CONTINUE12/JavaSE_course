package AWT_Swing;

//使用AWT和Swing工具开发投票界面

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

public class VoteCount extends JFrame {

    private JPanel contentPane;

    private JCheckBox checkBox1; //创建4个复选框
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JCheckBox checkBox4;

    private JLabel label1; //设置4个标签
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;

    private JProgressBar progressBar1; //设置4个进度条
    private JProgressBar progressBar2;
    private JProgressBar progressBar3;
    private JProgressBar progressBar4;

    //主函数
    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"); //换成Niumbus界面风格
        }catch(Throwable e){
            e.printStackTrace();
        }
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try{
                    VoteCount frame = new VoteCount(); //设置投票软件框架
                    frame.setVisible(true); //设置窗口可见
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
    }

    //面板设置方法
    public VoteCount() {
        setTitle("简单的投票系统"); //设置标题
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //退出程序时关闭JVM
        setBounds(100,100,450,300); //设置边框大小

        JPanel contentPane = new JPanel(); //创建contentPane对象
        contentPane.setBorder(new EmptyBorder(5,5,5,5)); //设置xontentPane对象的边界
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0,0)); //设置边框布局管理器

        JPanel buttonPanel = new JPanel();
        contentPane.add(buttonPanel,BorderLayout.SOUTH); //将按钮设置到窗口底部
        JButton submitButton = new JButton("提交"); //创建提交按钮
        submitButton.addActionListener(new ActionListener() { //为提交按钮添加动作监听器
            @Override
            public void actionPerformed(ActionEvent e) {
                do_submitButton_actionPerformed(e); //执行提交动作
            }
        });
        buttonPanel.add(submitButton);

        JButton refreshButton = new JButton("刷新"); //创建刷新按钮
        refreshButton.addActionListener(new ActionListener() { //为刷新按钮添加动作监听器
            @Override
            public void actionPerformed(ActionEvent e) {
                do_refreshButton_actionPerformed(e); //执行刷新动作
            }
        });
        buttonPanel.add(refreshButton);

        JPanel panel = new JPanel(); //建立面板
        panel.setBorder(new TitledBorder(new LineBorder(new Color(0,0,0)),"我最喜爱的小品演员",
                TitledBorder.LEADING,TitledBorder.TOP,null,new Color(59,59,59)));
        contentPane.add(panel,BorderLayout.CENTER); //将面板组件设置到窗口中央
        panel.setLayout(new GridLayout(4,1,15,15));//设置面板的大小

        //建立第一条记录
        JPanel panel1 = new JPanel();
        panel.add(panel1);
        panel1.setLayout(new BorderLayout(0,0));

        checkBox1 = new JCheckBox("赵四\uFF1A");  //创建第一个演员名字
        panel1.add(checkBox1,BorderLayout.WEST);

        label1 = new JLabel("0\u7968"); //显示票数
        panel1.add(label1,BorderLayout.EAST);

        progressBar1 = new JProgressBar(); //创建进度条
        progressBar1.setStringPainted(true);
        panel1.add(progressBar1,BorderLayout.CENTER); //将进度条设置到窗口中央

        //建立第二条记录
        JPanel panel2 = new JPanel();
        panel.add(panel2);
        panel2.setLayout(new BorderLayout(0,0));

        checkBox2 = new JCheckBox("沈腾\uFF1A");  //创建第二个演员名字
        panel2.add(checkBox2,BorderLayout.WEST);

        label2 = new JLabel("0\u7968"); //显示票数
        panel2.add(label2,BorderLayout.EAST);

        progressBar2 = new JProgressBar(); //创建进度条
        progressBar2.setStringPainted(true);
        panel2.add(progressBar2,BorderLayout.CENTER); //将进度条设置到窗口中央

        //建立第三条记录
        JPanel panel3 = new JPanel();
        panel.add(panel3);
        panel3.setLayout(new BorderLayout(0,0));

        checkBox3 = new JCheckBox("玛丽\uFF1A");  //创建第三个演员名字
        panel3.add(checkBox3,BorderLayout.WEST);

        label3 = new JLabel("0\u7968"); //显示票数
        panel3.add(label3,BorderLayout.EAST);

        progressBar3 = new JProgressBar(); //创建进度条
        progressBar3.setStringPainted(true);
        panel3.add(progressBar3,BorderLayout.CENTER); //将进度条设置到窗口中央

        //建立第四条记录
        JPanel panel4 = new JPanel();
        panel.add(panel4);
        panel4.setLayout(new BorderLayout(0,0));

        checkBox4 = new JCheckBox("贾玲\uFF1A");  //创建第四个演员名字
        panel4.add(checkBox4,BorderLayout.WEST);

        label4 = new JLabel("0\u7968"); //显示票数
        panel4.add(label4,BorderLayout.EAST);

        progressBar4 = new JProgressBar(); //创建进度条
        progressBar4.setStringPainted(true);
        panel4.add(progressBar4,BorderLayout.CENTER); //将进度条设置到窗口中央

    }

    //建立“提交”动作的相应
    protected void do_submitButton_actionPerformed(ActionEvent e) {

        String text1 = label1.getText(); //获得标签文本
        int number1 = Integer.parseInt(text1.substring(0,text1.length() - 1)); //获取票数
        String text2 = label2.getText();
        int number2 = Integer.parseInt(text2.substring(0,text2.length() - 1));
        String text3 = label3.getText();
        int number3 = Integer.parseInt(text3.substring(0,text3.length() - 1));
        String text4 = label4.getText();
        int number4 = Integer.parseInt(text4.substring(0,text4.length() - 1));

        if(checkBox1.isSelected()){
            number1++; //票数+1
            label1.setText(number1 + "票"); //更新票数
        }
        if(checkBox2.isSelected()){
            number2++;
            label2.setText(number2 + "票");
        }
        if(checkBox3.isSelected()){
            number3++;
            label3.setText(number3 + "票");
        }
        if(checkBox4.isSelected()){
            number4++;
            label4.setText(number4 + "票");
        }

        double total = number1 + number2 + number3 + number4; //计算总票数
        //在进度条上显示票数的文本信息
        progressBar1.setString(number1 * 100 / total + "%"); //百分比
        progressBar1.setValue(number1);
        progressBar2.setString(number2 * 100 / total + "%");
        progressBar2.setValue(number2);
        progressBar3.setString(number3 * 100 / total + "%");
        progressBar3.setValue(number3);
        progressBar4.setString(number4 * 100 / total + "%");
        progressBar4.setValue(number4);
    }

    //建立“刷新”动作的相应
    protected void do_refreshButton_actionPerformed(ActionEvent w){

        checkBox1.setSelected(false);
        checkBox2.setSelected(false);
        checkBox3.setSelected(false);
        checkBox4.setSelected(false);
    }
}
