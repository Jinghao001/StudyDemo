public class Array {
    public static void main(String[] args) {
        int array []={1,2,3,4,5,6,7,8};
        int i =0;

        for (i=0;i<8;i++){
            if (i==7){
                i=0;
            }
            System.out.print(array[i]+"\n");
        }

    }
}
