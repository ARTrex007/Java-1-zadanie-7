package com.company;

public class Human
{
    public boolean equals(Object obj)
    {
        return this.wiek == ((Human)obj).wiek;
    }

    public int hashCode()
    {
        return this.wiek;
    }

    public String imie, nazwisko, zawod, animal_pet;
    public int wiek;
    public double masa;
    public String samochod;
    public static int counter=0;

    public Human(String imie, String nazwisko, String zawod, int wiek, double masa) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.zawod = zawod;
        this.wiek = wiek;
        this.masa = masa;
        //this.animal_pet = animal_pet;
        System.out.println("Utworzono obiekt HUMAN numer: " + counter);
        counter++;
    }

    public String toString()
    {
        return imie+" "+nazwisko+" "+zawod+" "+wiek+" "+masa;
    }

    void Rejestracja_Samochodu(String samochod)
    {
        this.samochod = samochod;
        System.out.println(imie + " " + nazwisko + " posiadł samochód o rejestracji: " + this.samochod);
    }
}
