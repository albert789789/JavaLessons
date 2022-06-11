package com.mycompany.prepare.lambda_expressions_and_stream_api;

public class TestLambda {

    public static void main(String[] args) {

        BinaryIntOperation binaryIntSum = (x, y) -> x + y;
        System.out.println(binaryIntSum.op(10, 20));

        I i = Person::someFunc;
        System.out.println(i.f(10, 'a'));

        I1 i1 = Person::new;
        Person p = new Person("Karen", 24);

        I2 i2 = p::getName;
        System.out.println(i2.someString());
    }
}

@FunctionalInterface
interface BinaryIntOperation {
    int op(int a, int b);
}

@FunctionalInterface
interface I {
    int f(int a, char c);
}

@FunctionalInterface
interface I1 {
    Person getPerson(String name, int age);
}

@FunctionalInterface
interface I2 {
    String someString();
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    static int someFunc(int a, char c) {
        return a + c;
    }

}