import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.Random;

import Models.*;

public class app {
    public static void main(String[] args) {
        int[] ints = {1, 4, 5, 12, 6};

        Sorter selectionSorter = new SelectionSorter();
        Sorter quickSorter = new QuickSorter();
        Sorter bubbleSorter = new BubbleSorter();

        List<Sorter> sortersList = new ArrayList<>();

        sortersList.add(selectionSorter);
        sortersList.add(bubbleSorter);
        sortersList.add(quickSorter);

        for (Sorter sorter: sortersList) {
            sorter.sort(ints);
            System.out.println(Arrays.toString(ints));
        }
    }
}
        Searcher binarySearcher = new BinarySearcher();
        int randomIndex =new Random().nextInt(ints.length);

        binarySearcher.search(ints, ints[randomIndex]);
    }
}
