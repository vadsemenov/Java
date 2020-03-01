package vadim.semenov;

/**
 * The example of "bubble sort"
 *
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {5, 6, 0, 1, 2, 4, 3};

        for (int integ : bubbleSort(array)) {
            System.out.print(integ + " ");
        }
    }

    public static int[] bubbleSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
