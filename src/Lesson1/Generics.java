package Lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
//1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
//2. Написать метод, который преобразует массив в ArrayList;
class Generic {
    public static void replace(Object[] obj) {
        Object[] a = new Object[obj.length];
        for (int i = 0; i < obj.length - 1; i++) {
            Object tmp = obj[i];
            a[i] = obj[i + 1];
            a[i + 1] = tmp;
            i++;
        }

        int s = obj.length - 1;
        if (s % 2 == 0) {
            a[s] = obj[s];
        }
        System.out.println("Преобразованный массив: " + Arrays.toString(a) + "\n");
    }

    public static <T> List<T> lists (Object[] obj){
        List<T > list = new ArrayList<T>((Collection<? extends T>) Arrays.asList(obj));
        return list;
    }

    public static void main(String[] args) {
        String[] arr1 = new String[]{"волна", "арбуз", "клава", "bed", "sun", "orange", "face", "mouse"};
        Integer[] arr2 = new Integer[]{1, 5, 7, 9, 5};
        Double[] arr3 = new Double[]{1.2, 2.0, 5.6, 8.0};

        System.out.println("Исходный массив: " + Arrays.toString(arr1));
        replace(arr1);
        System.out.println("Исходный массив: " + Arrays.toString(arr2));
        replace(arr2);
        System.out.println("Исходный массив: " + Arrays.toString(arr2));
        replace(arr3);

        System.out.println("Преобразование массива в ArrayList:");
        System.out.println(lists(arr1));

        System.out.println(lists(arr2));
    }
}