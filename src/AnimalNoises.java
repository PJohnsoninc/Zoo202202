import model.Cat;
import model.Dog;

public class AnimalNoises {
	
	// add your animal class to the model package
	// only push this file and the animal class you created

	public static void main(String[] args) {
		Cat garfield = new Cat();
		System.out.println(garfield.speak());
		
		Dog brian = new Dog();
		System.out.println(brian.speak());

	}

}