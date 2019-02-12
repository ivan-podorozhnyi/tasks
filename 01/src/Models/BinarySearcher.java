package Models;

public class BinarySearcher implements Searcher {

    public void search(int[] array, int number) {
        int first = 0;
        int last = array.length - 1;
        int middle = (first + last) / 2;
        while (first <= last) {
            if (array[middle] < number) {
                first = middle + 1;
            } else if (array[middle] == number) {
                System.out.println("Number " + number + " was found at index: " + middle);
                break;
            } else {
                last = middle - 1;
            }
            middle = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Number " + number + "was not found!");
        }
    }
}

