package com.company;


public class Main {

    public static void main(String[] args) {

        /*
        *
        *  String tutorial.
        *  Explanation about equals and ==
        *
        *  */
        /*String a = "A", b;
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
        System.out.println("c.equals(d)" + c.equals(d));*/



//        Object object = new Object();
//        int hCode;
//        hCode = object.hashCode();
//        System.out.println(hCode);

        BlackBox firstObject = new BlackBox(5, 4);
        BlackBox secondObject = new BlackBox(5, 4);
        System.out.println(firstObject.equals(secondObject)); // false. If we will use default implementation of equals method Object.
        System.out.println(firstObject.hashCode() == secondObject.hashCode()); // false. If we will use default implementation of hashCode method Object.

        BlackBox thirdObject = secondObject;
        System.out.println(thirdObject.equals(secondObject)); // same objects
        System.out.println(thirdObject.hashCode() == secondObject.hashCode()); // same objects


    }
}
