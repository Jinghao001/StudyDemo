

public class Rectangle {
    float width,height;
    public Rectangle(float width,float height){
        this.width=width;
        this.height=height;
    }
    public float getLength(){
        return(this.height+this.width)*2;

    }
    public float getArea(){
        return (this.height*this.width);
    }

    public static void main(String[] args) {
        Rectangle rect=new Rectangle(10,20);
        System.out.println("这个矩形的周长是"+rect.getLength());
        System.out.println("这个矩形的面积是"+rect.getArea());

    }
}
