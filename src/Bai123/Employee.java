package Bai123;

public abstract class Employee {
    protected String name;
    protected int age;
    protected double salary;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract double calculateSalary();
}