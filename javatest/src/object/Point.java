package object;




import java.util.Date;

public class Point {
    int x;
    int y;



    public void set(int xx,int yy ){
         x=xx;
         y=yy;
    }

    public double  test(Point point){

        return  Math.sqrt((point.x-x)*(point.x-x)+(point.y-y)*(point.y-y));




    }
    public  void  test1(Point p){
        int x;
        x=p.x;
        p.x=this.x;
        this.x=x;

        int y;
        y=p.y;
        p.y=this.y;
        this.y=y;


    }
    public void  show(){

        System.out.println("["+x+","+y+"]");
    }


    public static void main(String[] args) {
        Point a =new Point();
        a.set(3,5);
        Point b =new Point();
        b.set(2,3);
        System.out.println(a.test(b));
        a.test1(b);
        System.out.println();
           a.show();
        Date data=new Date();
    }


}

