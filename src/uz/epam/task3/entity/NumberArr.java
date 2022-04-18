package uz.epam.task3.entity;

import java.util.Arrays;
import java.util.StringJoiner;

public class NumberArr {

    int [] customArray;

    public NumberArr(int[] customArray) {
        this.customArray = customArray;
    }



    public int[] getCustomArray() {
        return customArray;
    }

    public void setCustomArray(int[] customArray) {
        this.customArray = customArray;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NumberArr numberArr = (NumberArr) o;

        return Arrays.equals(customArray, numberArr.customArray);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(customArray);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", NumberArr.class.getSimpleName() + "[", "]")
                .add("customArray=" + Arrays.toString(customArray))
                .toString();
    }
//    private String string;
}
