package factoryMethod;

public class FactoryProfession {
	
	public Profession getProfession (String s )
	{
	if (s.equalsIgnoreCase("doctor")) {	return new Doctor() ;}
	if (s.equalsIgnoreCase("engineer")) {	return new Engineer() ;}
	return null;
	

	}
	
	
	

}
