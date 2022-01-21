import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class binarySearchTest {
    int[] arr7 = {1, 3, 4, 5, 7, 8, 9};
    int[] arr8 = {1, 3, 4, 5, 7, 8, 9, 10};
    int[] arr5 = {22, 23, 25, 26, 27};
    int[] arr10 = {1, 2, 3, 4, 5, 6, 8, 9, 10, 11};

    @Test
    void binarySearchMethodLen7()
    {
        int expected = 4;
        int actual = binarySearch.binarySearchMethod(arr7, 7);
        assertEquals(expected, actual);
    }

    @Test
    void binarySearchMethodLen7_not()
    {
        int expected = -1;
        int actual = binarySearch.binarySearchMethod(arr7, 70);
        assertEquals(expected, actual);
    }

    @Test
    void binarySearchMethodLen8()
    {
        int expected = 4;
        int actual = binarySearch.binarySearchMethod(arr8, 7);
        assertEquals(expected, actual);
    }

    @Test
    void binarySearchMethodLen8_not()
    {
        int expected = -1;
        int actual = binarySearch.binarySearchMethod(arr8, 900);
        assertEquals(expected, actual);
    }

    @Test
    void binarySearchMethodLen5()
    {
        int expected = 2;
        int actual = binarySearch.binarySearchMethod(arr5, 25);
        assertEquals(expected, actual);
    }

    @Test
    void binarySearchMethodLen5_not()
    {
        int expected = -1;
        int actual = binarySearch.binarySearchMethod(arr5, 30);
        assertEquals(expected, actual);
    }

    @Test
    void binarySearchMethodLen10()
    {
        int expected = 5;
        int actual = binarySearch.binarySearchMethod(arr10, 6);
        assertEquals(expected, actual);
    }

    @Test
    void binarySearchMethodLen10_not()
    {
        int expected = -1;
        int actual = binarySearch.binarySearchMethod(arr10, 7);
        assertEquals(expected, actual);
    }
}