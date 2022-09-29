package by.fomkin.homework_hierachy.bean;

import java.util.Objects;

import by.fomkin.homework_hierachy.bean.enumeration.Brand;

public class WasherDryer extends WashingMachine{

	private static final long serialVersionUID = -7703270238471054931L;
	
	private int capacityDry;

	public WasherDryer() {
		super();
	}

	public WasherDryer(int price, Brand brand, String model, String energyEfficiency, int height, int width, int depth, 
			int capacityWash, int capacityDry) {
		super(price, brand, model, energyEfficiency, height, width, depth, capacityWash);
		this.capacityDry = capacityDry;
	}

	public int getCapacityDry() {
		return capacityDry;
	}

	public void setCapacityDry(int capacityDry) {
		this.capacityDry = capacityDry;
	}
	
	public String info() {
		
		return getPrice() + " BYN - " + getClass().getSimpleName() + " " + getBrand() + " " + getModel() + " (" + getEnergyEfficiency() + ") "
					+ getHeight() + "x" + getWidth() + "x" + getDepth()+ ", " + getCapacityWash() + "kg/" + getCapacityDry() + "kg";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(capacityDry);
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
		WasherDryer other = (WasherDryer) obj;
		return capacityDry == other.capacityDry;
	}

	@Override
	public String toString() {
		return getClass().getName() + " [capacityDry=" + capacityDry + "]";
	}
	
	

}
