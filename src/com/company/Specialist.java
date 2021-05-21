package com.company;

public class Specialist extends Employee {
    private int levels;

    public Specialist(String name, int age, int salary) {
        super(name, age, salary);
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    public int getLevels() {
        return levels;
    }

    public void print(String name) {
        System.out.println("Specialist: " + name);
        System.out.println("Level: " + getLevels());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Salary: " + getSalary());
        workWithClients(name);
        System.out.println("=======================");
    }

    private void workWithClients(String name){
        System.out.println(name + " Says: Tell me what the problem is? I will solve it");
    }
}
