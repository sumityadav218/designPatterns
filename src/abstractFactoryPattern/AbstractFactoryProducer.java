package abstractFactoryPattern;

public class AbstractFactoryProducer {
	
	public static AbstractFactory getprofession (boolean isTrainee) {
		
		if(isTrainee) {
			return new TraineeProfessionAbstractFactory();
		}
		
		else return new ProfessionAbstractFactory(); 
		
	}

}
