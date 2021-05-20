import java.util.ArrayList;

public class FirstProblem {
    public static void IntegerDivide (int[] array, int nunber){
        if(array == null || array.length == 0){
            System.out.print("Invalid Input");
            return;
        }
        int bigger = 0, smaller = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > nunber){
                bigger++;
            }
            else if(array[i] < nunber){
               smaller++;
            }
        }

        System.out.print("above: " + bigger + ", below : " + smaller);
    }

    public static void main(String[] args){
        int[] testArray = new int[] {1, 5, 2, 1, 10};
        IntegerDivide(testArray, 6);
    }
}
