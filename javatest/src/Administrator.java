import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Administrator {
    String loginName="admin";
    String password="123";
    public void introduce(){
        System.out.println("My name is "+loginName);
        System.out.println("My passWord is "+password);
    }

    public static void main(String[] args) {
        Administrator admin=new Administrator();
        System.out.println(admin.loginName);
        System.out.println(admin.password);
        admin.introduce();




        //冲控制台读取数据需要Scanner 对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("修改密码");



        while (true) {

            System.out.println("请输入用户名称");
            String name = scanner.nextLine();
            System.out.println("请输入密码");
            String pwd = scanner.nextLine();

            if (name.equals(admin.loginName) && pwd.equals(admin.password)) {
                admin.loginName = scanner.nextLine();
                admin.password = scanner.nextLine();
                System.out.println("修改成功g");
                break;
            }else{
                System.out.println("用户名密码输入错误请重新输入");
            }
        }
              admin.introduce();

    }
}
