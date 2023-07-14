package abstractFactoryPattern;

public class main {
	
	public static void main(String[] args) {
		
		AbstractFactory abstractFactory = AbstractFactoryProducer.getprofession(true) ; 
		
		
		Profession prof = abstractFactory.getProfession("Engineer") ; 
		
		prof.print(); 
		
		
	}

}
