package factoryMethod;

public class Main {

	//client layer or the main layer 
	
	//client is creating the object of factory . and it is responsibilty  of the factory to create the 
	//further necessary object which client is demanding 
	public static void main(String[] args) {
		//client creating object of factory class
		FactoryProfession prof = new  FactoryProfession() ; 
		
		// client asking to create engineer class by help of factory 
		Profession engineer = prof.getProfession("engineer");
		
		
		engineer.print();
		
	}
}
