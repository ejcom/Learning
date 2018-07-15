package lections.onethousand;

import java.util.Arrays;

public class YouTube {
    public static void main(String[] args) {
        int[] data = {20, 50, 40, 10, 30};
        for(int barrier = 0; barrier<=data.length-1; barrier++) {
            for(int index = data.length-2; index>=barrier; index--) {
                if(data[index]>data[index+1]) {
                    swap(data, index);
                }
                System.out.println(Arrays.toString(data));
            }
        }
        System.out.println(Arrays.toString(data));
    }

    private static void swap(int[] array, int k) {
        int tmp = array[k];
        array[k]= array[k + 1];
        array[k + 1]=tmp;
    }

}
