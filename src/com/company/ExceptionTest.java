package com.company;

public class ExceptionTest {
    public static void test() throws Exception {
        try {
            throw new Exception("A");
        } finally {
            throw new Exception("B");
        }
    }

    public static void main(String[] args) {
        try {
            ExceptionTest.test();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
