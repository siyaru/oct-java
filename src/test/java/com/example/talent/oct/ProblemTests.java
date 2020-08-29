package com.example.talent.oct;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProblemTests {

    @DisplayName("1级台阶")
    @Test
    public void test_collect() {
        Problem problem = new Problem();
        assertEquals(problem.collect(new int[]{3}), 0);
    }

    @DisplayName("2级台阶")
    @Test
    public void test_collect_02() {
        Problem problem = new Problem();
        assertEquals(problem.collect(new int[]{3, 2}), 2);
    }

    @DisplayName("3级台阶")
    @Test
    public void test_collect_03() {
        Problem problem = new Problem();
        assertEquals(problem.collect(new int[]{4, 6, 5}), 6);
    }

    @DisplayName("4级台阶")
    @Test
    public void test_collect_04() {
        Problem problem = new Problem();
        assertEquals(problem.collect(new int[]{2, 3, 100, 50}), 100);
    }
    
    @DisplayName("5级台阶")
    @Test
    public void test_collect_05() {
        Problem problem = new Problem();
        assertEquals(problem.collect(new int[]{0, 2, 55, 100, 50}), 105);
    }
}
