public class Sorts {
    //Сортування вставкою
    public static void insertionSort(int[] array){
        int n = array.length;
        for(int i = 1; i < n;i++){
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }


    // Сортування бульбашкою
    public static void sortBubble(int[] array){
        int n = array.length;
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

}
