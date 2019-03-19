package id.irman.spring.trafficpanic.carpedia.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//import id.irman.spring.trafficpanic.carpedia.classes.car.Car;
import id.irman.spring.trafficpanic.carpedia.classes.car.RedCar;

public class CarpediaAnnotationApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("configurations/AnnotationConfig.xml");
		
		RedCar theCar = context.getBean("redCar", RedCar.class);
		
		System.out.println(theCar.getName());
		System.out.println(theCar.getRarity());
		
		theCar.setChance((float) 0.4);
		theCar.setValue(1);
		float chance = theCar.getChance();
		float value = theCar.getValue();
		
		System.out.println(theCar.getDescription(chance, value));
		context.close();
		
	}

}
