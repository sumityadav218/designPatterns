package abstractFactoryPattern;

public class ProfessionAbstractFactory extends AbstractFactory {

	@Override
	Profession getProfession(String professionType) {
	if(professionType==null) {
		return null ; 
	}
	else if (professionType.equalsIgnoreCase("Engineer")) {
		return new Engineer() ; 
	}
	else if (professionType.equalsIgnoreCase("Doctor")) {
		return new Doctor() ; 
	}
		return null;
	}

}
