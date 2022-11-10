package sanja.com;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Espresso espresso=new Espresso();

        System.out.println("Espresso kostet: "+ espresso.kostet());


        Milch milch=new Milch(espresso);
        System.out.println("Espresso mit Milich kostet: "+ milch.kostet());

        Schlag schlag=new Schlag(espresso);
        System.out.println("Espresso mit Schlag kostet: "+ schlag.kostet());

        Schlag schlag1=new Schlag(milch);
        System.out.println("Espresso mit Schlag und milchkostet: "+ schlag1.kostet());
        System.out.println(schlag1.getBeschreibung()+ " kostet:"+ schlag1.kostet());

    }
}
