package uz.epam.task3;

import uz.epam.task3.entity.NumberArr;
import uz.epam.task3.service.SortingArr;

public class Main {
    public static void main(String[] args) {

        int [] arr = {10,5,23,7,43,54,3,55,9};

        NumberArr numberArr = new NumberArr(arr);

        SortingArr sortingArr =new SortingArr();

        sortingArr.sorting(arr);

        System.out.println(sortingArr.iterativeSearch(arr, 43));
        System.out.println();

        sortingArr.printArr(arr);

    }
}
