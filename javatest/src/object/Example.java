package object;

import com.sun.corba.se.impl.orb.ParserTable;

public class Example {

    public static void test (int a,int b){
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);

    }


    public  static   void main(String[] args) {
        int a=3;
        int b=4;
        test(a,b);
        System.out.println(a);
        System.out.println(b);




    }



}




















