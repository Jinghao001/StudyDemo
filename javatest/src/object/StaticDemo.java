package object;

public class StaticDemo {
     static String name ="zhangshan";
     static int age =10;
     static void  a (){

     }

    public static void main(String[] args) {
        StaticDemo staticDemo = new StaticDemo();

        //使用对象
        System.out.println(staticDemo.name);
        System.out.println(staticDemo.age);
        staticDemo.a();
        StaticDemo.a();

        //
        System.out.println(StaticDemo.name);
        System.out.println(StaticDemo.age);

    }

}
