package sanja.com;

public class Espresso extends Getraenk{

//konstruktor
    public Espresso(){
        beschreibung = "Espresso";
    }

    @Override
    public double kostet() {
        return 2.5;
    }
}
