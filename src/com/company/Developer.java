package com.company;

public class Developer extends Employee {
    private String rangs;

    public Developer(String name, int age, int salary) {
        super(name, age, salary);
    }

    public void setRangs(String rangs) {
        this.rangs = rangs;
    }

    public String getRangs() {
        return rangs;
    }

    public void print(String name) {
        System.out.println("Developer: " + name);
        System.out.println("Rang: " + getRangs());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Salary: " + getSalary());
        writeCode(name);
        System.out.println("=======================");
    }

    public void writeCode(String name){
        System.out.println(name + " Says: Incomprehensible syntax in my code, tried to rewrite it last night");
    }
}
