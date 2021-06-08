package com.softeq.main;

import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VisitorPatternTest {
    List<Integer> list = Arrays.asList(5, 4, 7, 2, 5, 12, 0, 1, 0, 0, 1, 1, 2, 1, 3, 3, 4, 3, 5);

    @Test
    void solve() {
    }

    @Test
    void createValuesArray() {
    }

    @Test
    void findNodeNumber() {
        assertEquals(5, VisitorPattern.findNodeNumber(list));
    }

    @Test
    void findValues() {
        List<Integer> expected = Arrays.asList(4, 7, 2, 5, 12);
        assertEquals(expected, VisitorPattern.findValues(list));
    }

    @Test
    void findColorList() {
        List<Color> expected = Arrays.asList(Color.RED, Color.GREEN, Color.RED, Color.RED, Color.GREEN);
        assertEquals(expected, VisitorPattern.findColorList(list));
    }

    @Test
    void findColorListFaild() {
        List<Color> expected = Arrays.asList(Color.GREEN, Color.RED, Color.RED, Color.GREEN, Color.RED);
        assertNotEquals(expected, VisitorPattern.findColorList(list));
    }
}



