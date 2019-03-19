package id.irman.spring.trafficpanic.carpedia.classes.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import id.irman.spring.trafficpanic.carpedia.classes.rarity.Rarity;

@Component
public class RedCar implements Car {

	//autowiring dengan field injection
	@Autowired
	@Qualifier("legendary")
	private Rarity rarity;
	
	private float chance;
	private float value;
	
	public float getChance() {
		return chance;
	}

	public void setChance(float chance) {
		this.chance = chance;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public RedCar() {
	}

	public RedCar(float chance, float value) {
		this.chance = chance;
		this.value = value;
	}

	//autowired with setter injection (any method name)
//	@Autowired
//	public void setHeheRarity(Rarity rarity) {
//		this.rarity = rarity;
//	}
	
	//autowiring dengan constructor injection
//	@Autowired
//	public RedCar(Rarity rarity) {
//		this.rarity = rarity;
//	}

	@Override
	public String getName() {
		return "Red Car";
	}

	@Override
	public String getDescription(float chance, float value) {
		return "Has " + chance + " chance to stop building from spawning for " + value + "s";
	}

	@Override
	public String getRarity() {
		return rarity.getRarity();
	}

}
