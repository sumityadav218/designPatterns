package singletonDesign;

import factoryMethod.Doctor;

public class Main {
		
	public static void main(String[] args) {

		//after you run this class you see the Hashcode of these two objects 
		//are same because single instance of the class is created 
		
		SingletonClass singletonObject =  SingletonClass.getSingleInstance()   ;
		singletonObject.simpleMethod();

		SingletonClass singletonObject2 =  SingletonClass.getSingleInstance()   ;
		singletonObject2.simpleMethod();

		//this is example where multiple objects have mulitple hashcode means not single instance is 
		//created when i create the object .
		
		Doctor doctor = new Doctor() ; 
		System.out.println(doctor);

		Doctor doctor2 = new Doctor() ; 
		System.out.println(doctor2);
}
}
