package proekt_31;

public class Dostava {
	public static void main(String[]args) {
		String lokacija=new String("Naselba1, Zgrada2");
		AdresaLok adresa1=new AdresaLok(15, lokacija);
		Kupuvac tom=new Kupuvac(1212, adresa1);
		System.out.println("KupuvacID:" + tom.getKupuvacID());
		System.out.println("StanBr:" + tom.getAdresaLinija().getStanBr());
		System.out.println("Lokacija:" + tom.getAdresaLinija().getLokacija());
		System.out.println();
		
		AdresaLok adresa2=new AdresaLok(32, lokacija);
		Kupuvac marko=new Kupuvac(1673, adresa2);
		System.out.println("KupuvacID" + marko.getKupuvacID());
		System.out.println("StanBr:" + marko.getAdresaLinija().getStanBr());
		System.out.println("Lokacija:" + marko.getAdresaLinija().getLokacija());
		
	}
}


