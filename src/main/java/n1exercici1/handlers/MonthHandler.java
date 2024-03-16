package n1exercici1.handlers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import n1exercici1.beans.Month;

public class MonthHandler {

	List<Month> months = new ArrayList<>();
	
	private void loadMonths() {
		
		Month jan = new Month("January");
		months.add(jan);
		
		Month feb = new Month("February");
		months.add(feb);
		
		Month mar = new Month("March");
		months.add(mar);
		
		Month apr = new Month("April");
		months.add(apr);
		
		Month may = new Month("May");
		months.add(may);
		
		Month jun = new Month("June");
		months.add(jun);
		
		Month jul = new Month("July");
		months.add(jul);
		
		Month sep = new Month("September");
		months.add(sep);
		
		Month oct = new Month("October");
		months.add(oct);
		
		Month nov = new Month("November");
		months.add(nov);
		
		Month dec = new Month("December");
		months.add(dec);
		
	}
	
	private void addAugust() {
		
		System.out.println(months.toString());
		Month aug = new Month("August");
		months.add(7, aug);
		System.out.println(months.toString());
		System.out.println();
	}
	
	private void createHashSetMonths() {
		
		Set<Month> setMonths = new HashSet<>();
		System.out.println(setMonths.toString());
		System.out.println();
	}
	
	private void proveNotDuplicate() {
		
		Set<Month> setMonths = new HashSet<>(months);
		setMonths.add(months.get(8));
		System.out.println(setMonths.toString());
		createHashSetMonths();
		System.out.println();
	}
	
	private void iterateMonths() {
		
		for(Month m : months) {
			System.out.print(m + " ");
		}
		
		System.out.println();
		
		months.forEach(m -> System.out.print(m + " "));
		
		System.out.println();
		
		Iterator<Month> it = months.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		
	}
	
	public void initApp() {
		
		loadMonths();
		addAugust();
		createHashSetMonths();
		proveNotDuplicate();
		iterateMonths();
		
	}
}
