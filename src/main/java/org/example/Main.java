package org.example;

public class Main {
    public static void main(String[] args) {

        Worker w = new Worker();
        w.setName("김코딩");
        w.setAge(30);
        w.setId(5);

        String name = w.getName();
        System.out.println("근로자의 이름은 " + name);
        int age = w.getAge();
        System.out.println("근로자의 나이는 " + age);
        int id = w.getId();
        System.out.println("근로자의 ID는 " + id);
    }
}