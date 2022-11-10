package sanja.com;

public class Milch extends ZutatDecorator{

    public Milch(Getraenk getraenk) {
        super(getraenk);
    }

    @Override
    public double kostet() {
        return getraenk.kostet()+0.5;
    }

    @Override
    public String getBeschreibung() {
        return getraenk.getBeschreibung() + " mit Milch";
    }
}
