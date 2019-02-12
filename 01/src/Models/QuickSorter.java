package Models;

public class QuickSorter implements Sorter {

    public void sort(int[] array) {
        int first = 0;
        int last = array.length - 1;

        this.quickSort(array, first, last);
    }

    private void quickSort(int[] array, int first, int last) {
        int middle = first + (last - first) / 2;

        int pivot = array[middle];

        int i = first, j = last;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (first < j)
            quickSort(array, first, j);

        if (last > i)
            quickSort(array, i, last);
    }
}

