package test;
public class Two {
    static {
        System.err.println("Two");
        One.m1();
    }
}
