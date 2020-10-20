

public class Abc {
    float width, height;

    public Abc(float width, float height) {
        this.width = width;
        this.height = height;

    }

    public float getlength() {
        return (this.height + this.width) * 2;


    }

    public float getArea() {
        return (this.height * this.width);
    }


    public static void main(String[] args) {
        Abc rect = new Abc(10, 100);
        System.out.println(rect.getArea());
        System.out.println(rect.getlength());

    }
}