//2. Inside the animal package, create two more packages called carnivore and herbivore 	
	package animal.carnivore;
	
	import animal.Animal;

//4. Inside the carnivore package, create a class called Lion that implements the Animal interface. ->
	public class Lion implements Animal{ 
	
// -> Implement the "speak" method returning a string that says "The lion roars!"
	@Override
	public String speak() {
		return "The lion roars!";
	}

}
