import java.util.Random;

public class MyArray {
    private int[] arr;
    private int size;



    public MyArray(int size) {
        this.arr = new int[size];
        this.size = 0;

    }



    public void display(){
        for (int i = 0; i < this.size; i++) {
            System.out.println(this.arr[i]);
        }
    }

    public void delete(int value){
        int s = 0;

        for (int i = 0; i < this.size; i++) {
            if (this.arr[i] == value) {
                s = i;
                break;
            }
            for (int j = s; j < this.size - 1 ; j++) {
                this.arr[j] = this.arr[j+1];
            }
            size--;

        }
    }

    public void insert(int value){

        this.arr[this.size] = value;
        this.size++;
    }
    public void fill(int index){
        Random random = new Random();
        for (int i = 0; i < index; i++) {
            this.insert(random.nextInt(100));


        }
    }
    public int search(int value){
        int index = 0;
        for (int i = 0; i < this.size; i++) {
            if(this.arr[i] == value) {
                index = i;
                break;
            }
        } return index;
    } 
    public void bubbleSort(){
        int out, in;
        long beginTime = System.nanoTime();
        for (out = this.size -1; out >=1; out--) {
            for (in = 0;in < out; in++) {
                if(this.arr[in] > this.arr[in+1]) swap(in, in+1);
            }

        }
        long endTime = System.nanoTime();
        long workTime = endTime - beginTime;
        System.out.println("---");
        System.out.println("время выполнения bubbleSort "+workTime/1000000+" секунд");

    }

    public void selectSort(){
        int in, out, mark;
        long beginTime = System.nanoTime();
        for (out = 0; out < this.size; out++) {
            mark = out;
                    for(in = out+1; in < this.size; in++){
                        if(this.arr[in] < this.arr[mark]) mark = in;
                    } swap(out, mark);
                }
        long endTime = System.nanoTime();
        long workTime = endTime - beginTime;
        System.out.println("---");
        System.out.println("время выполнения selectSort "+workTime/1000000+" секунд");
    }

    public void insertSort(){
        int in, out;
        long beginTime = System.nanoTime();
        for(out = 1;out < this.size; out++){
            int temp = this.arr[out];
            in = out;
            while(in > 0 && this.arr[in-1] >= temp){
                this.arr[in] = this.arr[in-1];
                in--;
            }
            this.arr[in] = temp;
        }
        long endTime = System.nanoTime();
        long workTime = endTime - beginTime;
        System.out.println("---");
        System.out.println("время выполнения insertSort "+workTime/1000000+" секунд");
    }



    private void swap(int a, int b) {
        int tmp = this.arr[a];
        this.arr[a] = this.arr[b];
        this.arr[b] = tmp;
    }

}

