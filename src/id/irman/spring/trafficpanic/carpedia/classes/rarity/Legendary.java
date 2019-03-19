package id.irman.spring.trafficpanic.carpedia.classes.rarity;

import org.springframework.stereotype.Component;

@Component
public class Legendary implements Rarity {

	@Override
	public String getRarity() {
		return "Legendary";
	}

}
