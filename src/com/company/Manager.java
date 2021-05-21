package com.company;

public class Manager extends Employee{
    boolean hasStocks;

    public Manager(String name, int age, int salary) {
        super(name, age, salary);
    }

    public void setHasStocks(boolean hasStocks) {
        this.hasStocks = hasStocks;
    }

    public boolean isHasStocks() {
        return hasStocks;
    }

    public void print(String name) {
        System.out.println("Maneger: " + name);
        System.out.println("Has stocks: " + isHasStocks());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Salary: " + getSalary());
        writeProcedures(name);
        System.out.println("=======================");
    }

    public void writeProcedures(String name){
        System.out.println(name + " Says: Today I will be working on a new marketing strategy.");
    }
}
