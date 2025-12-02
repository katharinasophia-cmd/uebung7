package h3;

public class H3_main {
	
	public static void main(String[] args) {
		
		Mensch MenschObjekt1 = new Mensch ();
		
		int gebJahr = 2005;
		String name = "Katharina";
		
		MenschObjekt1.setName(name);
		MenschObjekt1.setGebJahr(gebJahr);
		MenschObjekt1.setAlter ();
		
		System.out.println("Name: " + MenschObjekt1.getName());
        System.out.println("Geburtsjahr: " + MenschObjekt1.getGebJahr());
        System.out.println("Alter: " + MenschObjekt1.getAlter());
		
		
	}

}
