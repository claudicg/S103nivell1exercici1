package n1exercici1.handlers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Demostrar {

	List<String> months = new ArrayList<>();
	
	private void afegirAugust() {
		
		months.add("January");
		months.add("February");
		months.add("March");
		months.add("April");
		months.add("May");
		months.add("June");
		months.add("July");
		months.add("September");
		months.add("October");
		months.add("November");
		months.add("December");
		
		System.out.println(months.toString());
		months.add(7, "August");
		System.out.println(months.toString());
		System.out.println();
	}
	
	private void crearHashSetMonths() {
		
		Set<String> setMonths = new HashSet<String>(months);
		System.out.println(setMonths.toString());
		System.out.println();
	}
	
	private void demostrarNoDuplicats() {
		
		Set<String> setMonths = new HashSet<String>(months);
		setMonths.add("August");
		System.out.println(setMonths.toString());
		crearHashSetMonths();
		System.out.println();
	}
	
	private void recorrerMonths() {
		
		for(String m : months) {
			System.out.print(m + " ");
		}
		
		System.out.println();
		
		months.forEach(m -> System.out.print(m + " "));
		
		System.out.println();
		
		Iterator<String> it = months.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		
	}
	
	public void desplegarDemostracio() {
		
		afegirAugust();
		crearHashSetMonths();
		demostrarNoDuplicats();
		recorrerMonths();
		
	}
}
