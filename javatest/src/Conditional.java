public class Conditional {
    public static void main(String[] args) {
        int a = (7<3) ? 7:3;
        System.out.print("a的运行结果是"+a);

       // if (7<3){
        //    a = 7;
        //} else {
         //   a=3;
        //}
        String b= "hello";
        double c= b.equals("hello") ? 0.5:1.0;
        System.out.print("c的运行结果是"+c);
    }
}
