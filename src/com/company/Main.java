package com.company;


public class Main
{
    public static void main(String[] args)
    {
        Human human1 = new Human("Stefan", "Czarnecki", "Lekarz", 28, 73 );
        Human human2 = new Human("Stefan", "Czarnecki", "Lekarz", 28, 73 );
        Car car1 = new Car("Mustang", "Ford", "GD008FB", 2, 5000);

        car1.Czy_Marka(Car.marki.Ford);
        System.out.println(human1.equals((human2)));
        System.out.println(human1.hashCode());
        System.out.println(human2.hashCode());
        System.out.println(human1);
        System.out.println(human2);
    }
}