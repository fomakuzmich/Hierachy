package by.fomkin.homework_hierachy.bean;

import java.util.Objects;

import by.fomkin.homework_hierachy.bean.enumeration.Brand;

public class WashingMachine extends Appliance {

	private static final long serialVersionUID = 7862873266879556115L;
	
	private int capacityWash;
	
	
	public WashingMachine() {
		super();
	}

	public WashingMachine(int price, Brand brand, String model, String energyEfficiency, int height, int width, int depth, 
			int capacityWash) {
		super(price, brand, model, energyEfficiency, height, width, depth);
		this.capacityWash = capacityWash;
		}

	public int getCapacityWash() {
		return capacityWash;
	}

	public void setCapacityWash(int capacityWash) {
		this.capacityWash = capacityWash;
	}
	
	public String info() {
		
		return getPrice() + " BYN - " + getClass().getSimpleName() + " " + getBrand() + " " + getModel() + " (" + getEnergyEfficiency() + ") "
		+ getHeight() + "x" + getWidth() + "x" + getDepth()+ ", " + getCapacityWash() + "kg";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(capacityWash);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		WashingMachine other = (WashingMachine) obj;
		return capacityWash == other.capacityWash;
	}

	@Override
	public String toString() {
		return getClass().getName() + " [capacityWash=" + capacityWash + "]";
	}
	
	
	
	

}
