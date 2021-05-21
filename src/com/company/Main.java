package com.company;

public class Main {

    public static void main(String[] args) {
        //Specialists
        Specialist Chris = new Specialist("Chris", 23, 3500);
        Specialist Kevin = new Specialist("Kevin", 21, 3200);
        Specialist Bill = new Specialist("Bill", 28, 3150);

        Chris.setLevels(3);
        Kevin.setLevels(2);
        Bill.setLevels(1);

        Chris.print("Chris");
        Kevin.print("Kevin");
        Bill.print("Bill");

        //Developers
        Developer james = new Developer("James", 32, 4500);
        Developer diana = new Developer("Diana", 22, 3600);
        Developer bruce = new Developer("Bruce", 41, 6800);
        Developer barry = new Developer("Barry", 19, 3100);

        james.setRangs("middle");
        diana.setRangs("junior");
        bruce.setRangs("senior");
        barry.setRangs("junuor");

        james.print("James");
        diana.print("Diana");
        bruce.print("Bruce");
        barry.print("Barry");

        //Managers

        Manager kareem = new Manager("Kareem", 42, 7807);
        Manager hakeem = new Manager("Hakeem", 38, 7650);

        kareem.setHasStocks(false);
        hakeem.setHasStocks(true);

        kareem.print("Kareem");
        hakeem.print("Hakeem");

        //CEO

        CEO donald = new CEO("Donald", 54, 35000);

        donald.setHasCompanyCar(true);

        donald.print("Donald");
    }
}
