public class DogTest {
   private int dogAge;
    public DogTest(String name){
        System.out.print(name);

    }

    void setAge(int age){
        dogAge=age;


    }
    int getAge(){
        System.out.print(dogAge);
        return dogAge;

    }

    public static void main(String[] args) {
        DogTest dog =new DogTest("lihua");

        dog.setAge(113);
        dog.getAge();
    }
}
