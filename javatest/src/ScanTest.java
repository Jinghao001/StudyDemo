import sun.swing.MenuItemLayoutHelper;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class ScanTest {

    public static void main(String[] args) {
        System.out.println("Welcome to the zoo");
        Scanner scanner = new Scanner(System.in);
        int i=0;
        //ifloop
        Boolean a=(true);
        Boolean b=(false);
        int count =0;
        if(a){
            System.out.println("this is a good choice!");
            count++;

        }
        if (b){
            System.out.println("this is a bad choice!");

        }
        count--;
        if(a){
            System.out.println("this is a good choice!");
            count++;

        }
        if(a){
            System.out.println("this is a good choice!");
            count++;

        }
        System.out.println("gameover this is you score");
        System.out.println("Your score is" + count);
    }
}
