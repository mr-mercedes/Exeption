package ru.ru.exeption.exep001.homework;

import java.util.Arrays;

/*
    Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
    и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
    Если длины массивов не равны, необходимо как-то оповестить пользователя.
    Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
 */
public class Task02 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = {9, 0, 7, 6, 5, 4, 3, 2, 1};
        int[] result = divOfArr(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }

    private static int[] divOfArr(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null){
            throw new RuntimeException("Some array is null");
        }
        if (arr1.length != arr2.length){
            throw new RuntimeException("Length of arrays not equal");
        }
        int[] arr = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0 || arr2[i] == 0){
                throw new RuntimeException("Arithmetic error, divide by zero");
            }
            arr[i] = arr1[i] / arr2[i];

        }
        return arr;
    }
}
