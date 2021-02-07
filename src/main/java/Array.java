import java.util.Random;

public class Array {


    public static void main(String[] args) {
        int arraySize = 10000;
        MyArray array = new MyArray(arraySize);

        array.fill(arraySize);

        System.out.println("--");

        array.bubbleSort();

        array.selectSort();

        array.insertSort();

        //System.out.println(array.search(5));
        //array.delete(5);
        //array.display();
    }


}
