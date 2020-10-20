package object;

public class Cat extends Pet {
 String sound;


    public Cat(String name, String gender, int age){
        super(name, age,gender);

    }

     public String toString(){
      return   super.toString()+"my sound is"+this.sound;

    }








}

