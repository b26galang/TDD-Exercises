package org.example;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.*;
import java.util.function.Predicate;

public class CollectionTest {

    static Collection collection;

    @BeforeClass
    public static void setUp() {
        collection = new Collection();
    }

    // Test to see if largest integer is returned
    @Test
    public void testFindMax() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);
        integerList.add(8);
        integerList.add(9);
        integerList.add(10);

        Assert.assertEquals(10, Collection.findMax(integerList));
        Assert.assertEquals(1, Collection.findMin(integerList));
    }

    @Test
    public void testRemoveLessThan() {
        Set<Integer> integerSet = new TreeSet<>();
        for(int i = 1; i < 6; i++) {
            integerSet.add(i);
        }

        Collection.removeLessThan(integerSet, 2);
        Assert.assertFalse(integerSet.contains((Integer) 1));
        Assert.assertTrue(integerSet.contains((Integer) 2));
        Assert.assertTrue(integerSet.contains((Integer) 3));
        Assert.assertTrue(integerSet.contains((Integer) 4));
        Assert.assertTrue(integerSet.contains((Integer) 5));
    }

    @Test
    public void testRemoveGreaterThan() {
        Set<Integer> integerSet = new TreeSet<>();
        for(int i = 1; i < 6; i++) {
            integerSet.add(i);
        }

        Collection.removeGreaterThan(integerSet, 2);
        Assert.assertTrue(integerSet.contains((Integer) 1));
        Assert.assertTrue(integerSet.contains((Integer) 2));
        Assert.assertFalse(integerSet.contains((Integer) 3));
        Assert.assertFalse(integerSet.contains((Integer) 4));
        Assert.assertFalse(integerSet.contains((Integer) 5));
    }

    @Test
    public void testRemoveHalf() {
        Queue<String> foods = new PriorityQueue<>();
        foods.add("sushi");
        foods.add("ramen");
        foods.add("udon");
        foods.add("tempura");
        foods.add("yakisoba");
        foods.add("katsu");
        foods.add("mochi");
        foods.add("miso soup");

        Collection.removeHalf(foods);
        Assert.assertEquals(4, foods.size());
    }




}
