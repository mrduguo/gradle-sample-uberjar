package com.github.mrduguo.gradle.sampleuberjar;


public class World {

    public static void main(String... args) {
        System.out.println(new World().sayHello());
    }

    public String sayHello() {
        return "Hello My World";
    }

}
