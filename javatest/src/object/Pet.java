package object;

public class Pet {
    private String name;
    private int age;
    private String gender;




    @Override
    public String toString(){
       return  "muy name is"+"this.name"+",my age is"+this.age+"my gender is"+this.gender;
    }


   public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }




   public Pet(String name, int age, String gender) {
      this.name = name;
       this.age = age;
       this.gender = gender;
   }
    }


