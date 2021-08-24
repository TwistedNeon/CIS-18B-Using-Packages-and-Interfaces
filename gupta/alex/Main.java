//6. At the root of the project, create another package called <your last name>.<your first name>
	package gupta.alex;

	import animal.carnivore.Lion;
	import animal.herbivore.Giraffe;
	
//7. Inside this package create a class called Main
	public class Main {

	public static void main(String[] args) {
		
//8. Inside the Main class, instantiate one instance of the Lion class -> 
		Lion lion = new Lion();
		
// -> and one instance of the Giraffe class. ->
		Giraffe giraffe = new Giraffe();
		
// -> Use System.out.printl to output the speak method for both of these objects.
		System.out.println(lion.speak());
		System.out.println(giraffe.speak());
	}

}
