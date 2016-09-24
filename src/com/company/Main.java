package com.company;

public class Main {

    public static void main(String[] args) {

        String a = "A", b;
        b = a;
        System.out.println("a == b : " + (a == b));
        System.out.println("a.equals(b) : " + a.equals(b));

        String c = new String("A");
        System.out.println("c == a : " + (c == a));
        System.out.println("c.equals(a) : " + c.equals(a));

        String d = new String("B");
        System.out.println("a == d : "+ (a == d));
        System.out.println("a.equals(d)" + a.equals(d));
        d = "A";
        System.out.println("a == d : " + (a == d));
        System.out.println("a.equals(d)" + a.equals(d));
        System.out.println("c == d : " + (c == d));
        System.out.println("c.equals(d)" + c.equals(d));
    }
}
