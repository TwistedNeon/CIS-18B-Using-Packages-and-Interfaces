//1. Create a package called animal
	package animal;

//3. Inside the animal package, create an interface called Animal ->
	public interface Animal { 
	
// -> that has one method called "speak" that returns a string. 
// Create a default implementation for this method that returns "This animal doesn't speak";
	default String speak() {
		return "This animal can't speak!";
	};
	
}
