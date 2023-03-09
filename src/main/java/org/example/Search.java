package org.example;

public class Search {

    public static int exponentialSearch(int[] arr, int target) {
        int n = arr.length;
        if (n == 0) {
            return -1; // array is empty
        }
        if (arr[0] == target) {
            return 0;
        }
        int i = 1;
        while (i < n ){
            if (arr[i] <= target) {
            i = i*2;
        }
        int l = i / 2;
        int r = i - 1;
        if (r >= n) {
            r = n - 1;
        }
        while (l <= r) {
            int temp = (r - l)/2;
            int m = l + temp;
            if (arr[m] == target) {
              return m;
            } else if (arr[m] < target) {
                l = m + 1;
                if (l > r) {
                    return -1; // target not found
                }
      }
            else {
                r = m - 1;
                if (l > r) {
                    return -1; // target not found
                }
            }
        }
        return -1; // target not found
    }


    }