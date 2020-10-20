package employee;

import org.omg.Messaging.SyncScopeHelper;

public class Eemployee01 {
    String name;
    String sex;
    int age;
    int salary;
    Eemployee01(String name,int age,int salary,String sex){
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.sex=sex;




    }


        void printEmployee() {
            System.out.print(name);
            System.out.print(age);
            System.out.print(sex);
            System.out.print(salary);


        }

    @Override
    public String toString() {
        return "Eemployee01{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Eemployee01 b=new Eemployee01("lixaing",12,5000,"man");
//        b.printEmployee();
        System.out.println(b);

    }
}
