package id.irman.spring.trafficpanic.carpedia.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import id.irman.spring.trafficpanic.carpedia.classes.car.*;

public class CarpediaXMLApp {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("configurations/XMLconfig.xml");
		
		YellowCar theCar = context.getBean("myYellowCar", YellowCar.class);
		
		System.out.println(theCar.getName() + " ("+ theCar.getRarity()+")");
		
		float chance = theCar.getChance();
		float value = theCar.getValue();
		
		System.out.println(theCar.getDescription(chance, value));
		context.close();
		
	}
	
}
