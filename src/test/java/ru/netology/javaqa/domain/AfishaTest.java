package ru.netology.javaqa.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaTest {

    @Test
    public void test() {
        Afisha afisha = new Afisha();


        afisha.add("Movie one");
        afisha.add("Movie two");
        afisha.add("Movie three");

        String[] actual = afisha.findAll();
        String[] expected = {"Movie one", "Movie two", "Movie three"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        Afisha afisha = new Afisha();

        afisha.add("Movie one");
        afisha.add("Movie two");
        afisha.add("Movie three");

        String[] actual = afisha.findLast();
        String[] expected = {"Movie three", "Movie two", "Movie one"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        Afisha afisha = new Afisha();
        afisha.add("Movie one");

        String[] actual = afisha.findLast();
        String[] expected = {"Movie one"};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test4() {
        Afisha afisha = new Afisha();


        afisha.add("Movie one");
        afisha.add("Movie two");
        afisha.add("Movie three");
        afisha.add("Movie four");
        afisha.add("Movie five");
        afisha.add("Movie six");
        afisha.add("Movie seven");
        afisha.add("Movie eight");
        afisha.add("Movie nine");
        afisha.add("Movie ten");

        String[] actual = afisha.findAll();
        String[] expected = {"Movie one", "Movie two", "Movie three", "Movie four", "Movie five", "Movie six", "Movie seven", "Movie eight", "Movie nine", "Movie ten"};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void test5() {
        Afisha afisha = new Afisha();


        String[] actual = afisha.findLast();
        String[] expected = {};

        Assertions.assertArrayEquals(actual, expected);
    }
}
