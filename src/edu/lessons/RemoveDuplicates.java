package edu.lessons;

import java.util.TreeMap;

public class RemoveDuplicates {
    // Имеется массив целых чисел.
    // Сделать так, чтоб в массиве отсутствовали дубликаты,
    // а сам массив состоял из элементов по возрастанию.
    // В качестве результата вывести результирующий массив и мапу
    // в которой будут записаны в качестве ключа элементы массива,
    // а значения кол-во их повторений в исходном массиве.

    public static void main(String[] args) {
        int[] mas = {10, 3, 5, 3, 10, 8, 8, 7};
        System.out.println(removeAndSort(mas));
    }

    private static TreeMap<Integer, Integer> removeAndSort(int[] mas) {
        int[] masSort;
        TreeMap<Integer, Integer> mapSort = new TreeMap<>();
        for (int i = 0; i < mas.length; i++) {
            int repeat = 0;
            for (int j = 0; j < mas.length; j++) {
                if (mas[i] == mas[j]) {
                    repeat = repeat + 1;
                }
            }
            mapSort.put(mas[i], repeat);
        }
        return mapSort;
    }

}
