import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Models.SelectionSorter;
import Models.MergeSorter;
import Models.BubbleSorter;
import Models.Sorter;


public class app {
    public static void main(String[] args) {
        int[] ints = {1, 4, 5, 12, 6};

        Sorter selectionSorter = new SelectionSorter();
        Sorter mergeSorter = new MergeSorter();
        Sorter bubbleSorter = new BubbleSorter();

        List<Sorter> sortersList = new ArrayList<>();

        sortersList.add(selectionSorter);
        sortersList.add(bubbleSorter);
        sortersList.add(mergeSorter);

        for (Sorter sorter: sortersList) {
            sorter.sort(ints);
            System.out.println(Arrays.toString(ints));
        }
    }
}
