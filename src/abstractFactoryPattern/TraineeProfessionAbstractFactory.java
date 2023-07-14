package abstractFactoryPattern;

public class TraineeProfessionAbstractFactory extends AbstractFactory {

	@Override
	Profession getProfession(String professionType) {
	if(professionType==null) {
		return null ; 
	}
	else if (professionType.equalsIgnoreCase("Engineer")) {
		return new TraineeEngineer() ; 
	}
	else if (professionType.equalsIgnoreCase("Doctor")) {
		return new TraineeDoctor() ; 
	}
		return null;
	}

}
