package aufgabenblatt1_1;

import java.util.List;
import java.util.ArrayList;
import java.lang.Comparable;

public class Student implements Comparable{
	private String name;
	private String nachname;
	private final int matrikelnummer;
	private static int matrikelnummerZaehler;
	List<pruefungsleistung> pruefungsleistungListe=new ArrayList<pruefungsleistung>();
	
	Student(String name, String nachname){
		this.name=name;
		this.nachname=nachname;
		matrikelnummer=matrikelnummerZaehler;
		matrikelnummerZaehler++;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof Student){
			if(this.matrikelnummer==((Student)obj).matrikelnummer){
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode(){
		
		return matrikelnummer;
	}

	@Override
	public int compareTo(Object obj) {
		if(obj instanceof Student){
			return this.matrikelnummer-((Student)obj).matrikelnummer;	
		}
		else
			return 0;
	}
	
	public int compareName(Object obj) {
		if(obj instanceof Student){
			return this.matrikelnummer-((Student)obj).matrikelnummer;	
		}
		else
			return 0;
	}
	
	public int compareNachname(Object obj) {
		if(obj instanceof Student){
			return this.matrikelnummer-((Student)obj).matrikelnummer;	
		}
		else
			return 0;
	}
	
	
	
}
