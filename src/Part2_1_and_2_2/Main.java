package Part2_1_and_2_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("date");
        list.add("elderberry");

        String key = "banana";
        int beginIdx = 1;
        int endIdx = 3;
        int index = recLinearSearch(list, key, beginIdx, endIdx);
        int[] a = { 2, 4, 6, 8, 10 };
        int search = 9;
        int index2 = binarySearch(a, search);
        int[] a2 = { 2, 3, 5, 10, 16, 24, 32, 48, 96, 120, 240, 360, 800, 1600 };
        int search2 = 10;//Part 2.4 Tracing key 150
        int index3 = recursiveBinarySearch(a2, search2, 3, a2.length - 1);

        if (index == -1) {
            System.out.println("Key not found in range");
        } else {
            System.out.println("Key found at index " + index);
        }

        if (index2 != -1) {
            System.out.println(search + " found at index " + index2);
        } else {
            System.out.println(search + " not found in array");
        }
        if (index3 != -1) {
            System.out.println(search2 + " found at index " + index3);
        } else {
            System.out.println(search2 + " not found in array");
        }
    }

    public static int recLinearSearch(ArrayList<String> list, String key, int beginIdx, int endIdx) {
        if (beginIdx > endIdx) {
            // Key not found in range
            return -1;
        } else if (list.get(beginIdx).equals(key)) {
            // Key found at beginning of range
            return beginIdx;
        } else {
            // Recursively search the remaining range
            return recLinearSearch(list, key, beginIdx + 1, endIdx);
        }
    }
    public static int binarySearch(int[] a, int search) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == search) {
                return mid;
            } else if (a[mid] < search) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // Search value not found in array
    }
    public static int recursiveBinarySearch(int[] a, int search, int low, int high) {
        if (low > high) {
            return -1; // Search value not found in array
        }
        int mid = (low + high) / 2;
        if (a[mid] == search) {
            return mid;
        } else if (a[mid] < search) {
            return recursiveBinarySearch(a, search, mid + 1, high);
        } else {
            return recursiveBinarySearch(a, search, low, mid - 1);
        }
    }

}

