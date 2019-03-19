package configurations;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import id.irman.spring.trafficpanic.carpedia.classes.car.Car;
import id.irman.spring.trafficpanic.carpedia.classes.car.IndigoCar;
import id.irman.spring.trafficpanic.carpedia.classes.rarity.Rare;
import id.irman.spring.trafficpanic.carpedia.classes.rarity.Rarity;

@Configuration
//@ComponentScan("id.irman.spring.trafficpanic.carpedia")
@PropertySource("classpath:configurations/carpedia.properties")
public class CarConfig {
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	@Bean
	public Rarity rare(){
		return new Rare();
	}
	
	@Bean
	public Car indigoCar(){
		return new IndigoCar(rare());
	}
}
