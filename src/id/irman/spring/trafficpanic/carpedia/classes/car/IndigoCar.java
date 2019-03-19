package id.irman.spring.trafficpanic.carpedia.classes.car;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import id.irman.spring.trafficpanic.carpedia.classes.rarity.Rarity;

@Component
public class IndigoCar implements Car {

	private Rarity rarity;
	
	@Value("${prop.chance}") 
	private float chance;
	
	@Value("${prop.value}")
	private float value;
	
	public IndigoCar(Rarity rarity) {
		this.rarity = rarity;
	}

	@Override
	public String getName() {
		return "Indigo Car";
	}

	@Override
	public String getDescription(float chance, float value) {
		return "has "+chance+" chance reduce time by "+value+"s on goal";
	}

	@Override
	public String getRarity() {
		return rarity.getRarity();
	}

	public float getChance() {
		return chance;
	}

	public float getValue() {
		return value;
	}
}
