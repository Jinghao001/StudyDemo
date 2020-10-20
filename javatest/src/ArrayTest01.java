import com.sun.corba.se.impl.orb.ParserTable;

public class ArrayTest01 {
    public static void main(String[] args) {
        int number [][]={ {1,2,3},
                     {4,5,6},
                {7,6,9}


        };
        System.out.println(number[0][2]);
        int number01[][] = new int[3][3] ;
        number01[0][0]=1;
        number01[0][1]=2;
        number01[0][2]=3;
        number01[1][0]=4;
        number01[1][1]=5;
        number01[1][2]=6;
        number01[2][0]=7;
        number01[2][1]=8;
        number01[2][2]=9;
        System.out.println(number01[2][2]);

    }


}
