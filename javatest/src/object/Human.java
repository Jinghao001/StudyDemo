package object;

import com.sun.jmx.snmp.SnmpUnknownModelLcdException;
import com.sun.org.apache.xalan.internal.xsltc.dom.SAXImpl;
import sun.management.Agent;
import sun.util.resources.cldr.es.TimeZoneNames_es_419;

public class Human {
    String name;
    int age;
    String sex;



    public  void set (String name,String sex ){
        System.out.println(name);
        System.out.println(this.name);




    }





    public  void  set2(String name){
        System.out.println(this.name);
        System.out.println(name);

    }
    public  void  test1 (Human h){
        System.out.println(h.age);

        h.age=h.age-10;


    }

    public  void  test2(Human h ,int s){
        System.out.println(s);
        s=10;
        h.age=h.age+s;
        this.age=h.age;
    }

    public static void main(String[] args) {
        Human human =new Human();
      //  System.out.println(human.age);
       // System.out.println(human.name);
        //human.set("zhangshan","man");
        //human.set2("wanger");
     //   Human human1=new Human();
       // human1.age=10;
       // System.out.println(human1.age);
       // human.test1(human1);

       // System.out.println(human1.age);
        //System.out.println(human.age);
        Human human2=new Human();
        human.test2(human2,0);
        System.out.println(human2.age);
        System.out.println(human.age);







    }

}

