package lections.brovko;

import java.util.Arrays;

public class ArrayUtil {

    int findIndex (int array[], int element) {
        for(int i=0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    int findElement(int array[], int element) {
        for(int i=0; i<array.length; i++) {
            if (array[i] == element) {
                return array[i];
            }
        }
        return -1;
    }

    boolean hasElement(int array[], int element) {
        for(int i = 0; i< array.length; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }

    int maxElement(int array[]) {
        assert (array.length > 0);
        int currentMax = array[0];
        for(int i = 0; i<array.length; i++) {
            if(array[i]>currentMax) {
                currentMax = array[i];
            }
        }
        return currentMax;
    }

    int minElement(int array[]) {
        assert(array.length>0);
        int currentMin = array[0];
        for (int i = 0; i<array.length; i++) {
            if (array[i] < currentMin) {
                currentMin = array[i];
            }
        }
        return currentMin;
    }

    int findBinary(int array[], int element) {
        if(array != null) {
            int low = 0, high = array.length, mid;
            while (low < high) {
                mid = (low + high)>>>1;
                if (element==array[mid]) {
                    return mid;
                } else {
                    if (element < array[mid]) {
                        high = mid;
                    } else {
                        low = mid+1;
                    }
                }
        }
        return -1;
    }
}
