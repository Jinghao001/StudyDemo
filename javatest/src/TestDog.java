      class Animal{

        void  move(){
            System.out.println("动物能够移动");

        }
        void  bark(){
          System.out.print("wangaaa");
     }
    }
      class Dog extends Animal {

        void  move (){
            System.out.println("狗能够奔跑");
        }

        void  bark(){
            super.bark();



            System.out.println("wang wamg wang!!!");
        }
      }


public class TestDog {
    public static void main(String[] args) {
        Animal a =new Animal();
        Animal b = new Dog();
        b.bark();









    }


}
