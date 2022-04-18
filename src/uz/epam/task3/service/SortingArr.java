package uz.epam.task3.service;

public class SortingArr {

    public void sorting(int[] sort) {
        for (int j = 1; j < sort.length; j++) {
            int current = sort[j]; //1-chi indexsini oldim yani qasidur sonni
            int i = j - 1; // massivni indexsini oldim
            while ((i > -1) && (sort[i] > current)) {
                sort[i + 1] = sort[i]; //
                i--;
            }
            sort[i + 1] = current;
        }
    }

    public int iterativeSearch(int[] arrayToSearch, int element) {
        int lowIndex = 0;
        int highIndex = arrayToSearch.length-1;

        int elementPos = -1;

        while (lowIndex <= highIndex) {
            int midIndex = (lowIndex + highIndex) / 2;
            if (element == arrayToSearch[midIndex]) {
                elementPos = midIndex;
                break;
            } else if (element < arrayToSearch[midIndex]) {
                highIndex = midIndex-1;
            } else if (element > arrayToSearch[midIndex]) {
                lowIndex = midIndex+1;
            }
        }
        return elementPos;
    }

    public void printArr(int[] print) {
        for (int i : print
        ) {
            System.out.print(" " + i + " ");
        }
    }
}
