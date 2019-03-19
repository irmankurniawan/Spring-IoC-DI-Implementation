package id.irman.spring.trafficpanic.carpedia.classes.car;

import id.irman.spring.trafficpanic.carpedia.classes.rarity.Rarity;

public class YellowCar implements Car {

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

	public YellowCar() {
	}
	
	public void setRarity(Rarity rarity) {
		this.rarity = rarity;
	}

	@Override
	public String getName() {
		return "Yellow Car";
	}

	@Override
	public String getRarity() {
		return rarity.getRarity();
	}

	@Override
	public String getDescription(float chance, float value) {
		return "Has "+ chance + " chance producing " + value + " gold while moving.";
	}

}
