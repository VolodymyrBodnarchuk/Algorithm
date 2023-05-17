

public class Main {
    public static void main(String[] args) {
        int []array = new int[10];
        randomize(array);


        System.out.println("Sort Bubble: ");
        printArray(array);
        Sorts.sortBubble(array);
        printArray(array);
        randomize(array);

        System.out.println("Sort Choice: ");
        printArray(array);
        Sorts.insertionSort(array);
        printArray(array);
        randomize(array);

    }

    public static void printArray(int[] array){
        System.out.print("[ ");
        for (int i = 0; i < array.length;i++){
            if(i>0){
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println(" ]");
    }
    public static void randomize(int[] arr){
        for(int i = 0;i < arr.length; i++){
            arr[i] = (int) (Math.random() * 50);
        }
    }
}