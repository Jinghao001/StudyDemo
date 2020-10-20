package employee;



public class Employee {

    String name;
    String sex;
    int age;
    int salary;
    Employee(String name){
        this.name=name;

    }
    void emsex(String emsex){
        sex= emsex;

    }
    int emage(int emage){
        age=emage;
        return emage;
    }
    void emsalary(int emsalary){
        salary=emsalary;
    }
    void printEmployee(){
        System.out.print(name);
        System.out.print(sex);
        System.out.print(age);
        System.out.print(salary);
    }

    public static void main(String[] args) {
        Employee a=new Employee("lihua");
        a.emsex("man");
        a.emage(26);
        a.emsalary(5000);
        a.printEmployee();

    }

}

