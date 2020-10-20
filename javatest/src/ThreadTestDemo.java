import jdk.internal.dynalink.beans.StaticClass;

public class ThreadTestDemo {
     void xtest (){
        int x = 0;
        int i = 0;
        for (i=0;i<100;i++){
            x++;
            System.out.print("x的运行结果是"+x);
        }

    }
           void ytest (){
        int y = 0;
        int j = 0;
        for (j=0;j<100;j++){
            y++;
            System.out.print("y的运行结果是"+y);
            this.xtest();
        }


    }

    public static void main(String[] args) {
        Thread thread =new Thread(){
            @Override
            public void run () {


            }

        };
        Thread thread1 = new Thread(){
            @Override
            public void run(){

            }
        };


        thread.start();
        thread1.start();
    }
}
