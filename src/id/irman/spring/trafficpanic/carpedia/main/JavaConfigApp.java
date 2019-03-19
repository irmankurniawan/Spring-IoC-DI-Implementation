package id.irman.spring.trafficpanic.carpedia.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configurations.CarConfig;
//import id.irman.spring.trafficpanic.carpedia.classes.car.Car;
import id.irman.spring.trafficpanic.carpedia.classes.car.IndigoCar;

public class JavaConfigApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CarConfig.class);
		
		IndigoCar theCar = context.getBean("indigoCar", IndigoCar.class);
		System.out.println(theCar.getName());
		System.out.println(theCar.getRarity());
		
		float chance = theCar.getChance();
		float value = theCar.getValue();
		
		System.out.println(theCar.getDescription(chance, value));
		
		context.close();

	}

}
