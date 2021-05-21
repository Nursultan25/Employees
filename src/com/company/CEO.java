package com.company;

public class CEO extends Employee {
    boolean hasCompanyCar;

    public CEO(String name, int age, int salary) {
        super(name, age, salary);
    }

    public void setHasCompanyCar(boolean hasCompanyCar) {
        this.hasCompanyCar = hasCompanyCar;
    }

    public boolean isHasCompanyCar() {
        return hasCompanyCar;
    }

    public void print(String name) {
        System.out.println("CEO: " + name);
        System.out.println("Has a company car: " + isHasCompanyCar());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Salary: " + getSalary());
        goPublic(name);
        System.out.println("=======================");
    }

    public void goPublic(String name){
        System.out.println(name + " Says: I own 1,000 shares of AT&T stock");
    }
}
