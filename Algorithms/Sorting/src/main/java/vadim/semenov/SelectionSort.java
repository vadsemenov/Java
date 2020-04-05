package vadim.semenov;

/**
 * The example of "selection sort"
 *
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {5, 6, 0, 1, 2, 4, 3};

        for (int integ : selectionSort(array)) {
            System.out.print(integ + " ");
        }
    }

    public static int[] selectionSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            int jMin = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[jMin]) {
                    jMin = j;
                }
            }
            if (jMin != i) {
                temp = array[i];
                array[i] = array[jMin];
                array[jMin] = temp;
            }
        }
        return array;
    }
}
