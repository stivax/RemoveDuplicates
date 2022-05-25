package edu.lessons;

import java.util.Arrays;
import java.util.TreeMap;

public class RemoveDuplicates {
    // Имеется массив целых чисел.
    // Сделать так, чтоб в массиве отсутствовали дубликаты,
    // а сам массив состоял из элементов по возрастанию.
    // В качестве результата вывести результирующий массив и мапу
    // в которой будут записаны в качестве ключа элементы массива,
    // а значения кол-во их повторений в исходном массиве.

    public static void main(String[] args) {
        int[] sourceArray = {10, 3, 5, 3, 10, 8, 8, 7, 8, 3};
        removeAndSort(sourceArray);
    }

    private static void removeAndSort(int[] sourceArray) {
        TreeMap<Integer, Integer> mapSort = new TreeMap<>();
        for (int firstValue : sourceArray) {
            int repeat = 0;
            for (int secondValue : sourceArray) {
                if (firstValue == secondValue) {
                    repeat = repeat + 1;
                }
            }
            mapSort.put(firstValue, repeat);
        }

        Integer[] removeDuplicates = mapSort.keySet().toArray(new Integer[0]);

        System.out.println(Arrays.toString(removeDuplicates));
        System.out.println(mapSort);
    }

}
