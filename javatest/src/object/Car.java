package object;

public class Car {
  private   String name;
  private   String color;
  private   String price;


    public Car(){

  }

    public Car(String name, String color, String price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public void  setName(String name){
      this.name=name;
  }

  public String  getName(){
      return this.name;
  }

  public void  setColor(String color){
      this.color=color;
  }
  public String getColor(){
      return this.color;

  }

  public  void setPrice(String price){
      this.price=price;
  }
  public String getPrice(){
      return this.price;
  }







    void move(){
        System.out.println("move");
    }
    void stop(){
        System.out.println("stop");
    }
    void speedUp(String speed){
        System.out.println("speedup是"+speed);
    }

    public static void main(String[] args) {
        Car car=new Car();
        //使用属性
        System.out.println(car.name);
        System.out.println(car.color);
        System.out.println(car.price);
        //修改属性
        car.speedUp("high");
        car.name="ben";
        car.color="green";
        car.price="100$";
        System.out.println(car.name);
        System.out.println(car.color);
        System.out.println(car.price);


    }

}

