package singletonDesign;

public class SingletonClass {

	//step -1 loaded in memory for first time when the class loaded .(Private because cant access its)
	//instance directly instead we are using getter to access its instance )
	private static SingletonClass singleInstance =  new SingletonClass() ; 

//step-2
	//private constructor
	private SingletonClass() {}

//step3 
	//only getter method
	public static SingletonClass getSingleInstance() {
		return singleInstance;
	}

	public void simpleMethod() {

		System.out.println("hashcode of singleton object"  + singleInstance);
	}



}
