public class HomeWorkApp2 {
    public static void main(String[] args) {
        int[] array = {4, 6, 23, 11, 32, 55, 42};

        sumInRange(5, 10);                                  // task #1
        verifyNum(-5);                                            // task #2
        verifyNumIsCorrect(-3);                                   // task #3
        printStringSevTimes("Hello World!", 5);       // task #4
        isLeapYearBool(2020);                                 // task #5
        replaceOneToZero();                                      // task #6
        createArr(100);                                       // task #7
        changeArray();                                           // task #8
        createSquareArray(4);                               // task #9
        retLenArr(5,8);                           // task #10
        findMinMax();                                            // task #10.1
        checkArray(array);                                       // task #10.2
        arrayShiftNTimes(array, 1);                           // task ***
    }

    public static boolean sumInRange(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20){
            return true;
        } else {
            return false;
        }
    }

    public static void verifyNum(int num) {
        if(num >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    public static boolean verifyNumIsCorrect(int num) {
        if(num >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printStringSevTimes(String value, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(value);
        }
    }

    public static boolean isLeapYearBool(int x) {
        return x % 4 == 0 && x % 100 != 0 || x % 400 == 0;
    }

    public static int[] replaceOneToZero(){
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for(int i = 0; i < array.length; i++){
            array[i] = (array[i] == 0)? 1 : 0;
        }
        return array;
    }


    public static int[] createArr(int n) {
        int[] array = new int[n];
        for (int i = 1; i <= n; i++) {
            array[i-1] = i;
        }
        return array;
    }

    static int[] changeArray() {
        int[] array = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < array.length; i++)
            if (array[i] < 6)
                array[i] *= 2;
        return array;
    }

    public static void createSquareArray(int size){
        int[][] sqrArray = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                sqrArray[i][j] = (i == j || j == (size - i - 1))? 1 : (int)(Math.random()*100);
                System.out.printf("%4d", sqrArray[i][j]);
            }
            System.out.println();
        }
    }

    public static void retLenArr (int len, int initialValue){
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void findMinMax() {
        int[] array = {4, 1, 2, 3, 17, 5, 12};
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min + " " + max);
    }

    public static boolean checkArray(int[] array){
        int sumLeft = 0;
        for(int i = 0; i < array.length; i++){
            sumLeft += array[i];
            int sumRight = 0;
            for (int j = 0; j < array.length; j++){
                sumRight += (j > i)? array[j] : 0;
            }
            if(sumLeft == sumRight){
                return true;
            }
        }
        return false;
    }

    public static void arrayShiftPositive(int[] array) {
        int m = array.length - 1;
        int last = array[m];
        for (int i = m; i > 0 ; i--) {
            array[i] = array[i - 1];
        }
        array[0] = last;
    }
    public static void arrayShiftNegative(int[] array) {
        int m = array.length - 1;
        int first = array[0];
        for (int i = 0; i < m; i++) {
            array[i] = array[i + 1];
        }
        array[m] = first;
    }


    public static void arrayShiftNTimes(int[] array, int n) {
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                arrayShiftPositive(array);
            }
        } else if (n < 0) {
            n = -n;
            for (int i = 1; i <= n; i++) {
                arrayShiftNegative(array);
            }
        }
    }
}
