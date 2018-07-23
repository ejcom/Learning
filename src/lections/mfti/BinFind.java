package lections.mfti;

public class BinFind {
    public static void main(String[] args) {
        int[] array = {1,2,6,8,9,10,13,15,19,21};
        System.out.println(binFind(array, 10));
        System.out.println(binFind(array, 2));
        System.out.println(binFind(array, 19));
        System.out.println(binFind(array, 5));
        System.out.println(binFind(array, 0));
        System.out.println(binFind(array, 22));

    }

    static boolean binFind(int[] array, int key)
    {
        int leftBound = leftBound(array, key);
        int rightBound = rightBound(array, key);
        if (Math.abs(leftBound-rightBound) > 1)
        {
            return true;
        } else {
            return false;
        }
    }

    static int leftBound (int[] array, int key)
    {
        int left = -1;
        int right = array.length;
        int middle;
        while (right-left > 1)
        {
            middle = (left+right)>>>1;
            if (array[middle] < key)
            {
                left = middle;
            } else {
                right = middle;
            }
        }
        return left;
    }

    static int rightBound (int[] array, int key)
    {
        int left = -1;
        int right = array.length;
        int middle;
        while (right-left > 1)
        {
            middle = (left+right)>>>1;
            if (array[middle] <= key)
            {
                left = middle;
            } else {
                right = middle;
            }
        }
        return right;
    }
}
