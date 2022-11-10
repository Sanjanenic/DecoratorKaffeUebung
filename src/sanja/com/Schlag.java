package sanja.com;

public class Schlag extends ZutatDecorator{
    public Schlag(Getraenk getraenk) {
        super(getraenk);
    }

    @Override
    public double kostet() {
        return getraenk.kostet() + 0.7;
    }

    @Override
    public String getBeschreibung() {
        return getraenk.getBeschreibung()+" mit Schlag";
    }
}
