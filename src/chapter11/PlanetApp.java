package chapter11;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.paint.Color;
import static chapter11.PlanetPredicates.*;

public class PlanetApp {

	public static void main(String[] args) {
		Planet mercury = new Planet("Mercury",Color.GRAY,0,false);
		Planet venus = new Planet("Venus",Color.YELLOW,0,false);
		Planet earth = new Planet("Earth",Color.BLUE,1,false);
		Planet mars = new Planet("Mars",Color.RED,2,false);
		Planet jupiter = new Planet("Jupiter",Color.YELLOW,67,true);
		Planet saturn = new Planet("Saturn",Color.ORANGE,62,true);
		Planet uranus = new Planet("Uranus",Color.TEAL,27,true);
		Planet neptune = new Planet("Neptune",Color.BLUE,14,true);
		
		List<Planet> planetList = new ArrayList<>();
		planetList.add(mercury);
		planetList.add(venus);
		planetList.add(earth);
		planetList.add(mars);
		planetList.add(jupiter);
		planetList.add(saturn);
		planetList.add(uranus);
		planetList.add(neptune);
		
		//Which Planets have rings
		System.out.println("Has one or more rings: " + 
		listFilteredPlanets(planetList,(Planet p) -> p.isRinged()));
		
		//Which Planets are blue ans have moons
		System.out.println("Has moons ans is blue: ");
		planetList.stream().filter(p -> p.getPrimaryColor() == Color.BLUE &
				(p.getNumberOfMoons() > 0)).forEach(s -> System.out.println(s + " "));
		
		//Which Planets have more than 20 moons 
		System.out.println("\nHas more than 20 moons: " + 
				filterPlanets(planetList, hasMoonsMoreThan(20)));
		
		//Which Planet has a color
		planetList.stream().filter(hasAColor()).forEach(s -> System.out.println("\nHas a color: " + s));
		
		//which planets have moons 
		planetList.removeIf((Planet p) -> p.getNumberOfMoons() == 0);
		System.out.println("\nHas one or more moons: " + planetList);
	}
}
