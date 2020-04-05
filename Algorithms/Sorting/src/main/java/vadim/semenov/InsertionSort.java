package vadim.semenov;

/**
 * The example of "insertion sort"
 *
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {5, 6, 0, 1, 2, 4, 3};

        for (int integ : insertionSort(array)) {
            System.out.print(integ + " ");
        }
    }

    public static int[] insertionSort(int[] array) {
        return array;
    }
}
