

public class ThreadTest {
    public static void main(String[] args) {

        Thread thread = new Thread(){
           @Override
            public void run() {
                ytest();
            }
        };
        Thread thread2 = new Thread(){
            @Override
            public void run() {
                xtest();
            }
        };
//        Thread thread1 =new Thread();
    thread.start();
    thread2.start();

    }
   public static  void ytest() {
        int i = 0;
        int y = 0;

        for (i = 0; i < 100; i++) {
            y++;
            System.out.println("y的运行结果是"+y);
        }

    }


   static void xtest(){
       int j = 0;

       int x = 0;
        for (j=0; j<100; j++){
            x++;
            System.out.println("x的运行结果是"+x);


        }
        }


    }

