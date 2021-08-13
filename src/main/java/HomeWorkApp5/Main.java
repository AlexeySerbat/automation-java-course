package HomeWorkApp5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"123", "456", "789", "qwe"};
        System.out.println(Arrays.toString(arr));
        swapElementsOfArray(arr, 1, 2);
        System.out.println(Arrays.toString(arr));

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        Box<Apple> box1 = new Box<Apple>(apple1, apple2, apple3);
        Box<Orange> box2 = new Box<Orange>(orange1, orange2);

        System.out.println(box1.compare(box2));

        Box<Orange> box3 = new Box<Orange>();
        box2.transfer(box3);
    }

    private static <T> void swapElementsOfArray(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
